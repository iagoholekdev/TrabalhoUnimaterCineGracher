package main.api.filme;


public class Filme {

    private Long id;

    private String nome;

    public Filme(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

}
