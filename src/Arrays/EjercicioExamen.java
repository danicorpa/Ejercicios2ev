package Arrays;
/*
 *
 *@author Daniel Martin Corpa
 *18/1/23
 *18:29
 *
 */


import java.util.Scanner;

public class EjercicioExamen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia =0,mes =0;
        boolean fecha_correcta = false;
        int[] diasMes = {31,28,31,30,31,30,31,31,30,31,30,31};//
        do {
                System.out.println("Dia: ");
                dia = sc.nextInt(); sc.nextLine();
                System.out.println("Mes: ");
                mes = sc.nextInt(); sc.nextLine();
            if(mes>0 && mes < 13 && dia > 0 && dia <= diasMes[mes-1] ){

                System.out.println("Fecha correcta. ");
                fecha_correcta=true;

            }else{
                System.out.println("Fecha incorrecta. Por favor, vuelve a introducir la fecha. ");
                fecha_correcta=false;
            }


        }while(!fecha_correcta);

        String[] meses= {"Enero", "Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre" };
        System.out.println("Asiento disponible para el dia "+ dia+" de "+ meses[mes - 1] );
        System.out.println("===============================================================================================================");

        char[][] asientos = new char[4][4];

        for(int i=0; i < asientos.length;i++){
            for (int j = 0; j < asientos[i].length;j++){

                asientos[i][j]='L';
            }


        }
            asientos[0][1] = 'X';
            asientos[1][1] = 'X';
            asientos[1][2] = 'X';

        for(int i =0; i < asientos.length;i++){

            for(int j=0;j <asientos[i].length;j++){

                System.out.print(asientos[i][j]+"\t");
            }
            System.out.println();
        }
        int fila=0;

        do{
            System.out.println("Elige fila: (0 - 3): ");
            fila = sc.nextInt();
            if(fila<0 || fila > 4){
                System.out.println("Elige otra fila, fuera de rango. ");

            }


        }while(fila<0 || fila > 3);

        int asiento = 0;

        do{
            System.out.println("Elige asiento: (0 - 3): ");
            fila = sc.nextInt();
            if(asiento<0 || asiento > 3){
                System.out.println("Elige otro asiento, fuera de rango. ");

            }


        }while(asiento < 0 || asiento > 3);
        if(asientos[asiento][fila] == 'L'){

            asientos[asiento][fila] = 'X';
            System.out.println("Se te ha asignado el asiento solicitado.\t" );
            for(int i =0; i < asientos.length;i++){
                for(int j=0;j < asientos[i].length;j++){
                    System.out.print(asientos[i][j]+"\t");

                }
                System.out.println();

            }

        }else {

            System.out.println("El asiento está ocupado, elige otro asiento.");
        }

    }
}
