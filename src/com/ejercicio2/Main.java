package com.ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("-------------- Ejercicio 2 >>>> Calcular IVA --------------");
        System.out.println("Ingrese un valor mayor a CERO: ");
        int valor = scanner.nextInt();
        if (valor <= 0){
            System.out.println("!!!!!!!!!!!Debe ingresar un valor mayor a CERO!!!!!!!");
        }else {
            double iva = calcularIva(valor);
            double resultado = valor + iva;
            System.out.println("El IVA de " + valor + " es " + iva);
            System.out.println("El importe TOTAL es de : " + resultado);
            System.out.println("-------------------------------------------------");
        }
    }

    private static double calcularIva (int pValor){
        double elIva = 0;
        elIva = pValor * 0.21;

        return elIva;
    }
}
