public class HelloWorld {
    public static void main(String[] args) {

        int[] param = {1, 13};
        Integer result = smallestCommons(param);
        System.out.println(result);
    }

    private static Integer smallestCommons(int[] arr) {
        int largest;
        int smallest;

        //get largest and smallest
        if (arr[1] > arr[0]) {
            largest = arr[1];
            smallest = arr[0];
        } else {
            largest = arr[0];
            smallest = arr[1];
        }

        int scm = largest * (largest-1);
        boolean found = false;

        while (!found) {
            for (int i=smallest; i<=largest; i++) {
                if (scm % i != 0) {
                    scm += largest;
                    break;
                }
                if (i == largest && scm % i == 0) {
                    found = true;
                }
            }
        }
        return scm;
    }
}