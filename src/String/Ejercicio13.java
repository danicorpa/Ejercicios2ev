package String;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        /**
         * @author: Daniel Martin corpa
         * Ejercicio 11
         * Realizar un programa que lea una cadena por teclado y convierta las mayúsculas a
         * minúsculas y viceversa.
         *
         * **/
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserta un palíndromo y te lo invierto: ");
        String cadena = sc.nextLine();
        String invertida="";
        cadena = cadena.replace(" ","");
        for(int i=cadena.length()-1;i>=0;i--){


          invertida += cadena.charAt(i);


        }
        if(cadena.equals(invertida)) {
            System.out.println(invertida + " Es un palíndromo");
        }
    }
}
