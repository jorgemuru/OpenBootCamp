package com.ejercicio5;

public class Principal {

    public static void main (String[] args){
        System.out.println("------------ Ejercicio 5 >>>>>> Interfaces -------------------");
        CocheCRUD cocheCrud = new CocheCRUDImpl();
        System.out.println(cocheCrud);
        System.out.println("----------------------------------------------------");

    }
}
