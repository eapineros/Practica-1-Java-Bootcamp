package com.mercadolibre;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        //Declaramos el objeto scanner
        Scanner scanner = new Scanner(System.in);

        //capturamos la cantidad de enteros
        System.out.println("Ingrese el nùmero del cual quiera ver sus multiplos: ");
        int m = scanner.nextInt();
        System.out.println("Cuantos multiplos quiere ver: ");
        int n = scanner.nextInt();

        int i = 0;

        //evaluamos los números enteros
        System.out.println("los primeros "+n+" múltiplos de "+m);
        while (n != 0){
            if (i%2 == 0) {
                System.out.print(i+", ");
                n--;
            }
            i++;
        }
    }
}
