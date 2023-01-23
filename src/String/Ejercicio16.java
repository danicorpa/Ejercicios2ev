package String;
/*
 *
 *@author Daniel Martin Corpa
 *19/1/23
 *20:44
 *
 */


import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio16 {

    /**
     * Ejercicio 16
     * Escribe un programa que pida una lista de palabras (la guardas como una cadena de texto) y,
     * a continuación dé tres opciones:
     * • Contar: pide una palabra, y me dice cuantas veces aparece en la lista
     * • Modificar: pide una palabra, y a continuación otra, y modifica todas las apariciones
     * de la primera por la segunda.
     * • Eliminar: pide una , y la elimina de la lista.
     * • Mostrar: muestra la lista de cadenas
     * • Salir
     *
     * **/

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String palabra = "";
        String cadena = "";
        do{
            System.out.println("Introduce palabra (0 para salir: )");
            palabra = sc.nextLine();
            if(!palabra.equals("0") ){

                cadena = cadena +palabra + " ";

            }
        }while(!palabra.equals("0"));

        System.out.println(cadena);
        System.out.println("Elige una opcion: \n 1- Contar: pide una palabra, y me dice cuantas veces aparece en la lista\n" +
                "     * 2- Modificar: pide una palabra, y a continuación otra, y modifica todas las apariciones\n" +
                "     * de la primera por la segunda.\n" +
                "     * 3- Eliminar: pide una , y la elimina de la lista.\n" +
                "     * 4- Mostrar: muestra la lista de cadenas\n" +
                "     * 5- Salir");
        int op=sc.nextInt();sc.nextLine();
        do{
            switch(op){
                case 1:
                    contar(cadena);
                    break;
                case 2:
                    cadena = modificar(cadena);
                    break;
                case 3:
                    cadena = eliminar(cadena);
                    break;
                case 4:
                    mostrar(cadena);
                    break;
                case 5:
                    salir();
                    break;
                default:
                    System.out.println("Opción incorrecta!! Melón!!");

            }
        }while(op != 5);





    }

    public static void salir() {
        //Salir
    }

    public static void mostrar(String cadena) {
        //Mostrar: muestra la lista de cadenas
        System.out.println(cadena);

    }

    public static String eliminar(String cadena) {
        //Eliminar: pide una , y la elimina de la lista.
        System.out.println(cadena);
        System.out.println("Palabra a borrar: ");
        String palabra= sc.nextLine();
        if(cadena.contains(palabra)){
            cadena = cadena.replaceAll(palabra, "");

        }
        mostrar(cadena);

        return cadena;
    }

    public static String modificar(String cadena) {
        //Modificar: pide una palabra, y a continuación otra, y modifica todas las apariciones de la primera por la segunda.

        System.out.println("Escribe una de estas palabras: "+cadena);
        String palabra=sc.nextLine();
        System.out.println("Escrinbe la palabra con la que la quieres reemplazar: ");
        String otraPalabra=sc.nextLine();
        cadena=cadena.replaceAll(palabra,otraPalabra);
        mostrar(cadena);
        return cadena;


    }

    public static void contar(String cadena) {
        //Contar: pide una palabra, y me dice cuantas veces aparece en la lista\n" +
        mostrar(cadena);
        System.out.println("Escribe una palabra para que te diga cuantas veces está incluida:  ");
        String palabra = sc.nextLine();
        //**** NEW ****
        // El método split me trocea una cadena y mete cada trozo en un array ---> más facil de procesar
        //
        //

        String[] a = cadena.split(" ");
        int contador =0;
        for (int i =0;i<a.length;i++){
            if(a[i].equals(palabra)){
                contador++;

            }

        }
        System.out.println("La palabra "+palabra+" aparece "+contador+" veces.");
        // System.out.println(Arrays.toString(a));
    }

}
