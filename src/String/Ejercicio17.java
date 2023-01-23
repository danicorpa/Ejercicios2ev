package String;
/*
 *
 *@author Daniel Martin Corpa
 *23/1/23
 *18:34
 *
 */


import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {

        /**
         * Ejercicio 17
         * Realiza una aplicación que solicite por pantalla una serie de números (salimos pulsando 0) y
         * los guarde en una cadena de texto separados por un espacio. Por ejemplo, si el usuario
         * introduce el 2, el 13 y el 235, el programa los almacena como “2 13 235” y lo pinta en la
         * pantalla.
         * ***/
        // Si quiero cambiar un String a entero, tengo que usar int a = Integer.parseInt(n1);
        // Si quiero cambiar un entero a String, tengo que hacer String num = String.valueOf(a);

        Scanner sc = new Scanner(System.in);
        int n = 0;
        String cadena ="";
        do{
            System.out.println("Istroduce un numero: ");
            n = sc.nextInt();
            if (n != 0) {
                String num = String.valueOf(n);
                cadena += num + " ";
            }
        }while(n != 0);
        System.out.println(cadena);
    }
}
