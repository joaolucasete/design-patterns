package br.inatel.joao;

import java.util.ArrayList;

public abstract class OrdenarDados {

    protected ISortAlgorithm sortAlgorithm;

    public void sort(int list[]) {
        sortAlgorithm.sort(list);
        display(list);
    }

    void display(int arr[])
    {
        for (int i=0; i<arr.length; ++i)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public ISortAlgorithm getSortAlgorithm() {
        return sortAlgorithm;
    }

    public void setSortAlgorithm(ISortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }
}
