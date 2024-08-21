package main.api.filme.dto;

public class FilmeDTO {

    private Long id;

    private String nome;

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public FilmeDTO(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }
}
