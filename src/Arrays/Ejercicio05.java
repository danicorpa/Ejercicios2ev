package Arrays;

import java.util.Arrays;

/**
 * @author Daniel Martin
 *
 * 5. Hacer un programa que inicialice una lista de números con valores aleatorios (10
 * valores), y los muestre ordenados de menor a mayor.
 *
 *
 * **/
public class Ejercicio05 {


    public static void main(String[] args) {

        int[] numeros = new int[10];
        for(int i=0;i <numeros.length;i++){

            numeros[i] = (int) (Math.random() *10 +1);

        }
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));


    }
}
