public class Algorithm {
    public static void main(String[] args) {

        int factorial = factorializeNumber(8);
        System.out.println(factorial);
    }

    public static int factorializeNumber(int x) {

        int sum = 1;
        //check if one
        if (x == 1) {
            return sum;
        } else {
            for (int i=1; i <= x; i++ ) {
                sum *= i;
            }
        }
        return sum;
    }
}