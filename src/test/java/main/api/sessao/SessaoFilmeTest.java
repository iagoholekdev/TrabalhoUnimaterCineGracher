package main.api.sessao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SessaoFilmeTest {

    @Test
    @DisplayName("Teste do decrementador")
    void decrementaContandor() {
        SessaoFilme sessaoFilme = new SessaoFilme(1L, null);
        Assertions.assertEquals(sessaoFilme.getContador(), SessaoFilme.NUMERO_MAXIMO);
        sessaoFilme.decrementaContandor();
        Assertions.assertEquals(sessaoFilme.getContador(), SessaoFilme.NUMERO_MAXIMO-1);
    }

}