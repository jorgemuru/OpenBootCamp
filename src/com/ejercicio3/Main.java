package com.ejercicio3;

public class Main {

    public static void main(String[] args) {
        String[] textos = new String[]{"Cadena 1", "Cadena 2", "Cadena 3", "Cadena 4", "Cadena 5"};

        System.out.println("------------ Ejercicio 3 >>>>>> Listado de items de un Array -------------------");
        //Imprimo los items del array
        for (int i = 0; i < textos.length; i++) {
            System.out.print(textos[i] + " ");
        }
        System.out.println("");
        System.out.println("----------------------------------------------------");
    }
}