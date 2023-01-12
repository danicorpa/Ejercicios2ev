package Arrays;
/*
 *
 *@author Daniel Martin Corpa
 *12/1/23
 *20:53
 *
 */


import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio14ArrayList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> entero = new ArrayList<>();

        for(int i=0; i < 10 ; i++){
            int numeroAleatorio=(int) (Math.random()*10+1);
            entero.add(numeroAleatorio);

        }
        System.out.println(entero);
        System.out.println("Introduce un numero: ");
        int n=sc.nextInt() ;
        sc.nextLine();

        int pos = 0;
        do{
            System.out.println("En que posición lo quieres insertar: ");
            pos = sc.nextInt() - 1;


        }while(pos > entero.size());

        // insertamos numero en la posicion elegida
        entero.add(pos,n);
        entero.remove(entero.size());
        System.out.println(entero);

    }
}
