package main.api.ingresso.dto;

import main.api.filme.dto.FilmeDTO;
import main.api.ingresso.enums.IngressoEnum;

public class IngressoDTO {

    private Long id;

    private FilmeDTO filme;

    public Long getId() {
        return id;
    }

    public FilmeDTO getFilme() {
        return filme;
    }

    public IngressoEnum getSituacao() {
        return situacao;
    }

    private IngressoEnum situacao;

    public IngressoDTO(Long id, FilmeDTO filme, IngressoEnum situacao) {
        this.id = id;
        this.filme = filme;
        this.situacao = situacao;
    }

}
