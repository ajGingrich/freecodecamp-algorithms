import java.util.Arrays;

public class Algorithm {
    public static void main(String[] args) {

        int[] param = {0, 1, 2, 3, 4, 5};

        //convert deep to String to print for checking
        String result = Arrays.deepToString(chunkyMonkey(param, 3));
        System.out.println(result);
    }

    private static int[][] chunkyMonkey(int[] arr, int size) {

        int length = arr.length/size;
        //if it is not a whole number, round the length up
        if (arr.length % size != 0) {
            length++;
        }

        int[][] res = new int[length][];

        for (int i=0; i < length; i++) {
            //trim empty values if they exist
            if (size*(i+1) > arr.length) {
                res[i] = (Arrays.copyOfRange(arr, size*i, arr.length));
            } else {
                res[i] = (Arrays.copyOfRange(arr, size*i, size*(i+1)));
            }
        }
        return res;
    }
}