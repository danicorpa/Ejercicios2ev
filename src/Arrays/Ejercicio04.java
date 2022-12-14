package Arrays;

import java.util.Scanner;
import java.util.Arrays;
/**
 * @author Daniel Martin
 *
 * 4. Haz un programa en el que se cree un array que lea por teclado la longitud que tiene
 * que tener y a continuación lo inicialice con números aleatorios comprendidos entre 1 y
 * 10. Mostrar la suma de todos los números que se guardan en el array.
 *
 * */
public class Ejercicio04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero de 1 a 20: ");
        int size = sc.nextInt();
        int[] numeros = new int[size];
        int suma =0;
        for(int i=0;i < numeros.length;i++){

            int num = (int) (Math.random() * 10 + 1);
            numeros[i] = num;

        }
        for(int y = 0; y < numeros.length;y++){

            suma += numeros[y];

        }

        System.out.println(Arrays.toString(numeros));
        System.out.println(suma);
    }
}
