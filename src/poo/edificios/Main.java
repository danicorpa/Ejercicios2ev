package poo.edificios;
/*
 *
 *@author Daniel Martin Corpa
 *6/2/23
 *18:07
 *
 *
 * A PARTIR DE AHORA EL METODO MAIN LO VAMOS A AMETER EN UNA CLASE QUE SE VA A LLAMAR MAIN POR CONVENCION
 */


import com.sun.java.accessibility.util.EventID;

public class Main {

    public static void main(String[] args) {
        // en el metodo main es donde creamos los objetos de la clase edificio

        // para crear un objeto hacemos lo mismo que para las clases de Java SE:
        //( nombre de la clase ) y el nombre que queramos dar al objeto
        // =
        // la palabra new y el a continuacion la llamada al constructor y los
        // argumentos (valores) del objeto que estamos creando

        Edificio edificio1 = new Edificio(4,2400.16, 1996);
        // tengo un edificio creado con esos valores. Podemos imprimirlos

        System.out.println("Plantas: "+edificio1.getNumeroDePlantas()+", Area de la planta: "+edificio1.getArea()+", Año de construcción: "+ edificio1.getAnyoConstruccion());

        Edificio edificio2 = new Edificio(6, 3000.54, 2001);

        System.out.println("Plantas: "+edificio2.getNumeroDePlantas()+", Area de la planta: "+edificio2.getArea()+", Año de construcción: "+ edificio2.getAnyoConstruccion());
    }
}
