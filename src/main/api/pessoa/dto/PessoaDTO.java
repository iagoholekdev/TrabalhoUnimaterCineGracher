package main.api.pessoa.dto;

import main.api.pessoa.helper.PessoaHelper;

public class PessoaDTO {

    private Long id;

    public PessoaDTO(Long id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private String nome;

    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (PessoaHelper.validaStringVazia(nome)) return;
        this.nome = nome;
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (PessoaHelper.validaStringVazia(cpf)) return;
        this.cpf = cpf;
    }

}
