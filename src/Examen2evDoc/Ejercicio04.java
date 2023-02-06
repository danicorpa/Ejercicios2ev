package Examen2evDoc;
/**
 *
 *  * <h2>Método main pide datos de usuario</h2>.
 *  * Se piden datos del usuario y se comprueba que la fecha de nacimineto está correctamente escrita.
 *  * Una fecha es válida si el año es >= 0, el mes está entre 1 y 12, y el día está dentro del rango
 *  * del mes indicado (suponemos que febrero tiene 28 días)
 *
 * @author Daniel Martin
 * @version 1.0
 *
 *
 * **/

import java.util.Scanner;

public class Ejercicio04 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        /**
         * Atributo nombre
         *
         *
         * */
        String nombre = pedirNombre();
        /**
         * Atributo apellidos
         *
         * */
        String apellidos = pedirApellidos();
        /**
         * Atributo fecha de nacimiento
         *
         * */
        String fechaNacimiento = pedirFechaNacimiento();
        /**
         * Atributo vailida formato de fecha nacimiento
         *
         *
         * */

        boolean fechaValida = validarFecha(fechaNacimiento);
        if (fechaValida) {
            imprimirFicha(nombre, apellidos, fechaNacimiento);
        } else {
            System.out.println("La fecha de nacimiento introducida no es válida.");
        }

    }


     //Métodos públicos
    /**
     * Pide nombre del usuario
     * @return  nombre
     */

    public static String pedirNombre() {
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        return nombre;
    }

    /**
     * Pide apellidos del usuario
     * @return  apellidos
     */
    public static String pedirApellidos() {
        System.out.print("Apellidos: ");
        String apellidos = sc.nextLine();
        return apellidos;
    }
    /**
     * Pide fecha de nacimiento del usuario
     * @return  fecha
     */
    public static String pedirFechaNacimiento() {
        System.out.print("Fecha de nacimiento (DD/MM/AAAA): ");
        String fecha = sc.nextLine();
        return fecha;
    }

    /**
     * Comrpueba formato de fecha de nacimiento del usuario
     * @param fecha
     * @return  <ul>
     *          <li>true: la fecha es correcta</li>
     *          <li>true: la fecha es incorrecta</li>
     *          </ul>
     */
    public static boolean validarFecha(String fecha) {
        String[] f = fecha.split("/");
        int dia = Integer.parseInt(f[0]);
        int mes = Integer.parseInt(f[1]);
        int año = Integer.parseInt(f[2]);
        // una fecha es válida si el año es >= 0, el mes está entre 1 y 12, y el día está dentro del rango del mes indicado (suponemos que febrero tiene 28 días)
        if (año >= 0) {
            if (mes >= 1 && mes <= 12) {
                int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
                if (dia <= diasMes[mes - 1]) {
                    return true;
                }
            }
        }
        return false;
    }
    /**
     * Imprime nombre, apellidos y fecha de nacimiento del usuario
     * @param  nombre
     * @param  apellidos
     * @param  fNac
     */
    public static void imprimirFicha(String nombre, String apellidos, String fNac) {
        System.out.println(nombre + " " + apellidos + " " + "(" + fNac + ")");
    }



}
