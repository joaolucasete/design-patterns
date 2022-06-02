package br.inatel.joao;

import br.inatel.joao.impl.Observador;
import br.inatel.joao.impl.Observavel;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestObserver {

    @Test
    public void testeInscritos() {
        Observavel palavra = new Observavel("Hello Guys, how are you");
        Observador obs1 = new Observador(1);
        palavra.registraObservador(obs1);

        assertTrue(!palavra.getClientes().isEmpty());
    }

    @Test
    public void testeContagemPalavras() {
        Observavel palavra = new Observavel("Hello Guys");
        Observador obs1 = new Observador(1);
        palavra.registraObservador(obs1);

        assertEquals(2, palavra.getQuantidadePalavras());
    }

    @Test
    public void testeContagemPalavrasCaracteresPares() {
        Observavel palavra = new Observavel("oi pessoal");
        Observador obs1 = new Observador(1);
        palavra.registraObservador(obs1);

        assertEquals(1, palavra.getQuantidadePalavrasPares());
    }

    @Test
    public void testeContagemPalavrasComecadasMaiusculo() {
        Observavel palavra = new Observavel("Oi pessoal");
        Observador obs1 = new Observador(1);
        palavra.registraObservador(obs1);

        assertEquals(1, palavra.getQuantidadePalavraComecadasMaiusculo());
    }
}
