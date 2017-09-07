public class Algorithm {
    public static void main(String[] args) {

        String result = truncateString("Peter Piper picked a peck of pickled peppers", 2);
        System.out.println(result);
    }

    private static String truncateString(String str, int num) {
        if (num <= 3) {
            return str.substring(0, num) + "...";
        } else if (num < str.length()){
            return str.substring(0, num-3) + "...";
        } else {
            return str;
        }
    }
}