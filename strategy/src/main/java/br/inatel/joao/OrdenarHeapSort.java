package br.inatel.joao;

import br.inatel.joao.impl.HeapSort;

public class OrdenarHeapSort extends OrdenarDados {
    public OrdenarHeapSort() {
        sortAlgorithm = new HeapSort();
    }
}
