package com.fbatista;

import java.util.Random;

public class GeradorVetor {



    public static int[] getVetor(){

        int[] array = new int[30000000];
        System.out.println("Começando a gerar os numeros");
        for(int i = 0; i<array.length; i++){
            Random random = new Random();
            array[i] = random.nextInt(10000);
        }
        System.out.println("Geraçao dos numeros terminada");
        return array;



    }




}
