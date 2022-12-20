package Arrays;
/*
 *
 *@author Daniel Martin Corpa
 *20/12/22
 *20:40
 *
 */


import java.util.Arrays;

public class EjemploArrayBidimensional2 {

    public static void main(String[] args) {

        String[][] aula = {
                {"","","Vanlentin","Rebeca"},
                {"Sara","Gema","Valweria","Tatiana","Claudia","JavierA"},
                {"Antonio","Christian"},
                {"JoseA","Victor","Yo","JavierB","Jorge","Aitor"},
                {"Miguel","Alberto","Francisco","Roberto"},
        };
        for(int i=0;i<aula.length;i++){
            System.out.println(Arrays.toString(aula[i]));
        }

    }
}
