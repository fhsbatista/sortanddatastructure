package com.fbatista.Sorts;

import com.fbatista.GeradorVetor;

public class InsertionSort {

    public static void main(String[] args){


        int[] array = GeradorVetor.getVetor();
        System.out.println("\n");
        for(int i : array){
            System.out.print(" ," + i);

        }
        long tempoInicial = System.currentTimeMillis();

        for(int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++){
            int newElement = array[firstUnsortedIndex];
            int i;
            for(i = firstUnsortedIndex; i > 0; i--){

                if(newElement < array[i - 1])
                    array[i] = array[i -1];
                else
                    break;
            }
            array[i] = newElement;



        }

        long tempoFinal = System.currentTimeMillis() - tempoInicial;

        System.out.println("\n");
        for(int i : array){
            System.out.print(" ," + i);

        }

        System.out.println("\nO tempo final foi de: " + tempoFinal + "ms");




    }



}
