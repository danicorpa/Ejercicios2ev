package Arrays;
/**
 *
 * @author Daniel Martin Corpa
 *
 * */
public class EjemploRandom {

    public static void main(String[] args) {
        for(int i=0;i<20;i++){
            int num = (int) (Math.random() * 10 + 1);
            System.out.printf(num + " \t");

        }
    }
}
