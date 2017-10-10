public class Algorithm {

    public static void main(String[] args) {
        int[] param = {1, 3, 24, 5, 8, 9};

        Integer res = filter(param, (i) -> i % 2 == 0);
        System.out.println(res);
    }

    interface passFunc {
        boolean test(int num);
    }

    private static Integer filter(int[] arr, passFunc lambda) {
        int[] filteredNumbers = Arrays.stream( arr ).filter( i -> lambda.test(i)).toArray();
        if (filteredNumbers.length > 0) {
            return filteredNumbers[0];
        }
        return null;
    }
}