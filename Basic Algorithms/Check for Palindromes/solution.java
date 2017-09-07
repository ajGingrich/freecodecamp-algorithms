public class Algorithm {
    public static void main(String[] args) {

        boolean result = checkPalindrome("race car");
        System.out.println(result);
    }

    private static boolean checkPalindrome(String str) {

        //remove all extraneous characters and convert to lowercase
        String trim = str.replaceAll("[^0-9a-zA-z]", "").toLowerCase();

        //reverse it
        char[] arr = trim.toCharArray();
        char[] bar = new char[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            bar[i] = arr[arr.length - 1 - i];
        }
        String reversed = new String(bar);

        //check if reverse is equal to original for a palindrome.
        if (Objects.equals(trim, reversed)) {
            return true;
        }
        return false;
    }
}