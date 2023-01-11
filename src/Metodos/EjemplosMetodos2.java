package Metodos;
/*
 *
 *@author Daniel Martin Corpa
 *11/1/23
 *18:36
 *
 */


public class EjemplosMetodos2 {

    public static void main(String[] args) {
       imprimir("Hola");
        System.out.println(" ");
       imprimir(5);
        System.out.println(" ");
       imprimir(5,"Hola");
        System.out.println(" ");
       imprimir("Hola",6);

    }

    public static void imprimir(String s) {
        System.out.println(s);
    }
    public static void imprimir(String s, int veces) {
        for (int i = 0; i < veces; i++) {
            System.out.println(s);
        }
    }
    public static void imprimir(int veces, String s) {
        for (int i = 0; i < veces; i++) {
            System.out.println(s);
        }
    }
    public static void imprimir(int val) {
        System.out.println(val);
    }
}
