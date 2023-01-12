package Arrays;
/*
 *
 *@author Daniel Martin Corpa
 *12/1/23
 *20:13
 *
 */


import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        /**
         * 14. Diseñar una aplicación que declare un array de 10 elementos enteros. Debe declarar 8 números aleatorios.
         * Después se debe pedir un número y una posición, insertarlo en la posición indicada, desplazando los que
         * estén detrás.
         *
         * **/
        int[] enteros = new int[10];

        for (int i=0;i < enteros.length;i++){
            enteros[i] = (int) (Math.random() * 10 + 1);

        }
        System.out.println(Arrays.toString(enteros));
        //pedimos un numero y una posicion
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero a insertar: ");
        int n = sc.nextInt();
        sc.nextLine();
        // Controlamos la posicion del array para que no quede fuera
        int pos = 0;
        do{
            System.out.println("En que posision lo quieres insertar: ");
            pos = sc.nextInt() -1;

        }while(pos > enteros.length);
        int arr2[] = new int[enteros.length];
        for (int i=0, j=0;i < enteros.length;i++){
            if (pos == i){
                arr2[i]=n;
            }else{
                arr2[i]=enteros[j];
                j++;
            }

        }
        System.out.println(Arrays.toString(arr2));
    }

}
