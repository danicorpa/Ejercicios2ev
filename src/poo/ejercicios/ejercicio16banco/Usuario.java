package poo.ejercicios.ejercicio16banco;
/*
 *
 *@author Daniel Martin Corpa
 *8/2/23
 *19:17
 *
 */


public class Usuario {

    private String login;
    private String nombre;
    private String apellidos;

    public Usuario() {
        this.nombre = "name";
        this.apellidos = "surname";
        this.login = "login";
    }

    public Usuario(String login, String nombre, String apellidos) {
        this.login = login;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getLogin() {return login;}
    public String getNombre() {return nombre;}
    public String getApellidos() {return apellidos;}
    public void setLogin(String login) {this.login = login;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setApellidos(String apellidos) {this.apellidos = apellidos;}
}
