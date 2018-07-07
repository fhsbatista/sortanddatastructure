package com.fbatista.Sorts;

import com.fbatista.GeradorVetor;

public class QuickSort {


    public static void main(String[] args){

        int[] array = GeradorVetor.getVetor();

        for(int i : array){
            System.out.print(" ," + i);

        }

        System.out.println();

        long tempoInicial = System.currentTimeMillis();
        quicksort(array, 0, array.length);
        long tempoFinal = System.currentTimeMillis() - tempoInicial;
        for(int i : array){
            System.out.print(" ," + i);

        }


        System.out.println("\nO tempo final foi de: " + tempoFinal + "ms");






    }

    private static void quicksort(int[] array, int start, int end) {
        if(start >= end) return;
        int pivo = array[start];
        int i = start;
        int j = end;

        int pivoIndex = particionar(array, start, end);


        quicksort(array, start, pivoIndex);
        quicksort(array, pivoIndex + 1, end);



        }

    private static int particionar(int[] array, int start, int end) {

        int pivo = array[start];
        int i = start;
        int j = end;


        while(i < j) {

            while((i < j) && (array[--j] >= pivo));
            array[i] = array[j];

            while((i < j) && (array[++i] <= pivo));
            array[j] = array[i];


        }

        array[j] = pivo;

        return j;



    }


}



