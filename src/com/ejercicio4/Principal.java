package com.ejercicio4;

public class Principal {

    public static void main (String[] args){
        System.out.println("------------ Ejercicio 4 >>>>>> Herencia y Polimorfismo -------------------");
        SmartPhone smartPhone = new SmartPhone("Samsung", "S10", "Azul", 8, "Android");

        SmartWatch smartWatch = new SmartWatch("Xiaomi", "Mi Band 6", "Negro", 3.5, "Bluetooth");

        System.out.println("El smartphone es: " + smartPhone + "\nEl smartwatch es: " + smartWatch);
        System.out.println("----------------------------------------------------");
    }
}
