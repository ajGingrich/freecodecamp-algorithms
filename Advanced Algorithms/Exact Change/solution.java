import java.util.*;

public class HelloWorld {

    public static void main(String[] args) {
        //init param
        String[][] param = new String[9][2];
        param[0][0] = "PENNY";
        param[0][1] = "1.01";
        param[1][0] = "NICKEL";
        param[1][1] = "2.05";
        param[2][0] = "DIME";
        param[2][1] = "3.10";
        param[3][0] = "QUARTER";
        param[3][1] = "4.25";
        param[4][0] = "ONE";
        param[4][1] = "90.00";
        param[5][0] = "FIVE";
        param[5][1] = "55.00";
        param[6][0] = "TEN";
        param[6][1] = "20.00";
        param[7][0] = "TWENTY";
        param[7][1] = "60.00";
        param[8][0] = "ONE HUNDRED";
        param[8][1] = "100.00";

        String res = Arrays.deepToString(checkCashRegister(3.26, 100.00, param).toArray());
        System.out.println(res);
    }

    private static ArrayList<List<String>> checkCashRegister(double price, double cash, String[][] cid) {
        double change = cash - price;
        double[] values = {100,20,10,5,1,0.25,0.1,0.05,0.01};

        //reverse cid so it is top down
        String[][] reverse = reverse(cid);
        double drawer = 0;

        // init result
        ArrayList<List<String>> cambio = new ArrayList<List<String>>();

        for (int i=0; i<reverse.length; i++) {
            double currentNumber = Double.parseDouble(reverse[i][1]);

            if (change/values[i] >= 1 && currentNumber >= values[i]) {
                drawer = (Math.floor(change/values[i]))*values[i];

                if (drawer > currentNumber) drawer = currentNumber;


                //add to result
                List<String> x = new ArrayList<>();
                x.add(reverse[i][0]);
                x.add(Double.toString(drawer));
                cambio.add(x);

                change -= drawer;
                //round to two decimal places
                double temp = Math.round(change *100);
                change = temp/100;
                reverse[i][1] = Double.toString(currentNumber - drawer);
            }
        }

        //return insufficient funds
        if (drawer < change) {
            //clear it first
            for (int i=0; i<cambio.size(); i++){
                cambio.get(i).clear();
            }
            List<String> x = new ArrayList<>();
            x.add("Insufficient Funds");
            cambio.add(x);
            return cambio;
        }
        double cashLeft = 0;
        for (int j=0; j<reverse.length; j++) {
            cashLeft += Double.parseDouble(reverse[j][1]);
        }
        if (cashLeft == 0) {
            for (int i=0; i<cambio.size(); i++){
                cambio.get(i).clear();
            }
            List<String> x = new ArrayList<>();
            x.add("Closed");
            cambio.add(x);
            return cambio;
        }

        return cambio;
    }

    public static String[][] reverse(String[][] arr) {
        for (int i=0; i < (arr.length/2); i++) {
            String[] temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        return arr;
    }
}