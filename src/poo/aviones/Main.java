package poo.aviones;
/*
 *
 *@author Daniel Martin Corpa
 *6/2/23
 *18:39
 *
 */


import poo.edificios.Edificio;


public class Main {

    public static void main(String[] args) {

        Avion av1 = new Avion(300, "AirbusA320",890,41.40338, 2.17403);
        av1.imprimir();
        Avion av2 = new Avion(515, "Boeing777", 905,41.38879,2.15899);
        av1.llevarPasajeros("Barcelona",41.38879,2.15899);
        av1.imprimir();
        // para probar la proteccion de paquete por defecto (sin modificador de acceso)
        // intentamos crear un Edificio (que esta en el paquete edificios)
        // desde la clase Main que esta en el paquete aviones

        // el edificio puede crearlo porque tanto la clase como el constructor de Edificio son public
        Edificio ed1 = new Edificio(3,4.3,2022);
        System.out.println(ed1.anyoConstruccion);

    }
}
