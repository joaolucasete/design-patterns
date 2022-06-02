package br.inatel.joao.impl;

import br.inatel.joao.interfaces.IObservador;

public class Observador implements IObservador {

    int id;

    public Observador(int id) {
        this.id = id;
    }

    @Override
    public void update(Observavel palavra) {
        String frase = "Hello Guys, how are you";
        System.out.println("Quantidade de palavras: " + palavra.getQuantidadePalavras());
        System.out.println("Quantidade de palavras com caracteres pares: " + palavra.getQuantidadePalavrasPares());
        System.out.println("Quantidade de palavras comecadas com maiusculo: " + palavra.getQuantidadePalavraComecadasMaiusculo());
    }
}
