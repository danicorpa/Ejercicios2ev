package ArrayList;
/*
 *
 *@author Daniel Martin Corpa
 *19/12/22
 *17:50
 *
 *
 * 9. Realizar un programa que declare un array y lo vaya llenando de números intoducidos
 * por teclado hasta que introduzcamos un número negativo. Entonces debe imprimir los
 * elementos que contiene (el número negativo sólo sirve para finalizar el programa, no
 * entra en el array).
 */


import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio09 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arraylist= new ArrayList<>();
        int numero = 0;
        do {
            System.out.println("Introduce número negativo para acabar: ");
            numero = sc.nextInt();
            if (numero >= 0) {
                arraylist.add(numero);

            }
        }while(numero>=0 );
        System.out.println(arraylist);
    }
}
