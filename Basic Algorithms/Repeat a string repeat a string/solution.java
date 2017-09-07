public class Algorithm {
    public static void main(String[] args) {

        String result = confirmEnding("abc", 4);
        System.out.println(result);
    }

    private static String confirmEnding(String str, int num) {

        //check if string is not a positive integer
        if (num <= 0) {
            return "";
        } else {
            String res = "";
            for (int i=0; i<num; i++) {
                res += str;
            }
            return res;
        }
    }
}