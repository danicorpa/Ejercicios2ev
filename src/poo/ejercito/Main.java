package poo.ejercito;
/*
 *
 *@author Daniel Martin Corpa
 *15/2/23
 *19:01
 *
 */


import javax.crypto.spec.PSource;
import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //creamos uns unidad

        Unidad u1 = new Unidad("Transporte");
        System.out.println(Unidad.unidades);
        Unidad u2 = new Unidad("Comunicaciones");
        System.out.println(Unidad.unidades);
        Unidad u3 = new Unidad("Infanteria");
        System.out.println(Unidad.unidades);
        Unidad u4 = new Unidad("Zapadores");
        System.out.println(Unidad.unidades);
        Unidad u5 = new Unidad("Naval");
        System.out.println(Unidad.unidades);

        ArrayList<Caballero> caballeros = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        for (int i=0; i<5;i++){
            System.out.println("Nombre de caballero: ");
            caballeros.add(new Caballero(sc.nextLine()));
        }
        System.out.println(Caballero.caballeros);
        for(int i = 0;i < caballeros.size();i++) {
            System.out.println(caballeros.get(i).nombre);
        }
        ArrayList<General> generales = new ArrayList<>();

        for (int i=0; i<10;i++){
            System.out.println("Nombre de general: ");
            generales.add(new General(sc.nextLine()));
        }
        System.out.println(General.generales);
        for(int i = 0;i < generales.size();i++) {
            System.out.println(generales.get(i).nombre);
        }
        ArrayList<Medico> medicos = new ArrayList<>();

        for (int i=0; i<15;i++){
            System.out.println("Nombre de medico: ");
            medicos.add(new Medico(sc.nextLine()));
        }
        System.out.println(Medico.medicos);
        for(int i = 0;i < medicos.size();i++) {
            System.out.println(medicos.get(i).nombre);
        }
    }
}
