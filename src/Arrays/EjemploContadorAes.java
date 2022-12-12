package Arrays;

import java.util.Scanner;
import java.util.Arrays;

/**
 * @author Daniel Martin
 * */
public class EjemploContadorAes {

    public static void main(String[] args) {

        // crear un programa que pida 10 letras por teclado,
        // las vaya guardando en un array de caracteres

        // luego pida un caracter, y luego muestre cuantas veces aparece ese caracter.

        Scanner sc = new Scanner(System.in);
        char[] caracteres = new char[10];
        for (int i = 0;i < caracteres.length;i++) {
            caracteres[i] = sc.next().charAt(0);
        }
        System.out.println(Arrays.toString(caracteres));

        System.out.println("Que caracter quieres que cuente?:");


        int contador = 0;
        char c = sc.next().charAt(0);
        for (char ch:caracteres){

            if(ch == c){
                contador++;
            }

        }
        System.out.println(contador);

    }
}
