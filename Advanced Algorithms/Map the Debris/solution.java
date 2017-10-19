import java.util.*;

public class HelloWorld {

    public static void main(String[] args) {

        //create collection of List of Hashmaps
        List<Map<String, String>> param = new ArrayList<>();

        //add to param
        Map<String, String> a = new HashMap<>();
        a.put("name", "iss");
        a.put("avgAlt", "413.6");
        param.add(a);

        Map<String, String> b = new HashMap<>();
        b.put("name", "hubble");
        b.put("avgAlt", "556.7");
        param.add(b);

        Map<String, String> c = new HashMap<>();
        c.put("name", "moon");
        c.put("avgAlt", "378632.55");
        param.add(c);


        String res = Arrays.deepToString(orbitalPeriod(param).toArray());
        System.out.println(res);
    }

    public static List<Map<String, String>> orbitalPeriod(List<Map<String, String>> data){
        double GM = 398600.4418;
        double earthRadius = 6367.4447;
        List<Map<String, String>> res = new ArrayList<>();

        for (Map<String, String> sat: data) {
            double r = earthRadius + Double.parseDouble(sat.get("avgAlt"));
            double orbitalP = Math.round(2*Math.PI*(Math.sqrt((Math.pow(r, 3))/GM)));

            //add to res
            Map<String, String> x = new HashMap<>();
            x.put("name", sat.get("name"));
            x.put("orbitalPeriod", Double.toString(orbitalP));
            res.add(x);
        }
        return res;
    }
}