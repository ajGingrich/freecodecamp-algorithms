public class ReverseString {
    public static void main(String[] args) {

        String spam = reverseString("The lazy dog jumped over the quick brown fox");
        System.out.println(spam);
    }

    public static String reverseString(String foo) {

        //split into character array
        char[] arr = foo.toCharArray();

        //make a new character array to assign values
        char[] bar = new char[arr.length];

        //reverse
        for (int i=arr.length-1; i>=0; i--) {
            bar[i] = arr[arr.length-1-i];
        }

        //join back into string and return
        return new String(bar);
    }
}