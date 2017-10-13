import java.util.regex.*;

public class Algorithm {

    public static void main(String[] args) {

        boolean res = telephoneCheck("1(555)555-5555");
        System.out.println(res);
    }

    private static boolean telephoneCheck(String num) {

        // make sure doesn't have non number, -, (, )
        Pattern p = Pattern.compile("[^\\d-\\s\\(\\)]");
        Matcher m = p.matcher(num);
        if (m.find()) return false;

        //replace spaces
        Pattern space = Pattern.compile("\\s");
        Matcher s = space.matcher(num);
        num = s.replaceAll("");


        //check if has hyphens and are in right place
        Pattern hyphen = Pattern.compile("-");
        Matcher h = hyphen.matcher(num);

        if (h.find()) {
            if (num.charAt(0) == '-') return false;
            Pattern h1 = Pattern.compile("\\d\\d\\d-\\d\\d\\d\\d");
            Matcher hMatch1 = h1.matcher(num);
            if (!hMatch1.find()) return false;

            //remove hyphen
            num = h.replaceAll("");
        }

        //check parenthesis and spaces are in right place
        if (num.length() == 10) return true;
        if (num.length() == 11 && num.charAt(0) == '1') return true;
        if (num.length() == 12 && num.charAt(0) == '(' && num.charAt(4) == ')') return true;
        if (num.length() == 13 && num.charAt(0) == '1' && num.charAt(1) == '(' && num.charAt(5) == ')') return true;

        return false;
    }
}