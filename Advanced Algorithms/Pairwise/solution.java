import java.util.*;

public class HelloWorld {

    ArrayList<Integer> matches = new ArrayList<>();
    ArrayList<Integer> temp = new ArrayList<>();

    public static void main(String[] args) {
        ArrayList<Integer> param = new ArrayList<>(Arrays.asList(1, 3, 2, 4));

        int res = new HelloWorld().pairwise(param, 4);
        System.out.println(res);
    }

    private int pairwise(ArrayList<Integer> arr, Integer total) {
        for (Integer item: arr) {
            this.temp.add(item);
        }
        getMatches(this.temp, total);
        return getIndices(this.matches, arr);
    }

    private void getMatches(ArrayList<Integer> arr, Integer total) {
        boolean noMatch = true;

        for (int i=1; i<arr.size(); i++) {
            if (arr.get(0) + arr.get(i) == total) {
                //add to matches
                this.matches.add(arr.get(0));
                this.matches.add(arr.get(i));

                //remove from temp
                this.temp.remove(arr.get(i));
                this.temp.remove(0);

                noMatch = false;
                if (this.temp.size() > 1) {
                    getMatches(this.temp, total);
                }
            }
        }
        if (noMatch) {
            this.temp.remove(0); //remove first one
            if (this.temp.size() > 1) {
                getMatches(this.temp, total);
            }
        }
    }

    private int getIndices(ArrayList<Integer> matches, ArrayList<Integer> array) {
        int count = 0;
        for (Integer item: matches) {
            int index = array.indexOf(item);
            count += index;
            array.set(index, -3000);
        }
        return count;
    }
}