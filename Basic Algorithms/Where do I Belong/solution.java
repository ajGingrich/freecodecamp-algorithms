import java.util.*;

public class Algorithm {
    public static void main(String[] args) {

        List<Integer> param = Arrays.asList(2, 5, 10);

        int result = findPlace(param, 15);
        System.out.println(result);
    }

    private static int findPlace(List<Integer> list, int insert) {
        list.sort(Comparator.naturalOrder());
        int i = 0;
        for (Integer num:list) {
            if (insert <= num)
                break;
            else
                i++;
        }
        return i;
    }
}