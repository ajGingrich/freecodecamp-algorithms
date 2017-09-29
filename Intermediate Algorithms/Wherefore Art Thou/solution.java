import java.util.*;

public class Algorithm {
    public static void main(String[] args) {
        List<Object> collection = new ArrayList<>();
        List<Object> source = new ArrayList<>();

        collection.add(new Data("a", 1));
        collection.add(new Data("a", 1));
        collection.add(new Data("a", 1));
        collection.add(new Data("b", 2));

        source.add(new Data("a", 1));

        String result = Arrays.toString(whatIsInAName(collection, source).toArray());
        System.out.println(result);
    }

    private static List<Object> whatIsInAName(List<Object> collection, List<Object> source) {
        List<Object> result = new ArrayList<>();

        for (int j=0; j < collection.size(); j++) {
            for (int i=0; i < source.size(); i++) {
                if (((Data)collection.get(j)).getData().equals(((Data)source.get(i)).getData())) {
                    result.add(new Data(((Data)collection.get(j)).getKey(), ((Data)collection.get(j)).getValue()));
                }
            }
        }
        return result;
    }
}