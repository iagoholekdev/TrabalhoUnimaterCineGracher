package main.api.pessoa.helper;

import main.api.utils.consts.StringUtils;

public class PessoaHelper {

    private PessoaHelper() {

    }

    public static boolean validaStringVazia(String valor) {
        return StringUtils.STRING_VAZIA.equals(valor);
    }

}
