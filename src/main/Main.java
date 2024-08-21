package main;

import main.api.clientecompra.ClienteCompra;
import main.api.clientecompra.processos.CompraIngressoDAO;
import main.api.clientecompra.processos.controller.CompraClienteController;
import main.api.filme.Filme;
import main.api.filme.dto.FilmeDTO;
import main.api.ingresso.Ingresso;
import main.api.ingresso.dao.IngressoDAO;
import main.api.ingresso.dto.IngressoDTO;
import main.api.ingresso.enums.IngressoEnum;
import main.api.pessoa.Pessoa;
import main.api.pessoa.dao.PessoaDAO;
import main.api.pessoa.dto.PessoaDTO;
import main.api.sessao.SessaoFilme;
import main.api.utils.InformacoesCompraDTO;
import main.api.utils.consts.NumericUtils;

import java.util.Objects;

import java.util.concurrent.atomic.AtomicLong;

public class Main {

    public static void main(String[] args) throws Exception {
        AtomicLong atomicInteger = new AtomicLong(NumericUtils.LONG_UM);
        SessaoFilme sessaoFilme = new SessaoFilme(atomicInteger.get(), null);
        CompraClienteController controllerCompra = new CompraClienteController();
        while (!Objects.equals(sessaoFilme.getContador(), NumericUtils.ZERO)) {
            InformacoesCompraDTO informacoesCompraDTO = new CompraClienteController().cadastrarIngresso();
            Pessoa pessoa = new PessoaDAO().create(
                    new PessoaDTO(atomicInteger.get(), informacoesCompraDTO.getNomePessoa(), informacoesCompraDTO.getCpf())
            );
            Ingresso ingresso = new IngressoDAO().create(
                    new IngressoDTO(atomicInteger.get(), new FilmeDTO(atomicInteger.get(), informacoesCompraDTO.getNomeFilme()), IngressoEnum.PAGO)
            );
            Filme filme = ingresso.getFilme();
            ClienteCompra clienteCompra = new CompraIngressoDAO(ingresso, pessoa, informacoesCompraDTO.getValor(), filme, atomicInteger.get()).create();
            sessaoFilme.setFilme(filme);
            controllerCompra.imprimirPedido(clienteCompra);
            sessaoFilme.decrementaContandor();
            atomicInteger.incrementAndGet();
        }
        System.out.println("Ingressos esgotados!");
    }

}
