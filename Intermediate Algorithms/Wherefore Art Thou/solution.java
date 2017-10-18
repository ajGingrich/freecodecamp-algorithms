import java.util.*;

public class HelloWorld {

    public static void main(String[] args) {

        //create collection of List of Hashmaps
        List<Map<String, String>> param = new ArrayList<>();

        //add to res
        Map<String, String> a = new HashMap<>();
        a.put("a", "1");
        a.put("b", "2");
        param.add(a);

        Map<String, String> b = new HashMap<>();
        b.put("a", "1");
        param.add(b);

        Map<String, String> c = new HashMap<>();
        c.put("a", "1");
        c.put("b", "2");
        c.put("c", "2");
        param.add(c);

        //create source
        Map<String, String> source = new HashMap<>();
        source.put("a", "1");
        source.put("c", "2");

        String res = Arrays.deepToString(whatIsInAName(param, source).toArray());
        System.out.println(res);
    }

    private static List<Map<String, String>> whatIsInAName(List<Map<String, String>> collection, Map<String, String> source) {
        List<Map<String, String>> res = new ArrayList<>();

        for (Map<String, String> map: collection) {
            boolean hasAll = true;
            for (Map.Entry<String, String> entry : source.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();

                if (map.containsKey(key)) {
                    if (!map.get(key).equals(value)) {
                        hasAll = false;
                    }
                } else {
                    hasAll = false;
                }
            }
            if (hasAll) res.add(map);
        }
        return res;
    }
}