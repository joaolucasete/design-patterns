package br.inatel.joao;

import br.inatel.joao.impl.HeapSort;
import br.inatel.joao.impl.InsertionSort;
import br.inatel.joao.impl.MergeSort;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

public class TestOrdernarDados {

    OrdenarDados ordernarDados;

    @Test
    public void testeOrdernarHeapSort() {
        ordernarDados = new OrdenarHeapSort();
        assertTrue(ordernarDados.getSortAlgorithm() instanceof HeapSort);
    }

    @Test
    public void testeOrdernarInsertionSort() {
        ordernarDados = new OrdenarInsertionSort();
        assertTrue(ordernarDados.getSortAlgorithm() instanceof InsertionSort);
    }

    @Test
    public void testeOrdernarMergeSort() {
        ordernarDados = new OrdenarMergeSort();
        assertTrue(ordernarDados.getSortAlgorithm() instanceof MergeSort);
    }

    @Test
    public void testeOrdernarDados() {
        ordernarDados = new OrdenarMergeSort();
        int arr[] = {5, 2, 1};
        int expected[] = {1, 2, 5};
        ordernarDados.sort(arr);
        
        assertArrayEquals(expected, arr);
    }

}
