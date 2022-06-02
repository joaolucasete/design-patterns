package br.inatel.joao.interfaces;

import br.inatel.joao.impl.Observavel;

public interface IObservador {
    void update(Observavel palavra);
}
