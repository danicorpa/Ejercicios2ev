package String;
/*
 *
 *@author Daniel Martin Corpa
 *19/1/23
 *20:44
 *
 */


import java.util.Scanner;

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
                    modificar(cadena);
                    break;
                case 3:
                    eliminar(cadena);
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

    public static void eliminar(String cadena) {
        //Eliminar: pide una , y la elimina de la lista.
        System.out.println(cadena);
        System.out.println("Palabra a borrar: ");
        String palabra= sc.nextLine();
        if(cadena.contains(palabra)){
            cadena = cadena.replaceAll(palabra, "");

        }
        System.out.println(cadena);

    }

    public static void modificar(String cadena) {
        //Modificar: pide una palabra, y a continuación otra, y modifica todas las apariciones de la primera por la segunda.
    }

    public static void contar(String cadena) {
        //Contar: pide una palabra, y me dice cuantas veces aparece en la lista\n" +
        System.out.println("");
    }

}
