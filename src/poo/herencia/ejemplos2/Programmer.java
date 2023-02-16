package poo.herencia.ejemplos2;
/*
 *
 *@author Daniel Martin Corpa
 *16/2/23
 *21:09
 *
 */


import java.util.ArrayList;

public class Programmer extends Empleado{

    private ArrayList<String> lenguages;

    public ArrayList<String> getLenguages() {
        return lenguages;
    }

    public void setLenguages(ArrayList<String> lenguages) {
        this.lenguages = lenguages;
    }
}
