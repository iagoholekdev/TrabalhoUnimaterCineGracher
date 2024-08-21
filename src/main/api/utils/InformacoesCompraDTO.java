package main.api.utils;

public class InformacoesCompraDTO {

    private String nomePessoa;

    private String cpf;

    private String nomeFilme;

    private Double valor;

    public InformacoesCompraDTO(String nomePessoa, String cpf, String nomeFilme, Double valor) {
        this.nomePessoa = nomePessoa;
        this.cpf = cpf;
        this.nomeFilme = nomeFilme;
        this.valor = valor;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public Double getValor() {
        return valor;
    }
}
