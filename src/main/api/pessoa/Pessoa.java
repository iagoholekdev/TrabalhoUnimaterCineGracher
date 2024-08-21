package main.api.pessoa;

public class Pessoa {

    private Long id;

    private String nome;

    private String cpf;

    public Pessoa(Builder builder) {
        this.id = builder.id;
        this.nome = builder.nome;
        this.cpf = builder.cpf;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public static class Builder {
        private Long id;

        private String nome;

        private String cpf;

        public Long getId() {
            return id;
        }

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public String getNome() {
            return nome;
        }

        public Builder setNome(String nome) {
            this.nome = nome;
            return this;
        }

        public String getCpf() {
            return cpf;
        }

        public Builder setCpf(String cpf) {
            this.cpf = cpf;
            return this;
        }

        public Pessoa build() {
            return new Pessoa(this);
        }
    }

}
