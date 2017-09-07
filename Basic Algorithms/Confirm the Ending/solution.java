public class Algorithm {
    public static void main(String[] args) {

        boolean result = confirmEnding("Open sesame", "pen");
        System.out.println(result);
    }

    private static boolean confirmEnding(String original, String end) {

        if (original.substring(original.length() - end.length()).equals(end)) {
            return true;
        }
        return false;
    }
}