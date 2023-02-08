package poo.hospital;
/*
 *
 *@author Daniel Martin Corpa
 *7/2/23
 *20:00
 *
 */


import java.util.Arrays;

public class Paciente {
    // atributos, caracteristicas que queremos guardar de un paciente

    String nombre;
    String apellidos;
    String fechaNacimiento; // formato "dd/mm/aaaa"
    int numHistorial; // codigo del historial del paciente >0
    boolean alergias; // si tiene alergias o no
    String descripcionAlergias; // String con cada alegia separada por ;
    String[] sintomas;

    // Constructor con todos los attr


    public Paciente() {
    }

    public Paciente(String nombre, String apellidos, String fechaNacimiento, int numHistorial, boolean alergias, String descripcionAlergias, String[] sintomas) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.numHistorial = numHistorial;
        this.alergias = alergias;
        this.descripcionAlergias = descripcionAlergias;
        this.sintomas = sintomas;
    }

    @Override
    public String toString() {
        return "Datos del paciente\n"
                +"=================\n"+
                "Nombre y Apellidos: '" + nombre + " "+apellidos +"'\n" +
                "Fecha Nacimiento: '" + fechaNacimiento + "'\n" +
                "Numero De Historial: '" + numHistorial +"'\n" +
                "Alergias: '" + alergias +"'\n" +
                "Descripcion Alergias: '" + descripcionAlergias + "'\n" +
                "Sintomas: '" + Arrays.toString(sintomas)+"'" ;
    }
}
