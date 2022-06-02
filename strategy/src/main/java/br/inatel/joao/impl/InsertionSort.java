package br.inatel.joao.impl;

import br.inatel.joao.ISortAlgorithm;

public class InsertionSort implements ISortAlgorithm {
    void insertionSort(int arr[], int n)
    {
        if (n <= 1)                             //passes are done
        {
            return;
        }

        insertionSort( arr, n-1 );        //one element sorted, sort the remaining array

        int last = arr[n-1];                        //last element of the array
        int j = n-2;                                //correct index of last element of the array

        while (j >= 0 && arr[j] > last)                 //find the correct index of the last element
        {
            arr[j+1] = arr[j];                          //shift section of sorted elements upwards by one element if correct index isn't found
            j--;
        }
        arr[j+1] = last;                            //set the last element at its correct index
    }

    @Override
    public void sort(int[] list) {
        insertionSort(list, list.length);
    }
}
