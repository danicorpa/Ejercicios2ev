package Arrays;

import java.util.Arrays;

/**
 * @author Daniel Martin
 *
 * **/
public class EjemploArrays {
    public static void main(String[] args) {

        double[] elementos; // Declaración de array
        int elementos2[]; // Otra forma de declarar un array
        // Inicializacion de arrays--> instanciar = crear un objeto de tipo array.
        elementos = new double[5]; // Tmaño del array
        elementos[0] = 10.8 ;
        elementos[1] = 12.4;
        elementos[2] = 18.6;
        elementos[3] = 11.9;
        elementos[4] = 11.0;

        String[] diasLaboratorio = new String[5];
        diasLaboratorio[0] = "Lunes";
        diasLaboratorio[1] = "Martes";
        diasLaboratorio[2] = "Miercoloes";
        diasLaboratorio[3] = "Jueves";
        diasLaboratorio[4] = "Viernes";

        String[] meses = {"Enero", "Feb", "Mar", "Abr", "May", "Jun", "Jul", "Ago", "Sep", "Oct", "Nov", "Dec"}; // En vez de instanciar con new, pongo las llaves y dentro los valores separados por comas

        System.out.println(elementos);
        // System.out.println(elementos2);
        System.out.println(diasLaboratorio);
        System.out.println(meses);


        for (int i = 0;i<elementos.length; i++) {
            System.out.println("elementos"+ " " + elementos[i]);
        }
        System.out.println("\n" + Arrays.toString(diasLaboratorio));

        // foreach : es una variante simpificada del for.
        // for (tipoArray:elementoDelArray){}
        for (String elemento:meses) {
            System.out.println(elemento + " ");
        }


        }

}


