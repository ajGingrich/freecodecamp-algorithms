import java.util.*;

public class Algorithm {
    public static void main(String[] args) {

        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(5, 2, 1, 4));
        ArrayList<Integer> third = new ArrayList<>(Arrays.asList(2, 1));
        ArrayList<Integer> fourth = new ArrayList<>(Arrays.asList(6, 7, 8));

        List<Integer> result = uniteUnique(first, second, third, fourth);
        System.out.println(result);
    }

    private static List<Integer> uniteUnique(ArrayList<Integer>... args) {
        List<Integer> res = new ArrayList<>();

        for (int i=0; i<args.length; i++) {
            for (Integer num: args[i]) {
                if (!res.contains(num)) {
                    res.add(num);
                }
            }
        }
        return res;
    }
}