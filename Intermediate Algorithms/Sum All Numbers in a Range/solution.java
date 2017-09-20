public class Algorithm {
    public static void main(String[] args) {

        int[] param = {5, 10};
        int result = sumRange(param);
        System.out.println(result);
    }

    private static int sumRange(int[] input) {
        int res = 0;
        if (input[0] > input[1]) {
            for (int i=input[0]; i>=input[1]; i--) {
                res += i;
            }
        } else {
            for (int i=input[0]; i<=input[1]; i++) {
                res += i;
            }
        }
        return res;
    }
}