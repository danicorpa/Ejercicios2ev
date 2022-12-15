package Arrays;
/*
 *
 *@author Daniel Martin Corpa
 *14/12/22
 *19:23
 *
 *  8. Realizar un programa que pida un tamaño de array por teclado y a continuación cree un
 *  array formado por elementos aleatorios pares entre 1 y 50.
 *
 */


import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio08 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = 0;
        int[] pares;
        int i = 0;
        do {
            System.out.println("Inserta el tamaño del array: ");
            size = sc.nextInt();

        } while (size <= 0);
        pares = new int[size];
        while (i < pares.length) {
            int numero = (int) (Math.random() * 50 + 1);
            if ( numero %2 == 0 ) {
                pares[i] = numero;
                i++;
            }




        }
        System.out.println(Arrays.toString(pares));
    }
}