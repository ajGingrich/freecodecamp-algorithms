public class Algorithm {
    public static void main(String[] args) {

        String[] param = {"Alien", "line"};
        boolean result = mutations(param);

        System.out.println(result);
    }

    private static boolean mutations(String[] arr) {

        //convert to lowercase strings
        String first = arr[0].toLowerCase();
        String second = arr[1].toLowerCase();

        for (int i=0; i<second.length(); i++) {
            if (first.indexOf(second.charAt(i)) == -1) {
                return false;
            }
        }
        return true;
    }
}