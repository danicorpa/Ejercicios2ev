package poo.ejercito;
/*
 *
 *@author Daniel Martin Corpa
 *15/2/23
 *18:55
 *
 */


public class Unidad {

    String nombre;
    static int unidades;

    public Unidad(String nombre) {
        this.nombre = nombre;
        // cada vez que creamos una unidad incrementamos el contador de unidades
        unidades++;
    }

}
