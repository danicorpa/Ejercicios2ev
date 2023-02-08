package poo.ejercicios.ejercicio14Robot;
/*
 *
 *@author Daniel Martin Corpa
 *8/2/23
 *16:40
 *
 */


public class Robot{

String nombre;
String modelo;
int duracion;

    public Robot() {
        this.nombre = "Anonimo";
        this.modelo = "Desconocido";
    }

    public Robot(String nombre, String modelo, int duracion) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.duracion = duracion;
    }

    public Robot(String nombre, String modelo) {
        this(nombre,modelo,20); // llamada a otro constructor, concretamente al de tres parametros
    }

    @Override
    public String toString() {
        return "Robot:\n" +
                "nombre: " + nombre + "\n" +
                "modelo: " + modelo + "\n" +
                "duracion: " + duracion+" años";
    }
}
