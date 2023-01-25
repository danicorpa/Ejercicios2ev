package Arrays;
/*
 *
 *@author Daniel Martin Corpa
 *25/1/23
 *18:19
 *
 */


import com.sun.jdi.connect.AttachingConnector;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ejercicio20 {

    public static void main(String[] args) {


        /***
         * 20. Haz un programa que simule el siguiente juego de cartas: tenemos una baraja española.
         * La barajamos y sacamos 10 cartas. Suma los puntos obtenidos.
         * **/
        String[] palo={"oros","bastos","copas","espadas"};
        String[] numero={"as","dos","tres","cuatro","cinco","seis","siete","sota","caballo","rey"};
        String[] baraja=new String[40];
        int posBaraja=0;
        ArrayList<String> mazo = new ArrayList<>();
        int puntos=0;
        for(int i=0;i<palo.length;i++){
            for(int j =0;j<numero.length;j++){

                String carta= numero[j] +" de "+ palo[i];
                baraja[posBaraja] = carta;
                posBaraja++;

            }

        }
            System.out.println(Arrays.toString(baraja));
        // ahora las barajeamos cambiando el array por arraylist y luego hacemos un shuffle
        for(int i=0;i< baraja.length;i++){

            mazo.add(baraja[i]);
        }
        Collections.shuffle(mazo);
        System.out.println("\nBaraja desordenada: "+ mazo);
        String[] mano = new String[10];

        for(int i=0;i<mano.length;i++){

            mano[i] = mazo.get(i);
        }
        System.out.println("\nMano: "+ Arrays.toString(mano));
        for(int i =0; i<mano.length;i++){

            if(mano[i].startsWith("as")){
                puntos  += 1;
            }else if(mano[i].startsWith("dos")){
                puntos +=2;
            }else if(mano[i].startsWith("tres")){
                puntos+=3;
            }else if(mano[i].startsWith("cuatro")){
                puntos+=4;
            }else if(mano[i].startsWith("cinno")){
                puntos+=5;
            }else if(mano[i].startsWith("seis")){
                puntos+=6;
            }else if(mano[i].startsWith("siete")){
                puntos+=7;
            }else if(mano[i].startsWith("sota")){
                puntos+=10;
            }else if(mano[i].startsWith("caballo")){
                puntos+=10;
            }else {
                puntos+=12;
            }


        }
        System.out.println("\nTu puntuación es de: "+puntos);
    }
}
