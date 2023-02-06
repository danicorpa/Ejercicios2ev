package poo.aviones;
/*
 *
 *@author Daniel Martin Corpa
 *6/2/23
 *18:39
 *
 */


import java.util.Arrays;

public class Avion {

    int aforo;
    String nombre;
    int velocidadMedia;
    double x;
    double y;
    String destino;

    public Avion(){

    }
    public void llevarPasajeros(String destino, double x2,double y2){
        System.out.println("Nos vamos a "+destino+"!");
        this.x=x2;
        this.y=y2;
    }
    public Avion(int aforo, String nombre, int velocidadMedia, double x,double y) {
        this.aforo = aforo;
        this.nombre = nombre;
        this.velocidadMedia = velocidadMedia;
        this.x = x;
        this.y = y;

    }

    @Override
    public String toString() {
        return "Avion: Aforo del "+nombre+" es "+aforo+" pasajeros, tiene una velocidad de "+velocidadMedia+" km/h";
    }
    public void imprimir(){
        System.out.println(this.toString());
    }
}
