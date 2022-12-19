package ArrayList;
/*
 *
 *@author Daniel Martin Corpa
 *19/12/22
 *18:01
 *
 *  10. Haz un programa que pida un número al usuario un número de mes (por ejemplo, el 4) y
 *  diga cuántos días tiene (por ejemplo, 30) y el nombre del mes. Debes usar arrays. Para
 *  simplificarlo vamos a suponer que febrero tiene 28 días.
 *
 *
 */


import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int mes=0;
        do{
            System.out.println("di un numero de mes (1-12)");
            mes=sc.nextInt();
        }while(mes<0||mes>12);
        String[] nombreMes={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        int[] numeroDias={31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.println(nombreMes[mes-1] + " tiene " + numeroDias[mes-1] + " dias.");

    }
}
