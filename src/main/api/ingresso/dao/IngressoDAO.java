package main.api.ingresso.dao;

import main.api.filme.Filme;
import main.api.ingresso.Ingresso;
import main.api.ingresso.dto.IngressoDTO;
import main.api.utils.interfaces.CrudContract;

public class IngressoDAO implements CrudContract<IngressoDTO, Ingresso> {

    @Override
    public Ingresso create(IngressoDTO entidade) {
        return new Ingresso(1L, new Filme(entidade.getFilme().getId(), entidade.getFilme().getNome()), entidade.getSituacao());
    }

}
