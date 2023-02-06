package Examen2evDoc;
/**
 * @author Daniel Martin
 *
 *
 * **/

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();
        String[] resultado = frase.split(" ");
        for (int i = 0; i < resultado.length; i++) {
            resultado[i] = resultado[i] + " " + resultado[i].length();
        }
        System.out.println(Arrays.toString(resultado));
    }
}
