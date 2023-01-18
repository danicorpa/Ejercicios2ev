package Arrays;
/*
 *
 *@author Daniel Martin Corpa
 *18/1/23
 *17:56
 *
 */

import java.util.Arrays;

public class Ejercicio22 {

    public static void main(String[] args) {
        /**
         * 22. Haz un programa que realice lo siguiente:
         * • Crea una tabla de 5x5 enteros.
         * • Carga la tabla con valores numéricos enteros.
         * • Suma todos los elementos de cada fila y todos los elementos de cada columna
         * visualizando los resultados en pantalla.
         * ****/
        int[][] tabla=new int[5][5];
        int[] suma=new int[5];
        int[] sumaColumna= new int[5];

        for(int i=0;i < tabla.length;i++){

                for(int j=0;j < tabla[i].length;j++){

                    tabla[i][j] = (int) (Math.random()*11);
                }

        }
        for(int i=0;i<tabla.length;i++){
            for(int j=0;j<tabla[i].length;j++){
                System.out.print(tabla[i][j] + "\t");

            }
            System.out.println();
        }
        for(int i=0;i < tabla.length;i++){

            int contadori = 0 ,contadorj = 0;
            for(int j =0;j<tabla[i].length;j++){


                contadori += tabla[i][j];
                contadorj += tabla[i][j];


            }
            suma[i]=contadori;
            sumaColumna[i]=contadorj;

        }
        System.out.println("Suma de las filas "+Arrays.toString(suma));
        System.out.println("Suma de las collumnas "+Arrays.toString(sumaColumna));


    }
}
