import java.util.Arrays;

public class Algorithm {
    public static void main(String[] args) {

        int param[][] = {{13, 27, 18, 26}, {4, 5, 1, 3}, {32, 35, 37, 39}, {1000, 1001, 857, 1}};

        //convert to String to print for checking
        String result = Arrays.toString(largestOfFour(param));

        System.out.println(result);
    }

    private static int[] largestOfFour(int[][] arr) {

        //set initial maxes to 0
        int res[] = {0, 0, 0, 0};

        //set outside loop
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j < arr[i].length; j++) {
                if (arr[i][j] > res[i]) {
                    res[i] = arr[i][j];
                }
            }
        }

        return res;
    }
}