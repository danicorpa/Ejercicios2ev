package poo.banco;
/*
 *
 *@author Daniel Martin Corpa
 *8/2/23
 *18:04
 *
 */


import java.util.Arrays;

public class Cuenta {

    private String iban;
    private double saldo;
    private boolean active;
    private String[] dniTitulares;
    // constructor con todos los attr


    public Cuenta(String iban, double saldo, boolean active, String[] dniTitulares) {
        this.iban = iban;
        this.saldo = saldo;
        this.active = active;
        this.dniTitulares = dniTitulares;
    }

    @Override
    public String toString() {
        String attrObj;
        if (active)
        {
        attrObj = "Cuenta: \n"+
                "iban: " + iban + "\n" +
                "saldo: " + saldo +"€\n" +
                "active: " + "Activa\n" +
                "dniTitulares: " + Arrays.toString(dniTitulares);
                }else{
        attrObj = "Cuenta: \n"+
                    "iban: " + iban + "\n" +
                    "saldo: " + saldo +"€\n" +
                    "active: " + "No Activa\n" +
                    "dniTitulares: " + Arrays.toString(dniTitulares);

        }
        return attrObj;
    }
    public void imprimrCuenta(){
        System.out.println(this.toString());

    }
    // si los attr son private, solament4e pueden ser "leidos" desde esta misna clase
    // para ello se utilizan dos metodos:
    // get para leer desde otra clase
    // set para establecerlos

    public String getIban() {return iban;}

    public double getSaldo() {return saldo;}

    public boolean isActive() {return active;}

    public String[] getDniTitulares() {return dniTitulares;}

    public void setIban(String iban) {this.iban = iban;}

    public void setSaldo(double saldo) {this.saldo = saldo;}

    public void setActive(boolean active) {this.active = active;}

    public void setDniTitulares(String[] dniTitulares) {this.dniTitulares = dniTitulares;}
}
