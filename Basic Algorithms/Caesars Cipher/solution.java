import java.util.*;

public class Algorithm {
    public static void main(String[] args) {
        String result = caesarsCipher("SERR YBIR?");
        System.out.println(result);
    }

    private static String caesarsCipher(String code) {
        char[] arr = code.toCharArray();
        char[] res = new char[code.length()];

        for (int i=0; i<arr.length; i++) {
            if (Character.isLetter(arr[i])) {
                if (Character.codePointAt(arr, i) >=65 && Character.codePointAt(arr, i) <=77) {
                    res[i] = (char) (Character.codePointAt(arr, i) + 13);
                } else if (Character.codePointAt(arr, i) >77 && Character.codePointAt(arr, i) <=91) {
                    res[i] = (char) (Character.codePointAt(arr, i) - 13);
                }
            } else {
                res[i] = (char) Character.codePointAt(arr, i);
            }
        }
        return new String(res);
    }
}