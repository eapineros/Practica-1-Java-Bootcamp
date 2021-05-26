package com.mercadolibre;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        System.out.println("Ingrese el número que desea conocer los multiplos: ");

        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();

        System.out.println("Ingrese la cantidad de multiplos que desea conocer: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= m; i++) {
            if(m%i == 0 && n!=0){
                System.out.print(i+", ");
                n--;
            }
        }
        scanner.close();
    }
}
