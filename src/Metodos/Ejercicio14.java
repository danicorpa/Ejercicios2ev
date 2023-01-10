package Metodos;
/*
 *
 *@author Daniel Martin Corpa
 *10/1/23
 *20:51
 *
 */


import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {

        /**
         * Ejercicio14
         * Suponiendo que hemos introducido una cadena por teclado que representa una frase
         *(palabras separadas por espacios),realiza un programa que cuente cuántas palabras tiene.
         *  1 Metodo que pida la frase.
         *  2 Metodo que calcule las palabras
         *  3 Metodo que imprima la catidad de palabras
         *
         *
         */
        imprimeCantidad();
    }

    public static String frase(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase= sc.nextLine();
        return frase;
    }


    public static int cuentaPalabras(String frase){

           int contador=0;
           for (int i= 0;i < frase.length(); i++) {

                if(frase.charAt(i)==' '){

                    contador++;

                }

            }



            return contador+1;
        }


        public static void imprimeCantidad(){

            System.out.println("Hay "+(cuentaPalabras(frase()))+" palabras.");

        }

}


