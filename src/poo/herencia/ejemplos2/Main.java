package poo.herencia.ejemplos2;
/*
 *
 *@author Daniel Martin Corpa
 *16/2/23
 *20:56
 *
 */


public class Main {

    public static void main(String[] args) {

        Empleado emp1 = new Empleado();
        emp1.fechaContrato = "14/03/1976";
        emp1.id = "0000000000X";
        Cliente cli1=new Cliente();
        cli1.vip= true;
        cli1.idCliente="0003";

        Manager man1 = new Manager();
        man1.isSonrisa();

    }
}
