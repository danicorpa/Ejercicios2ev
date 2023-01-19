package String;
/*
 *
 *@author Daniel Martin Corpa
 *19/1/23
 *20:16
 *
 */


import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
            /**
             * Ejercicio 12
             * Realizar un programa que compruebe si una cadena contiene una subcadena. Las dos
             * cadenas se introducen por teclado.
             *
             * **/
            Scanner sc = new Scanner(System.in);
            String cadena1 = sc.nextLine();
            String cadena2 = sc.nextLine();

            boolean resultado = contieneSubcadena(cadena1,cadena2);
            if(resultado) {
                System.out.println("SI");

            }else {

                System.out.println("NO");
        }

    }
    public static boolean contieneSubcadena(String cadena1, String cadena2){
        boolean esta=false;
        if (cadena1.contains(cadena2)){

            return true;

        }
        return false;

    }
}
