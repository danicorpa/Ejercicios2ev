package poo.banco;
/*
 *
 *@author Daniel Martin Corpa
 *8/2/23
 *18:20
 *
 */
// Un método estático mostrarCuenta, que decibe una cuenta y
// muestra toda la información de la cuenta.

public class Main {

    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta ("ES2211466", 1000000,true,new String[]{
        "22222222222X", "434343434343434G"});
        cuenta1.imprimrCuenta();
        cuenta1.setSaldo(100.3);
        cuenta1.imprimrCuenta();

        // creamos un usuario
        Usuario u1 = new Usuario("Popeye", "Perico", "Palotes", new String[]{"ES2211466"}, "012345678U");
        mostrarCuenta(cuenta1);


    }
    public static void mostrarCuenta(Cuenta cuenta){
        cuenta.imprimrCuenta();
    }
}
