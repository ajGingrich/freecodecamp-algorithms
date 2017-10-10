public class Algorithm {

    public static void main(String[] args) {
        String res = binaryAgent("01001001 00100000 01101100 01101111 01110110 01100101 00100000 " +
                "01000110 01110010 01100101 01100101 01000011 01101111 01100100 01100101 01000011 01100001 01101101 " +
                "01110000 00100001");
        System.out.println(res);
    }

    private static String binaryAgent(String string) {
        String[] arr = string.split("\\s+");
        char[] chars = new char[arr.length];

        for (int i=0; i<arr.length; i++) {
            chars[i] = (char)Integer.parseInt(arr[i], 2);
        }

        return new String(chars);
    }
}