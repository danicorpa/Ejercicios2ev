package String;
/*
 *
 *@author Daniel Martin Corpa
 *10/1/23
 *20:41
 *
 */


import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        /**
         * Ejercicio14
         * Suponiendo que hemos introducido una cadena por teclado que representa una frase
         *(palabras separadas por espacios),realiza un programa que cuente cuántas palabras tiene.
         *
         *
         */

            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce una frase: ");

            String frase= sc.nextLine();
            int contador=0;
            for (int i= 0;i < frase.length(); i++) {

                if(frase.charAt(i)==' '){

                    contador++;

                }

            }
        System.out.println("Hay "+(contador + 1)+" palabras.");
    }
}
