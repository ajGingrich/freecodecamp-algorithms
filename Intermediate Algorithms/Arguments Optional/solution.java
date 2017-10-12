public class Algorithm {

    public static void main(String[] args) {

        // can't pass additional parameter in Java
        int res = addTogether(2);
        System.out.println(res);
    }

    private static int addTogether(int ...args) {
        int num1 = args[0];

        if (args.length == 2) {
            int num2 = args[1];
            return num1 + num2;
        } else {
            return add(num1);
        }
    }

    private static int add(int a, int ...args) {
        return a + args[0];
    }
}