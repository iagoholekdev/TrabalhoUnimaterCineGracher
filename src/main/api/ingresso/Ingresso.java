package main.api.ingresso;

import main.api.filme.Filme;
import main.api.ingresso.enums.IngressoEnum;

public class Ingresso {

    public Ingresso(Long id, Filme filme, IngressoEnum situacao) {
        this.id = id;
        this.filme = filme;
        this.situacao = situacao;
    }

    private Long id;

    private Filme filme;

    private IngressoEnum situacao;

    public Long getId() {
        return id;
    }

    public Filme getFilme() {
        return filme;
    }

    public IngressoEnum getSituacao() {
        return situacao;
    }

}
