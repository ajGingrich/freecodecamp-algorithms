public class Algorithm {
    public static void main(String[] args) {
        String result = titleCase("sHoRt AnD sToUt");
        System.out.println(result);
    }

    private static String titleCase(String str) {

        //make string array
        String[] split = str.split(" ");

        //make new array for the results
        String[] result = new String[split.length];

        //use a StringJoiner
        StringJoiner joiner = new StringJoiner(" ");

        //upper case first letter, add rest of string and add to string joiner
        for (int i=0; i<split.length; i++) {
            result[i] = split[i].substring(0,1).toUpperCase() + split[i].substring(1).toLowerCase();
            joiner.add(result[i]);
        }

        return joiner.toString();
    }
}