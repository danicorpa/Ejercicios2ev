package ArrayList;
/*
 *
 *@author Daniel Martin Corpa
 *17/1/23
 *21:00
 *
 */


public class Ejercicio24 {

    public static void main(String[] args) {
    /***
     * 24. Crea un progama que :
     * • Declara una tabla de números, bidimensional, de tamaño 5x15 y nombre ‘marco’.
     * • Carga la tabla con dos únicos valores: 0 y 1, donde el valor 1 ocupará las
     * posiciones o elementos que delimitan la tabla, es decir, las más externas, mientras
     * que el resto de los elementos contendrán el valor 0.
     * • Visualiza el contenido de la matriz en pantalla.
     * 111111111111111
     * 100000000000001
     * 100000000000001
     * 100000000000001
     * 111111111111111
     */
    int[][] marco =  new int[5][15];

        for (int i = 0 ;i < marco.length; i++){
            for (int j = 0; j < marco[i].length;j++ ){
                if(i==0 || i == marco.length-1 || j == 0 || j == marco[i].length-1){
                    marco[i][j]=1;
                }else{
                    marco[i][j] = 0;
                }

            }


        }
    for (int i = 0 ;i < marco.length; i++){
        for (int j = 0; j < marco[i].length;j++ ){

            System.out.print(marco[i][j]+ " ");
        }
        System.out.println();

    }
    }
}
