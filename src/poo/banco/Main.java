package poo.banco;
/*
 *
 *@author Daniel Martin Corpa
 *8/2/23
 *18:20
 *
 */


public class Main {

    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta ("ES2211466", 1000000,true,new String[]{
        "22222222222X", "434343434343434G"});
        cuenta1.imprimrCuenta();
        cuenta1.setSaldo(100.3);
        cuenta1.imprimrCuenta();

    }
}
