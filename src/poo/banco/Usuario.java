package poo.banco;
/*
 *
 *@author Daniel Martin Corpa
 *14/2/23
 *20:01
 *
 */


import java.util.Arrays;

public class Usuario {

    private String login;
    private String nombre;
    private String apellidos;
    private String[] cuentas;
    private String idUsuario;

    public Usuario(String login, String nombre, String apellidos, String[] cuentas, String idUsuario) {
        this.login = login;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cuentas = cuentas;
        this.idUsuario = idUsuario;
    }

    public void setCuentas(String[] cuentas) {
        this.cuentas = cuentas;
    }

    public String[] getCuentas() {
        return cuentas;
    }

    public String getLogin() {
        return login;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public String toString() {
        return "Usuario:\n" +
                "Login= " + login + "\n" +
                "Nombre= " + nombre + "\n" +
                "Apellidos= " + apellidos + "\n" +
                "Cuentas=" + Arrays.toString(cuentas);
    }
}
