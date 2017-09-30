import java.util.*;

public class Algorithm {
    public static void main(String[] args) {
        ArrayList<Character[]> result = pairElement("TTGAG");
        for (Character[] array: result) {
            System.out.println(Arrays.toString(array));
        }
    }

    private static ArrayList<Character[]> pairElement(String strand) {
        ArrayList<Character[]> result = new ArrayList<>();

        //create a hash map with matching properties
        Map<Character, Character> dictionary = new HashMap<>();
        dictionary.put('G', 'C');
        dictionary.put('C', 'G');
        dictionary.put('A', 'T');
        dictionary.put('T', 'A');

        for (int c=0; c<strand.length(); c++) {
            Character[] pair = {strand.charAt(c), dictionary.get(strand.charAt(c))};
            result.add(pair);
        }
        return result;
    }
}