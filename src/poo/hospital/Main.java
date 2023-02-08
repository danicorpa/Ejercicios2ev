package poo.hospital;
/*
 *
 *@author Daniel Martin Corpa
 *7/2/23
 *20:10
 *
 */


public class Main {

    public static void main(String[] args) {

        // creamos un paciente llamando al constructor sin  parametros

        Paciente paciente1 = new Paciente();
        // imprimir los datos del paciente
        //System.out.println(valentin.nombre);
        // para imrpimir todos los attr
        //System.out.println(paciente1);
        // podemos dar los valores a mano
        paciente1.nombre="Valentin Danut";
        paciente1.apellidos="Preutesei";
        paciente1.fechaNacimiento="08/02/2001";
        paciente1.numHistorial=1;
        paciente1.alergias=false;
        String[] sintomasV = {"Cefalea"};
        paciente1.sintomas=sintomasV;

        Paciente paciente2 = new Paciente("Daniel",
                                          "Martin Corpa",
                                    "14/03/1976",
                                        2,
                                            true,
                                    "pelo de animales;olivo;gramineas;aspirina",
                                            null);

        System.out.println(paciente1);
        System.out.println(paciente2);
    }
}
