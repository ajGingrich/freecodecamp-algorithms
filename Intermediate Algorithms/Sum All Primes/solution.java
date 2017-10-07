public class Algorithm {
    public static void main(String[] args) {

        Integer result = sumPrimes(977);
        System.out.println(result);
    }

    private static Integer sumPrimes(Integer num) {
        Integer sum = 2; //add two from the beginning

        for (int i=3; i <= num; i++) {
            boolean prime = true;
            if (i % 2 == 0) continue;

            //only have to check until square root
            for (int j=3; j <= Math.sqrt(i); j+=2) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) sum += i;
        }
        return sum;
    }
}