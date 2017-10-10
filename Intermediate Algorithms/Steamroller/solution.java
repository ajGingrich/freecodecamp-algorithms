import java.util.*;
import java.util.stream.*;

public class Algorithm {

    public static void main(String[] args) {
        Object[] param = { 1, new Object[]{ 2 }, new Object[]{ 3, new Object[] {new Object[] {4}} }};
        //System.out.println("original: "+ Arrays.deepToString(param));

        int[] res = steamrollArray(param).mapToInt(Integer.class::cast).toArray();
        System.out.println(Arrays.toString(res));
    }

    private static Stream<Object> steamrollArray(Object[] array) {
        return Arrays.stream(array)
                .flatMap(o -> o instanceof Object[]? steamrollArray((Object[])o): Stream.of(o));
    }
}