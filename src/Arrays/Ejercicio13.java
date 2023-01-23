package Arrays;
/*
 *
 *@author Daniel Martin Corpa
 *23/1/23
 *18:52
 *
 */


import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        /***
         * 13. Haz un programa que rellene por teclado un array de 5 números enteros. La aplicación
         * debe indicarnos si los números están ordenados de forma creciente, decreciente, o si
         * están desordenados.
         *
         * **/
        ArrayList<Integer> arrayList= new ArrayList<>();
        boolean ordenCrec=true;
        boolean ordenDec= true;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i < 5;i++){
            System.out.println("Numero: ");
            int n = sc.nextInt(); sc.nextLine();
            arrayList.add(n);

        }
        for(int i=0;i < arrayList.size()-1;i++){

            if(!(arrayList.get(i) <= arrayList.get(i + 1))){
                ordenCrec=false;
                break;
            }

        }
        // System.out.println(ordenCrec);
        // Si no está en orden creciente podemos ver si está en orden decreciente.
        if(!ordenCrec){

            ordenDec= true;
            for(int i=0;i < arrayList.size() -1;i++){
                if(arrayList.get(i) >= arrayList.get(i+1)){
                    ordenDec=true;
                    break;
                }
            }
        }
        if(ordenCrec){
            System.out.println("Está ordenado en sentido creciente. ");
        }else if(ordenDec){
            System.out.println("Está ordenado en sentido decreciente. ");
        }else{
            System.out.println("Está desordenado. ");
        }

    }
}
