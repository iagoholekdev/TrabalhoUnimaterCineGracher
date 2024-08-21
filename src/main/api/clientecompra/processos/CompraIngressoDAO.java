package main.api.clientecompra.processos;

import main.api.clientecompra.ClienteCompra;
import main.api.filme.Filme;
import main.api.ingresso.Ingresso;
import main.api.pessoa.Pessoa;

public class CompraIngressoDAO {

    private final Ingresso ingresso;

    private final Pessoa pessoa;

    private final Filme filme;

    private final Double valor;

    private final Long id;

    public CompraIngressoDAO(Ingresso ingresso, Pessoa pessoa, Double valor, Filme filme, Long id) {
        this.ingresso = ingresso;
        this.pessoa = pessoa;
        this.valor = valor;
        this.filme = filme;
        this.id = id;
    }


    public ClienteCompra create() {
        return new ClienteCompra(id, ingresso, pessoa, filme, valor);
    }

}
