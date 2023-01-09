package Metodos;
/*
 *
 *@author Daniel Martin Corpa
 *9/1/23
 *17:49
 *
 */


import java.util.Scanner;

public class EjemplosMetodos {

    public static void main(String[] args) {
        String nombre = "Daniel";
        int longitud = devuelveLongitud();
        imprimeNombre(nombre);
        System.out.println();
        System.out.println(longitud);
        devuelveLongitud2(nombre);
        System.out.println(devuelveNombre());
    }

    // aqui escribimos los metodos que vayamos a autilizar
    // a los otros metodos los llamamos desde el metodo main
    // public static tipoQueDevuelve nombreDelMetodo(parametros){}
    public static void imprimeNombre(String n){

        System.out.println(n);

    }
    public static int devuelveLongitud(){

        String llamada = "Daniel";
        return llamada.length();
    }
    public static void devuelveLongitud2(String n){

        System.out.println("El tamaños del Nombre es: "+n.length());

    }
    // declara un metodo que no reciba nada, pregunta un nimbre y lo devuelve

    public static String devuelveNombre(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Inserta un nombre. ");
        String nombre = sc.nextLine();

        return nombre;

    }
}
