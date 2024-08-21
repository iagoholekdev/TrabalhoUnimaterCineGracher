package main.api.clientecompra;

import main.api.filme.Filme;
import main.api.ingresso.Ingresso;
import main.api.pessoa.Pessoa;

public class ClienteCompra {

    private final Long id;

    private final Pessoa pessoa;

    private final Filme filme;

    private final Double valor;

    private final Ingresso ingresso;

    public ClienteCompra(Long id, Ingresso ingresso, Pessoa pessoa, Filme filme, Double valor) {
        this.id = id;
        this.pessoa = pessoa;
        this.filme = filme;
        this.valor = valor;
        this.ingresso = ingresso;
    }

    public Ingresso getIngresso() {
        return ingresso;
    }

    public Long getId() {
        return id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public Filme getFilme() {
        return filme;
    }

    public Double getValor() {
        return valor;
    }


}
