package poo.edificios;
/*
 *
 *@author Daniel Martin Corpa
 *2/2/23
 *20:56
 *
 */


public class Edificio {

    // las caracteristicas son los atributos, las guardamos en variables
    // NO SE INICIALIZA ----> ESO LO HARÁ EL MÉTODO CONSTRUCTOR
    // Los métodos serán las funcionalidades
    int numeroDePlantas; // al no llevar modificador de acceso podemos acceder a otros attr desde cualquier
    // clase del mismo paquete
    double area;
    public int anyoConstruccion;

    // Hay un método que siempre existe, este es el método CONSTRUCTOR
    // Aunque no lo escribas se crea implicitamente (constructor por defecto).
    // Este metodo sirve para crear objetos de la clase e inicializar los valores
    // de sus attr.
    // El constructor se denomina igual que el nombre de la clase.

    public Edificio(int numeroDePlantas, double area, int anyoConstruccion){

        this.anyoConstruccion = anyoConstruccion; // este objeto que estoy creando va a tener como año de construccion
        // el que le ponga aqui
        this.area = area;
        this.numeroDePlantas = numeroDePlantas;

    }


}
