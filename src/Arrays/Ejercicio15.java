package Arrays;
/*
 *
 *@author Daniel Martin Corpa
 *24/1/23
 *20:14
 *
 */


import java.util.Arrays;

public class Ejercicio15 {

    public static void main(String[] args) {
        /**
         * 15. Crear un programa que rellene aleatoriamente un array de 10 números enteros y a
         * continuación desplace sus elementos una posición hacia la derecha (el último pasa a ser
         * el primero).
         *
         * **/

        int[] enteros = new int[10];

        for(int i=0; i < enteros.length;i++){
            enteros[i] = (int) (Math.random() *100);
        }
        System.out.println("El array original: "+Arrays.toString(enteros));
        System.out.println("El array cambiado es: "+Arrays.toString(desplaza(enteros)));

    }
    public static int[] desplaza(int[] enteros){
        // con el método clone hago una copia del array
        int[] solucion = new int[10];
        solucion[0] = enteros[enteros.length - 1];
        for(int i = 0;i < enteros.length-1;i++ ){
            solucion[i + 1] = enteros[i];
        }

        return solucion;
    }
}
