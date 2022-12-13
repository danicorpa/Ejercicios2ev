package Arrays;
/***
 *
 * @author Daniel Martin
 *
 *
 * */
import java.lang.reflect.Array;
import java.util.Arrays;
public class EjemplosAPIArrays {

    public static void main(String[] args) {
        byte[] nums = {0,1,2,3,4,8,16,32,64};
        String cadena = Arrays.toString(nums);
        System.out.println(cadena);

        int[] enteros = {-23,3, 22,102,3780,-44};
        Arrays.sort(enteros);
        System.out.println(Arrays.toString(enteros));

        int[] num1 = {1,2,3,4,5};
        int[] num2 = {3,5,6,7};
        int[] num3 = {1,2,3,4,5};

        System.out.println(Arrays.equals(num1,num2));
        System.out.println(Arrays.equals(num1,num3));
    }
}
