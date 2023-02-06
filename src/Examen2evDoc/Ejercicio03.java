package Examen2evDoc;
/**
 * @author Daniel Martin
 *
 *
 * **/

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();
        String solucion = "";
        for (int i = 0; i < frase.length() - 1; i++) {
            if (frase.substring(i, i+1).equals("-") || frase.substring(i, i+1).equals("_")) {
                solucion = solucion + "";
                String mayuscula = frase.substring(i+1, i+2).toUpperCase();
                solucion = solucion + mayuscula;
                i++;
            } else {
                solucion = solucion + frase.substring(i, i+1);
            }
        }
        solucion = solucion + frase.substring(frase.length() -1);
        System.out.println(solucion);
    }
}
