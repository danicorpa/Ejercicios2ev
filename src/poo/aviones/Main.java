package poo.aviones;
/*
 *
 *@author Daniel Martin Corpa
 *6/2/23
 *18:39
 *
 */


public class Main {

    public static void main(String[] args) {

        Avion av1 = new Avion(300, "AirbusA320",890,41.40338, 2.17403);
        av1.imprimir();
        Avion av2 = new Avion(515, "Boeing777", 905,41.38879,2.15899);
        av1.llevarPasajeros("Barcelona",41.38879,2.15899);
        av1.imprimir();

    }
}
