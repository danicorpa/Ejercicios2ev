package String;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        /***
         *
         * @author: Daniel Martin Corpa
         *
         * Ejercicio 10
         * Pide una cadena y dos caracteres por teclado y sustituye la aparición del primer carácter en
         * la cadena por el segundo carácter.
         *
         * **/

        Scanner sc = new Scanner(System.in);
        System.out.println("Mete una cadena y dos caracteres: ");
        String cadena=sc.nextLine();
        String char1=sc.nextLine();
        String char2=sc.nextLine();
        String resultado="";
        System.out.println(cadena.replace(char1,char2));

    }
}
