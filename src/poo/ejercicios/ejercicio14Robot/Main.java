package poo.ejercicios.ejercicio14Robot;
/*
 *
 *@author Daniel Martin Corpa
 *8/2/23
 *16:48
 *
 */


public class Main {

    public static void main(String[] args) {
        // robot1 llama al contructor por defecto
        Robot robot1 = new Robot();
        // imprimir los valores de robot1
        System.out.println(robot1);
        //robot2 llama al constructor con 3 attr
        Robot robot2 = new Robot("Terminator1","T800",200);
        // imprimimos los datos de robot2
        System.out.println(robot2);
        //robot3 llama al constructor con 2 attr
        Robot robot3=new Robot("Terminator2","T1000");
        // imprimimos los datos de robot3
        System.out.println(robot3);


    }
}
