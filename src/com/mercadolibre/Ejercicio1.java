package com.mercadolibre;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        //Declaramos el objeto scanner
        Scanner scanner = new Scanner(System.in);

        //capturamos la cantidad de enteros
        System.out.println("Cuantos Numeros enteros quiere ver: ");
        int n = scanner.nextInt();
        int i = 0;

        //evaluamos los números enteros
        System.out.println("Los "+n+" primeros números pares son: ");
        while (n != 0){
            if (i%2 == 0) {
                System.out.print(i+", ");
                n--;
            }
            i++;
        }
        scanner.close();
    }
}
