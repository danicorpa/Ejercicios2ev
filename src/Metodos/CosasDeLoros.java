package Metodos;
/*
 *
 *@author Daniel Martin Corpa
 *9/1/23
 *19:02
 *
 */


import java.util.Scanner;

public class CosasDeLoros {

        // Crear 4 metodos
        // El primer metodo pide el peso del loro y lo devuelve
        // El segundo metodo pide la edad y la devuelva
        // El tercero metodo  calcula la cantidad de semillas que hay que darle al loro
        // con esta formula:
        // (peso del loro / 5 )*edad del loro (recibe el peso y la edad)
        // y la devuelve
        // imprime cuantas semillas hay que darle al loro diariamente

    public static void main(String[] args) {

        imprimeCantidad();

    }

    public static double pidePeso(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el peso del loro: ");
        return sc.nextDouble();

    }

    public static int pideEdad(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la edad del loro: ");
        return sc.nextInt();

    }
    // (peso del loro / 5 )*edad del loro (recibe el peso y la edad)
    public static double recibeCantidad(double p, int edad) {

        double cantidad = (p / 5) + edad;
        return cantidad;

    }
    //
    public static void imprimeCantidad(){

        System.out.print("La ración adecuada para este loro es de "+recibeCantidad(pidePeso(), pideEdad())+"gr");

    }
}
