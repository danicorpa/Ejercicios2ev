package Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Daniel Martin
 *
 * 2. Haz un programa que lea 5 números decimales por teclado, los guarde en un array y los
 * muestre en el orden inverso al introducido.
 *
 * */
public class Ejercicio02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] num = new double[5];

        for (int i=(num.length - 1); i >= 0;i--){

            System.out.print("Inserta num. "+ (i+1) +": " );
            num[i] = sc.nextDouble();
        }
        System.out.println(Arrays.toString(num));
    }
}
