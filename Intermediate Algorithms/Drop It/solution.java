import java.util.*;

public class Algorithm {

    public static void main(String[] args) {
        ArrayList<Integer> param = new ArrayList<>(Arrays.asList(1, 2, 3, 7, 4));

        String res = Arrays.toString(dropElements(param, (i) -> i > 3).toArray());
        System.out.println(res);
    }

    interface passFunc {
        boolean test(int num);
    }

    private static ArrayList<Integer> dropElements(ArrayList<Integer> arr, passFunc lambda) {
        ArrayList<Integer> copy = new ArrayList<>(arr);

        for (int i: copy) {
            if (lambda.test(i)) {
                break;
            } else {
                arr.remove(0);
            }
        }
        return arr;
    }
}