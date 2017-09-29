public class Algorithm {
    public static void main(String[] args) {
        String result = searchReplace("A quick brown fox jumped over the lazy dog", "jumped", "leaped");
        System.out.println(result);
    }

    private static String searchReplace(String sentence, String search, String replace) {

        String[] words = sentence.split("\\s+");

        //use a StringJoiner
        StringJoiner joiner = new StringJoiner(" ");

        for (String word: words) {
            if (word.equals(search)) {
                if (Character.isUpperCase(word.charAt(0))) {
                    joiner.add(replace.substring(0, 1).toUpperCase() + replace.substring(1).toLowerCase());
                } else {
                    joiner.add(replace);
                }
            } else {
                joiner.add(word);
            }
        }
        return joiner.toString();
    }
}