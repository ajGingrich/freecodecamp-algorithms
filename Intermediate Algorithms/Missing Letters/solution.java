public class Algorithm {
    public static void main(String[] args) {
        char result = missingLetters("abcdefhij");
        System.out.println(result);
    }

    private static char missingLetters(String range) {
        //set to 'null' character value
        char res = Character.MIN_VALUE;

        for (int c=1; c<range.length(); c++) {
            if ((int)range.charAt(c) != (int)range.charAt(c-1)+1) {
                res = (char)((int)range.charAt(c)-1);
                break;
            }
        }
        return res;
    }
}