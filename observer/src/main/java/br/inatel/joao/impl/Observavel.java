package br.inatel.joao.impl;

import br.inatel.joao.interfaces.IObservavel;

import java.util.ArrayList;

public class Observavel implements IObservavel {
    private String frase;
    private ArrayList<Observador> clientes;

    public Observavel(String frase) {
        this.frase = frase;
        clientes = new ArrayList<Observador>();
    }

    @Override
    public void registraObservador(Observador obs) {
        clientes.add(obs);
    }

    @Override
    public void removeObservador(Observador obs) {
        if (clientes.contains(obs))
            clientes.remove(obs);
    }

    @Override
    public void notificaObservadores() {
        for (Observador observador : clientes) {
            observador.update(this);
        }
    }

    //Esse método é chamado sempre que os valores
    //se modificacam
    private void novasMedidas() {
        notificaObservadores();
    }

    public int getQuantidadePalavras() {
        return frase.split(" ").length;
    }

    public int getQuantidadePalavrasPares() {
        int count = 0;
        String[] palavras = frase.split(" ");
        for (int i = 0; i < palavras.length - 1; i++) {
            if (palavras[i].length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public int getQuantidadePalavraComecadasMaiusculo() {
        int count = 0;
        String[] palavras = frase.split(" ");
        for (int i = 0; i < palavras.length - 1; i++) {
            char c = palavras[i].toCharArray()[0];
            if (c >= 65 && c <= 90)
                count++;
        }

        return count;
    }

    public void setClientes(ArrayList<Observador> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Observador> getClientes() {
        return clientes;
    }
}
