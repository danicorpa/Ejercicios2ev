package Arrays;
/*
 *
 *@author Daniel Martin Corpa
 *14/12/22
 *19:10
 *
 * 7. Se quiere realizar un programa que lea por teclado las 5 notas obtenidas por un alumno
 * (comprendidas entre 0 y 10). A continuación debe mostrar todas las notas, la nota media,
 * la nota más alta que ha sacado y la menor.
 *
 */


import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {

        double media = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce las 5 últimas notas: ");
        double[] notas = new double[5];
        for(int i = 0; i < notas.length;i++){
            notas[i] = sc.nextDouble();
            media += notas[i];
        }
        media = media / notas.length;
        Arrays.sort(notas);
        System.out.println("Tu nota mas baja es: "+notas[0]);
        System.out.println("Tu nota mas alta es: "+notas[notas.length - 1]);
        System.out.println("Tu media es: "+media);
        System.out.print("Tus notas son: \t");
        for(double elemento:notas){System.out.printf("%.2f \t" , elemento);}


    }
}
