import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {

        //use this for integer array
        int[] param = {1, 2, 3};
        String result = Arrays.toString(intSlasherFlick(param, 8));

        //user this for string array
        //String[] param = {"burgers", "fries", "shake"};
        //String result = Arrays.toString(stringSlasherFlick(param, 1));

        System.out.println(result);
    }

    private static String[] stringSlasherFlick(String[] arr, int num) {
        if (num > arr.length) {
            return new String[] {};
        }
        return Arrays.copyOfRange(arr, num, arr.length);
    }

    private static int[] intSlasherFlick(int[] arr, int num) {
        if (num > arr.length) {
            return new int[] {};
        }
        return Arrays.copyOfRange(arr, num, arr.length);
    }
}