package Arrays;
/*
 *
 *@author Daniel Martin Corpa
 *20/12/22
 *20:58
 *
 * 23. Haz un programa que realice lo siguiente:
 * •  Crea una tabla de 5x5 enteros y nombre ‘diagonal’.
 * • Carga la tabla de forma que los componentes pertenecientes a la diagonal de la
 *   matriz tomen el valor 1 y el resto el valor 0.
 * • Muestra el contenido de la tabla en pantalla.
 *
 */


import java.util.Arrays;

public class Ejercicio23 {

    public static void main(String[] args) {
        int[][] tabla =  new int[5][5];

        for(int i=0;i <tabla.length;i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                if (i == j) {
                    tabla[i][j] = 1;
                } else {
                    tabla[i][j] = 0;
                }

            }
        }
        for(int i=0;i < tabla.length;i++){
            System.out.println(Arrays.toString(tabla[i]));

        }

    }
}
