package Arrays;
/*
 *
 *@author Daniel Martin Corpa
 *25/1/23
 *17:59
 *
 */


import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio18 {

    public static void main(String[] args) {


        /**
         * 18. Generar dos arrays de 10 enteros, que estarán ordenados crecientemente. Copiar
         * (fusionar) ambos en un tercero, de forma que sigan ordenados.
         *
         * **/
        ArrayList<Integer> ar1 = new ArrayList<>();
        ArrayList<Integer> ar2 = new ArrayList<>();

        for(int i =0;i<10;i++){

            ar1.add((int) (Math.random()* 100));
            ar2.add((int) (Math.random()* 100));
        }
        System.out.println("Arrays desordenados.");
        System.out.println("Array 1: "+ar1);
        System.out.println("Array 2: "+ar2);
        Collections.sort(ar1);
        Collections.sort(ar2);
        System.out.println("Arrays ordenados.");
        System.out.println("Array 1: "+ar1);
        System.out.println("Array 2: "+ar2);
        ArrayList<Integer> ar3 = new ArrayList<>();
        ar3.addAll(ar1);
        ar3.addAll(ar2);
        System.out.println("Arrays 1 y 2 juntos en Array 3.");
        System.out.println("Array 3: "+ar3);
    }
}
