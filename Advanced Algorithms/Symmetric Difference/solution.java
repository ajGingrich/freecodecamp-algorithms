import java.util.*;

public class HelloWorld {

    public static void main(String[] args) {

        Integer[] param1  = {3, 3, 3, 2, 5};
        Integer[] param2  = {2, 1, 5, 7};
        Integer[] param3  = {3, 4, 6, 6};
        Integer[] param4  = {1, 2, 3};
        Integer[] param5  = {5, 3, 9, 8};
        Integer[] param6  = {1};

        String res = Arrays.toString(sym(param1, param2, param3, param4, param5, param6));
        System.out.println(res);
    }

    private static Integer[] sym(Integer[] ...args) {
        Integer[] result = diff(args[0], args[1]);

        for (int i=2; i<args.length; i++) {
            result = diff(result, args[i]);
        }

        Arrays.sort(result);
        return result;
    }

    private static Integer[] diff(Integer[] arr1, Integer[] arr2) {
        ArrayList<Integer> res = new ArrayList<>();

        for (Integer i: arr1) {
            if (!Arrays.asList(arr2).contains(i) && !res.contains(i)) {
                res.add(i);
            }
        }
        for (int j: arr2) {
            if (!Arrays.asList(arr1).contains(j) && !res.contains(j)) {
                res.add(j);
            }
        }

        //convert ArrayList back to array
        Integer[] arr = new Integer[res.size()];
        for (int k=0; k<res.size(); k++) {
            arr[k] = res.get(k);
        }
        return arr;
    }
}