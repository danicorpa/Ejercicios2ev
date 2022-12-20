package Arrays;
/*
 *
 *@author Daniel Martin Corpa
 *20/12/22
 *19:57
 *
 */


import java.util.Arrays;

public class EjemploArrayBidimensional {

    public static void main(String[] args) {

        // declaramos un array de 3x4 de enteros

        int[][] tabla = new int[3][4];

        // lo vamos a rellenar con numeros rnd entre 1 y 4
        for(int i = 0; i < tabla.length; i++){
            // para cada fila que tenga la tabla hacer
            for(int j=0;j < tabla[i].length;j++){
                //tabla[i].length es la longitud de la fila i, que es el array que estoy recorriendo
                tabla[i][j] = (int) (Math.random() * 4 +1);
            }
        }
        for(int i=0;i < tabla.length;i++){
            System.out.println(Arrays.toString(tabla[i]));
        }

    }
}
