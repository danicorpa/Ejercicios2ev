package Arrays;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Daniel Martin
 *
 * 3. Haz un programa que declare tres arrays (‘a1’, ‘a2’ y ‘a3’) de cinco enteros cada uno, pida
 * valores para ‘a1’ y ‘a2’ y calcule los elementos de a3 así: a3=a1+a2.
 * */
public class Ejercicio03 {

    public static void main(String[] args) {

        int[] a1 = new int[5];
        int[] a2 = new int[5];
        int[] a3 = new int[5];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < a1.length; i++){
            System.out.println("Valor" + (i +1) + " de a1");
            a1[i] = sc.nextInt();
            System.out.println("Valor" + (i +1) + " de a2");
            a2[i] = sc.nextInt();
            a3[i] = a1[i] + a2[i];

        }
        System.out.println(Arrays.toString(a1)+ " Array 1");
        System.out.println(Arrays.toString(a2)+ " Array 2");
        System.out.println(Arrays.toString(a3)+ " Array 3");

    }
}
