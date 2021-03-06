package com.mercadolibre;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Ingrese el número que desea validar: ");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (esPrimo(n)){
            System.out.println("Es primo");
        }else{
            System.out.println("No es primo");
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
