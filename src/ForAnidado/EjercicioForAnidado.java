package ForAnidado;
/*
 *
 *@author Daniel Martin Corpa
 *16/1/23
 *18:45
 * Estos ejercicios estan en la hoja de estrusturas de control de la primera evaluacion
 *
 */


import java.util.Scanner;

public class EjercicioForAnidado {

        static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
            // metodo menu qu epregunta por el ejercicio a hacer: 27,28;39 o 35
            // y devuelve el núemro del ejercicio a realizar
        String seguir = "";
        do {
            int ejercicio = menu();
            switch (ejercicio) {
                case 27:
                    ejercicio27();
                    break;
                case 28:
                    ejercicio28();
                    break;
                case 29:
                    ejercicio29();
                    break;
                case 35:
                    ejercicio35();
                    break;
                default:
                    System.out.println("Este ejercicio no entra, melon!!!");
            }
            System.out.println("Quieres hacer otro ejercicio??");
            sc.nextLine();
            seguir = sc.nextLine().substring(0,1);
        }while(seguir.equalsIgnoreCase("S"));

    }
    public static int menu(){

        System.out.println("Elige el ejercicio a relaizar: \n27 Escribe un programa que, dado un número n introducido por teclado, dibuje un\n" +
                "cuadrado de dimensiones n * n, con un carácter también introducido por teclado.\n\n28 Escribe un programa que reciba dos valores enteros por teclado, a y b, y dibuje un\n" +
                "rectángulo en que la base sea el número mayor y la altura el número menor, con un\n" +
                "carácter también introducido por teclado.\n\n29 Hacer un programa que introduzca un número entero, positivo, y calcule su tabla de\n" +
                "multiplicar, hasta llegar a él. (Nota: para que los números queden alineados en columnas\n" +
                "puedes usar el tabulador \\t).\n\n35 Hacer un programa que dibuje un triángulo rectángulo de n elementos de lado,\n" +
                "siendo n un número introducido por teclado, utilizando asteriscos (*). Por ejemplo,\n" +
                "para n = 5:");
        return sc.nextInt();

    }
    private static void ejercicio27(){
        System.out.println("27 Escribe un programa que, dado un número n introducido por teclado, dibuje un\\n\" +\n" +
                "                \"cuadrado de dimensiones n * n, con un carácter también introducido por teclado.");
        System.out.println("Introduce un número entero positivo: ");
        int num = sc.nextInt();

        if(num <=0 ){

            System.out.println("El número debe ser un número entero!! Melón!!");

        }else {

            // Ahora pedimos un carácter para hacer el cuadrado
            System.out.println("Introduce un carácter: ");
            char c =sc.next().charAt(0);

            // Ahora dibujamos el cuadrado
            // El for externo para las filas
            for(int i=0;i < num; i++){

                for(int j=0;j<num;j++){

                    System.out.print(c+" ");

                }
                System.out.println();
            }

        }

    }


    private static void ejercicio28(){

        System.out.println("28 Escribe un programa que reciba dos valores enteros por teclado, a y b, y dibuje un\\n\" +\n" +
                "                \"rectángulo en que la base sea el número mayor y la altura el número menor, con un\\n\" +\n" +
                "                \"carácter también introducido por teclado.");
        System.out.println("Inserta un número entero: ");
        int num1 = sc.nextInt();
        System.out.println("Inserta otro número entero: ");
        int num2 = sc.nextInt();

        if(num1 <=0 || num2 <=0 ){

            System.out.println("El número debe ser un número entero!! Melón!!");

        }else {
            if(num1>num2){
                // Ahora pedimos un carácter para hacer el cuadrado
                System.out.println("Introduce un carácter: ");
                char c =sc.next().charAt(0);

                // Ahora dibujamos el cuadrado
                // El for externo para las filas
                for(int i=0;i < num2; i++){

                    for(int j=0;j<num1;j++){

                        System.out.print(c+" ");

                    }
                    System.out.println();
                }
            }else{

                System.out.println("Debes meter primero base y luego altura!! Melón!!");

            }


        }


    }
    private static void ejercicio29(){
        System.out.println("29 Hacer un programa que introduzca un número entero, positivo, y calcule su tabla de\\n\" +\n" +
                "                \"multiplicar, hasta llegar a él. (Nota: para que los números queden alineados en columnas\\n\" +\n" +
                "                \"puedes usar el tabulador \\\\t).");


    }
    private static void ejercicio35(){}

    }


