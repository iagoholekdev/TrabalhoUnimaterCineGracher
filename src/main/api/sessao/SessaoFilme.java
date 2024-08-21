package main.api.sessao;

import main.api.filme.Filme;
import main.api.utils.consts.NumericUtils;

import java.util.Objects;

public class SessaoFilme {

    private Long id;

    public static final Integer NUMERO_MAXIMO = 2;

    private Integer contador = NUMERO_MAXIMO;

    private Filme filme;

    public SessaoFilme(Long id, Filme filme) {
        this.id = id;
        this.filme = filme;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getContador() {
        return contador;
    }

    public void decrementaContandor() {
        if (Objects.equals(this.contador, NumericUtils.ZERO)) return;
        this.contador--;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

}
