package ArrayList;
/*
 *
 *@author Daniel Martin Corpa
 *19/12/22
 *18:12
 *
 * 11. Generar un array de 10 enteros ordenados crecientemente. Pedir un número por teclado
 * y buscarlo en el array. Se debe mostrar la posición en que se encuentra. Si no está,
 * indicarlo con un mensaje.
 *
 */


import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        //Generamos el array alaetoriamente con numeros entre 1 y 20
        int[] enteros = new int[10];
        Scanner sc = new Scanner(System.in);
        boolean flag=false;
        for(int i=0;i <enteros.length; i++){

            enteros[i]=(int) (Math.random() *20 +1);

        }
        Arrays.sort(enteros);
        System.out.println(Arrays.toString(enteros));
        int numero=0;
        do{
            System.out.println("Introduce un numero entero 1 y 20: ");
            numero = sc.nextInt();
            if (numero<1||numero>20){
                System.out.println("Fuera de rango!! Melon!!");
            }
        }while(numero < 1 || numero > 20);

        for(int i =0;i < enteros.length;i++){

            if(enteros[i]==numero){
                System.out.println("El numero "+numero+" esta en la posicion "+(i +1)+" indice "+i+")." );
                //Cambiamos el flag a true
                flag=true;
                break;
            }


        }
        if(!flag){
            System.out.println("Numero no encontrado");
        }


    }
}
