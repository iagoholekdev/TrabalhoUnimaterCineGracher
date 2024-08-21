package main.api.clientecompra.dto;

import main.api.filme.dto.FilmeDTO;
import main.api.ingresso.dto.IngressoDTO;
import main.api.pessoa.dto.PessoaDTO;

public class ClienteCompraDTO {

    private Long id;

    private IngressoDTO ingresso;

    private PessoaDTO pessoa;

    private FilmeDTO filme;

    public ClienteCompraDTO(Long id, IngressoDTO ingresso, PessoaDTO pessoa, FilmeDTO filme) {
        this.id = id;
        this.ingresso = ingresso;
        this.pessoa = pessoa;
        this.filme = filme;
    }

    public Long getId() {
        return id;
    }

    public IngressoDTO getIngresso() {
        return ingresso;
    }

    public PessoaDTO getPessoa() {
        return pessoa;
    }

    public FilmeDTO getFilme() {
        return filme;
    }

}
