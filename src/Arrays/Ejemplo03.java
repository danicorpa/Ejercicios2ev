package Arrays;

/**
 * @author Daniel Martin
 * Ejemplo 3. Uno más complicado: comprobar si un array está ordenado.
 * El siguiente programa comprueba si el array dado está ordenado en orden ascendente
 * e imprime "ORDENADO", de lo contrario imprime "DESORDENADO".
 *
 * **/
public class Ejemplo03 {

    public static void main(String[] args) {

        boolean ordenado = true;
        int[] num = {1, 2,3, 4, 5,10,1};

        for (int i = 0; i <= num.length - 2; i++) {

            if (num[i] <= num[i + 1]) {

                ordenado = false;
                break;

            }
        }
            if (ordenado) {
                System.out.println("Ordenado");
            } else {

                System.out.println("No ordenado");
            }

    }

}
