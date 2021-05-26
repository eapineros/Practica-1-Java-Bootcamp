package com.mercadolibre;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        //Declaramos el objeto scanner
        Scanner scanner = new Scanner(System.in);

        //capturamos la cantidad de enteros
        System.out.println("Cuantos Numeros primos quiere ver: ");
        int n = scanner.nextInt();
        int i = 0;

        System.out.println("Los "+n+" primeros números primos son: ");
        while (n != 0){
            if (esPrimo(i)){
                System.out.print(i+", ");
                n--;
            }
            i++;
        }
        scanner.close();
    }
    public static boolean esPrimo(int x){
        int j = 0;
        for (int i = 1; i <= x; i++) {
            if(x%i == 0) {
                j++;
            }
        }
        return j == 2;
    }

}
