public class HelloWorld {
    public static void main(String[] args) {

        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(1, 55, 2, 3, 8, 5));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(17, 1, 2, 3, 4, 5, 22));

        String result = Arrays.toString(diffArray(first, second).toArray());
        System.out.println(result);
    }

    private static ArrayList<Integer> diffArray(ArrayList<Integer> firstArray, ArrayList<Integer> secondArray) {
        ArrayList<Integer> res = new ArrayList<>();

        diffOne(firstArray, secondArray, res);
        diffOne(secondArray, firstArray, res);

        return res;
    }

    private static void diffOne(ArrayList<Integer> firstArray, ArrayList<Integer> secondArray, ArrayList<Integer> res) {
        for (int num:firstArray)
            if (!secondArray.contains(num))
                res.add(num);
    }
}