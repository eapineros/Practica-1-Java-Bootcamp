package com.mercadolibre;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        //Declaramos el objeto scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de números: ");
        int cantidadNumeros = scanner.nextInt();

        System.out.println("Ingrese la cantidad de veces que se repite el digito: ");
        int cantidadDigitos = scanner.nextInt();

        System.out.println("Ingrese el digito a repetirse: ");
        int digito = scanner.nextInt();
        int i= 0;
        while (cantidadNumeros != 0){
            if (digitos(i,cantidadDigitos,digito)) {
                System.out.print(i+", ");
                cantidadNumeros--;
            }
            i++;
        }
        scanner.close();
        //System.out.println(digitos(555,cantidadDigitos, digito));
    }
    public static boolean digitos (int num, int cantdig, int digito){
        int count = 0;
        char c = (char) (digito+'0');
        String numero = Integer.toString(num);
        for (int i = 0; i <numero.length(); i++) {
            if (numero.charAt(i) == c) {
                count++;
            }
        }
        return count == cantdig;
    }
}
