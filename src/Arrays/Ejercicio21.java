package Arrays;
/*
 *
 *@author Daniel Martin Corpa
 *25/1/23
 *19:07
 *
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ejercicio21 {

    public static void main(String[] args) {

        /**
         * 21. Haz lo mismo que el ejercicio anterior, pero suponiendo que son dos jugadores los que
         * extraen alternativamente 10 carta. Averigua cuál de los dos jugadores gana.
         *
         * */
        String[] palo = {"oros", "bastos", "copas", "espadas"};
        String[] numero = {"as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballo", "rey"};
        String[] baraja = new String[40];
        int posBaraja = 0;
        ArrayList<String> mazo = new ArrayList<>();
        int puntos = 0;
        for (int i = 0; i < palo.length; i++) {
            for (int j = 0; j < numero.length; j++) {

                String carta = numero[j] + " de " + palo[i];
                baraja[posBaraja] = carta;
                posBaraja++;

            }

        }
        System.out.println(Arrays.toString(baraja));
        // ahora las barajeamos cambiando el array por arraylist y luego hacemos un shuffle
        for (int i = 0; i < baraja.length; i++) {

            mazo.add(baraja[i]);
        }
        Collections.shuffle(mazo);
        System.out.println("\nBaraja desordenada: " + mazo);
        String[] mano1 = new String[10];
        String[] mano2 = new String[10];
        int indice1 =0;
        int indice2 =0;
        for (int i = 0; i < 20; i++) {
            if(i%2==0){
                mano1[indice1]=mazo.get(i);
                indice1++;
            }else{
                mano2[indice2]=mazo.get(i);
                indice2++;
            }

        }
        System.out.println("\nmano1: " + Arrays.toString(mano1));
        System.out.println("\nmano2: " + Arrays.toString(mano2));
        for (int i = 0; i < mano1.length; i++) {

            if (mano1[i].startsWith("as")) {
                puntos += 1;
            } else if (mano1[i].startsWith("dos")) {
                puntos += 2;
            } else if (mano1[i].startsWith("tres")) {
                puntos += 3;
            } else if (mano1[i].startsWith("cuatro")) {
                puntos += 4;
            } else if (mano1[i].startsWith("cinno")) {
                puntos += 5;
            } else if (mano1[i].startsWith("seis")) {
                puntos += 6;
            } else if (mano1[i].startsWith("siete")) {
                puntos += 7;
            } else if (mano1[i].startsWith("sota")) {
                puntos += 10;
            } else if (mano1[i].startsWith("caballo")) {
                puntos += 10;
            } else {
                puntos += 12;
            }


        }
        System.out.println("\nTu puntuación de jugador 1 es de: " + puntos);
        for (int i = 0; i < mano2.length; i++) {

            if (mano2[i].startsWith("as")) {
                puntos += 1;
            } else if (mano2[i].startsWith("dos")) {
                puntos += 2;
            } else if (mano2[i].startsWith("tres")) {
                puntos += 3;
            } else if (mano2[i].startsWith("cuatro")) {
                puntos += 4;
            } else if (mano2[i].startsWith("cinno")) {
                puntos += 5;
            } else if (mano2[i].startsWith("seis")) {
                puntos += 6;
            } else if (mano2[i].startsWith("siete")) {
                puntos += 7;
            } else if (mano2[i].startsWith("sota")) {
                puntos += 10;
            } else if (mano2[i].startsWith("caballo")) {
                puntos += 10;
            } else {
                puntos += 12;//
            }//

        }
        System.out.println("\nTu puntuación de jugador 2 es de: " + puntos);
    }
}
