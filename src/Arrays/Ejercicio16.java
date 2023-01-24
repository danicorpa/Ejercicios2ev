package Arrays;
/*
 *
 *@author Daniel Martin Corpa
 *24/1/23
 *20:39
 *
 */


import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {

        /**
         * 16. Crear un programa que rellene aleatoriamente un array de 10 números enteros y a
         * continuación pedir por teclado una posición (entre 0 y 9). Eliminar el elemento situado
         * en la posición dada sin dejar huecos.
         *
         * */
        ArrayList<Integer> enteros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for(int i=0; i < 10;i++){
            enteros.add((int) (Math.random() *100));

        }
        System.out.println("El array original es: "+enteros);
        int indice = 0;
        do{
            System.out.println("Indice del elemento a eliminar (0/9): ");
            indice = sc.nextInt(); sc.nextLine();
            if(indice < 0 || indice > enteros.size()){

                System.out.println("El numero tiene que estar entre 0 y 9, mendrugo!!");
            }
        }while(indice < 0 || indice >9);
        enteros.remove(indice-1);
        System.out.println("El array nuevo es: "+enteros);

    }
}
