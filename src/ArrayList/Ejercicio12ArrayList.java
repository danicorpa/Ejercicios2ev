package ArrayList;
/*
 *
 *@author Daniel Martin Corpa
 *19/12/22
 *19:08
 *
 * 12. Rellenar aleatoriamente dos arrays (A y B) de 10 números enteros entre 1 y 10 y
 * mezclarlos en un tercero de la forma: el 1º de A, el 1º de B, el 2º de A, el 2º de B, etc.
 */


import java.util.ArrayList;

public class Ejercicio12ArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> arrayA = new ArrayList<>();
        ArrayList<Integer> arrayB = new ArrayList<>();
        ArrayList<Integer> arrayC = new ArrayList<>();
        for (int i=0; i < 10;i++){
            int numeroA=(int) (Math.random()*10+1);
            arrayA.add(numeroA);
            int numeroB=(int) (Math.random()*10+1);
            arrayB.add(numeroB);

        }
        System.out.println(arrayA);
        System.out.println(arrayB);

        for(int i = 0; i <10;i++){
            arrayC.add(arrayA.get(i));
            arrayC.add(arrayB.get(i));

        }
        System.out.println(arrayC);

    }
}
