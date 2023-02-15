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

    private String nombre;
    private String apellidos;
    private String fechaNacimiento; // formato "dd/mm/aaaa"
    private int numHistorial; // codigo del historial del paciente >0
    private boolean alergias; // si tiene alergias o no
    private String descripcionAlergias; // String con cada alegia separada por ;
    private String[] sintomas;

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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getNumHistorial() {
        return numHistorial;
    }

    public void setNumHistorial(int numHistorial) {
        this.numHistorial = numHistorial;
    }

    public boolean isAlergias() {
        return alergias;
    }

    public void setAlergias(boolean alergias) {
        this.alergias = alergias;
    }

    public String getDescripcionAlergias() {
        return descripcionAlergias;
    }

    public void setDescripcionAlergias(String descripcionAlergias) {
        this.descripcionAlergias = descripcionAlergias;
    }

    public String[] getSintomas() {
        return sintomas;
    }

    public void setSintomas(String[] sintomas) {
        this.sintomas = sintomas;
    }
}
