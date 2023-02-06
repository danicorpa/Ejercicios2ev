package Examen2evDoc;
/**
 * @author Daniel Martin
 *
 *
 * **/

public class Ejercicio01 {
    public static void main(String[] args) {
        int[][] enteros = new int[5][5];
        for (int i = 0; i < enteros.length; i++) {
            for (int j = 0; j < enteros[i].length; j++) {
                enteros[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int i = 0; i < enteros.length; i++) {
            for (int j = 0; j < enteros[i].length; j++) {
                System.out.print(enteros[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        char[][] caracteres = new char[5][5];
        for (int i = 0; i < enteros.length; i++) {
            for (int j = 0; j < enteros[i].length; j++) {
                if (enteros[i][j] % 2 == 0) {
                    caracteres[i][j] = 'p';
                } else {
                    caracteres[i][j] = 'i';
                }
            }
        }

        for (int i = 0; i < caracteres.length; i++) {
            for (int j = 0; j < caracteres[i].length; j++) {
                System.out.print(caracteres[i][j] + "\t");
            }
            System.out.println();
        }

    }



}
