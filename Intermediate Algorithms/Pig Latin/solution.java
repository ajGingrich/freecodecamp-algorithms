public class HelloWorld {
    public static void main(String[] args) {
        String result = pigLatin("eight");
        System.out.println(result);
    }

    private static String pigLatin(String word) {

        String vowels = "aeiou";
        // determine first vowel
        int first = 0;
        for (int i=0; i<word.length(); i++) {
            if (vowels.indexOf(word.charAt(i)) != -1) {
                first = i;
                break;
            }
        }

        if (first == 0) {
            word += "way";
        } else {
            word = word.substring(first) + word.substring(0, first) + "ay";
        }
        return word;
    }
}