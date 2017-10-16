public class HelloWorld {
    private int count = 0;

    public static void main(String[] args) {

        int res = new HelloWorld().permAlone("abcdefa");
        System.out.println(res);
    }

    private int permAlone(String string) {

        // make character array
        char[] c = new char[string.length()];
        for (int i=0; i<string.length(); i++) {
            c[i] = string.charAt(i);
        }

        permute(c, c.length);
        return this.count;
    }

    private void permute(char[] arr, int n) {
        //Heaps Algorithm
        if (n == 1) {
            if (hasNoRepeats(arr)) {
                this.count++;
            }
        } else {
            for (int i=0; i<n; i++) {
                permute(arr, n-1);
                if (n % 2 == 1) {
                    swap(arr, 0, n-1);
                } else {
                    swap(arr, i, n-1);
                }
            }
        }
    }

    private static void swap(char[] arr, int a, int b) {
        char temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }

    private boolean hasNoRepeats(char[] arr) {
        for (int i=0; i<arr.length-1; i++) {
            if (arr[i] == arr[i+1]) {
                return false;
            }
        }

        return true;
    }
}