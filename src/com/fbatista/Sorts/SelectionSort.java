package com.fbatista.Sorts;

public class SelectionSort {

    public static void main(String[] args){
        int[] array = {2,3,2,1,6,5,2,3,5,7,19};

        //2 3 2 1 6 5 2 3 5 7 19
        for(int unsortedPartitionIndex = array.length - 1; unsortedPartitionIndex > 0; unsortedPartitionIndex--){

            int selectionIndex = 0;


            for(int i = 0; i<=unsortedPartitionIndex; i++){

                if(array[i] > array[selectionIndex])
                    selectionIndex = i;

            }
            swap(array, selectionIndex, unsortedPartitionIndex);
        }

        for(int i : array){
            System.out.print(" ," + i);

        }

    }

    public static void swap(int[] array, int i, int j){
        //Verifica se o i e igual a j, caso seja, nao e necessario fazer a troca
        if(i==j) return;

        int aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }
}
