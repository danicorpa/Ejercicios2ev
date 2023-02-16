package Examen2evDoc.ExamenCasa;
/*
 *
 *@author Daniel Martin Corpa
 *16/2/23
 *10:59
 *
 */


import java.lang.reflect.Array;
import java.util.Arrays;

public class Ejercicio01Method {
    /**
     * Crea un array bidimensional de tamaño 5x5 de números enteros, rellénalo de aleatorios de 0 a 9 e immprime el resultado.
     * <p>
     * A continuación, crea otro array de caracteres del mismo tamaño y rellénalo de forma que si en el array de enteros el número
     * es par ponga 'P' y si es impar ponga 'I'.
     * Imprime el resultado
     **/
    public static void main(String[] args) {


        devuelveChar(devuelveNumeros());


    }

    /**
     * Devuelve un array enteros de tamaño 5x5 relleno con numeros aleatorios
     *
     * @return num: array de entros aleatorios
     */
    public static int[][] devuelveNumeros() {
        int num[][] = new int[5][5];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = (int) (Math.random() * 10);
            }
        }
        return num;
    }

    /**
     * Devuevle un array de char relleno con 'I' si numero es impar y 'P' si numero es par
     *
     * @param num: array de enteros
     *
     */
    public static void devuelveChar(int[][] num) {
        char[][] c = new char[5][5];

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if (num[i][j] % 2 == 0) {
                    c[i][j] = 'P';
                } else {
                    c[i][j] = 'I';
                }
            }
            System.out.println(Arrays.toString(num[i]));
        }
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if (num[i][j] % 2 == 0) {
                    c[i][j] = 'P';
                } else {
                    c[i][j] = 'I';
                }
            }
            System.out.println(Arrays.toString(c[i]));
        }
    }

}


