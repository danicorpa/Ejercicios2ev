package Examen2evDoc.ExamenCasa;
/*
 *
 *@author Daniel Martin Corpa
 *16/2/23
 *10:24
 *
 */


import java.util.Arrays;

public class Ejercicio01 {

    /**
     * Crea un array bidimensional de tamaño 5x5 de números enteros, rellénalo de aleatorios de 0 a 9 e immprime el resultado.
     *
     * A continuación, crea otro array de caracteres del mismo tamaño y rellénalo de forma que si en el array de enteros el número
     * es par ponga 'P' y si es impar ponga 'I'.
     * Imprime el resultado
     *
     */
    public static void main(String[] args) {

        /**
         * @attribute numeros: array de números enteros
         * */
        int[][] numeros= new int[5][5];
        /**
         * @attribute c = array de caracteres
         *
         * */
        char[][] c = new char[5][5];
        for (int i=0; i<numeros.length;i++ ){
            for(int j=0;j<numeros[i].length;j++){
                numeros[i][j] = (int) (Math.random()*10);
            }
            System.out.println(Arrays.toString(numeros[i]));
        }
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c[i].length;j++){
                if(numeros[i][j]%2 == 0 ){
                    c[i][j] = 'P';
                }else{c[i][j] = 'I';}

            }
            System.out.println(Arrays.toString(c[i]));

        }

    }
}
