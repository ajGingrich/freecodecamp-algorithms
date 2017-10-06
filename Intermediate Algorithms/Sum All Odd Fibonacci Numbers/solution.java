import java.util.*;

public class Algorithm {
    public static void main(String[] args) {

        Integer result = sumFibs(75024);
        System.out.println(result);
    }

    private static Integer sumFibs(Integer num) {
        ArrayList<Integer> sequence = new ArrayList<>();
        sequence.add(1);
        sequence.add(1);
        Integer sum = 2;
        Integer fib = 2;

        while (fib <= num) {
            if (fib % 2 != 0) sum += fib;
            fib = sequence.get(sequence.size()-1) + sequence.get(sequence.size()-2);
            sequence.add(fib);
        }

        return sum;
    }
}