package br.inatel.joao.interfaces;

import br.inatel.joao.impl.Observador;

public interface IObservavel {

    void registraObservador(Observador obs);
    void removeObservador(Observador obs);
    void notificaObservadores();
}
