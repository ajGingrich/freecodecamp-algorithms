import java.util.*;

public class Algorithm {
    public static void main(String[] args) {

        String result = spinalCase("AllThe-small Things");
        System.out.println(result);
    }

    private static String spinalCase(String sentence) {
        String[] words = sentence.split("\\s+|_|(?=[A-Z])");

        //use a StringJoiner
        StringJoiner joiner = new StringJoiner("-");

        for (String word: words) {
            joiner.add(word.toLowerCase());
        }

        return joiner.toString();
    }
}