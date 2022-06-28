package com.ejercicio1;

public class Main {
    public static void main (String[] args){
        //Tipos numericos
        byte num1 = 11;
        short num2 = 25;
        int num3 = 709;
        long num4 = 100000000;
        float dec1 = 3.7f;
        double dec2 = 25.99d;
        System.out.println("----------- Datos Numericos ------------");
        System.out.println("a.- byte: " + num1);
        System.out.println("b.- short: " + num2);
        System.out.println("c.- int: " + num3);
        System.out.println("d.- long: " + num4);
        System.out.println("e.- float: " + dec1);
        System.out.println("f.- double: " + dec2);
        System.out.println("-----------------------------------------");

        //Tipos caracter
        String nombre = "Luis";
        String apellido = "SUAREZ";
        char caracter = 'X';
        System.out.println("----------- Datos alfanumericos ------------");
        System.out.println("1.- Nombre: " + nombre);
        System.out.println("2.- Apellido: " + apellido);
        System.out.println("3.- Un caracter: " + caracter);
        System.out.println("-----------------------------------------");

        //Tipos booleanos
        boolean verdadero = true;
        boolean falso = false;
        System.out.println("----------- Datos booleanos ------------");
        if(verdadero){
            System.out.println("La variable VERDADERO es TRUE)");
        }
        if(!falso){
            System.out.println("La variable FALSO es falsa)");
        }
        System.out.println("-----------------------------------------");

    }
}
