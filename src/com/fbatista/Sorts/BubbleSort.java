package com.fbatista.Sorts;

import com.fbatista.GeradorVetor;

public class BubbleSort {

    public static void main(String[] args){


        int[] array = GeradorVetor.getVetor();

        for(int i : array){
            System.out.print(", " + i);
        }

        long tempoInicial = System.currentTimeMillis();

        for(int ultimoElementoNaoOrganizado = array.length - 1; ultimoElementoNaoOrganizado > 0; ultimoElementoNaoOrganizado--){

            for(int i = 0; i < ultimoElementoNaoOrganizado; i++){
                if(array[i] > array[i+1])
                    swap(array, i, i+1);
            }
        }
        long tempoFinal = System.currentTimeMillis() - tempoInicial;

        System.out.println("\n");
        for(int i : array){
            System.out.print(" ," + i);

        }
        System.out.println("\nO tempo final foi de: " + tempoFinal + "ms");




    }

    public static void swap(int[] array, int i, int j){
        //Verifica se o i e igual a j, caso seja, nao e necessario fazer a troca
        if(i==j) return;

        int aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }

}
