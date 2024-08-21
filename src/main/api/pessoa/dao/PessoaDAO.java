package main.api.pessoa.dao;

import main.api.pessoa.Pessoa;
import main.api.pessoa.dto.PessoaDTO;
import main.api.utils.interfaces.CrudContract;

public class PessoaDAO implements CrudContract<PessoaDTO, Pessoa> {


    @Override
    public Pessoa create(PessoaDTO entidade) {
       return new Pessoa
               .Builder()
                   .setId(entidade.getId())
                   .setNome(entidade.getNome())
                   .setCpf(entidade.getCpf())
               .build();
    }

}
