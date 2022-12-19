package ArrayList;
/*
 *
 *@author Daniel Martin Corpa
 *19/12/22
 *18:47
 *
 * 12. Rellenar aleatoriamente dos arrays (A y B) de 10 números enteros entre 1 y 10 y
 * mezclarlos en un tercero de la forma: el 1º de A, el 1º de B, el 2º de A, el 2º de B, etc.
 *
 */


public class Ejercicio12 {

    public static void main(String[] args) {
    int[] arrayA = new int[10];
    int[] arrayB = new int[10];
    int[] arrayC = new int[20];
    for(int i=0;i == arrayA.length;i++){
        arrayA[i] = (int) (Math.random()*20+1);
        arrayB[i] = (int) (Math.random()*20+1);
    }



    }
}
