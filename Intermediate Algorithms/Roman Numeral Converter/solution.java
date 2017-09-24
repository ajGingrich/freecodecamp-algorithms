public class Algorithm {
    public static void main(String[] args) {

        String result = convertToRoman(3999);
        System.out.println(result);
    }

    private static String convertToRoman(int num) {
        String res = "";
        String[] romans = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XX", "XXX", "XL",
                "L", "LX", "LXX", "LXXX", "XC", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};

        //get thousands, hundreds, tens and ones,
        int thousands = (num/1000)*1000;
        int hundreds = ((num-thousands)/100)*100;
        int tens = ((num-thousands-hundreds)/10)*10;
        int ones = num-thousands-hundreds-tens;

        if (thousands != 0) {
            for (int i=0; i<thousands; i += 1000) {
                res += "M";
            }
        }

        if (hundreds != 0) res += romans[(hundreds/100)+ 17];
        if (tens != 0) res += romans[(tens/10)+8];
        if (ones != 0) res += romans[ones-1];

        return res;
    }
}