public class Algorithm {
    public static void main(String[] args) {

        int result = longestWord("What is the average airspeed velocity of an unladen swallow");
        System.out.println(result);
    }

    private static int longestWord(String str) {

        //make character array
        String[] split = str.split(" ");
        int longest = 0;

        //use a for each loop
        for (String word : split) {
            if (word.length() > longest) {
                longest = word.length();
            }
        }

        return longest;
    }
}