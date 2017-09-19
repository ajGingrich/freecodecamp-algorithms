import java.util.*;
import java.util.stream.Collectors;

public class Algorithm {
    public static void main(String[] args) {

        List<Integer> param = Arrays.asList(1, 2, 3, 1, 2, 3);

        List<Integer> result = seekDestroy(param, 2, 3);
        System.out.println(result);
    }

    private static List<Integer> seekDestroy(List<Integer> list, Integer... args) {
        List<Integer> arguments = Arrays.asList(args);
        return list.stream().filter(n -> !arguments.contains(n)).collect(Collectors.toList());
    }
}