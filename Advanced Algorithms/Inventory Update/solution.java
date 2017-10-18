package com.example.helloworld;

import java.util.*;

public class HelloWorld {

    public static void main(String[] args) {
        //init param
        String[][] param = new String[4][2];
        param[0][0] = "21";
        param[0][1] = "Bowling Ball";
        param[1][0] = "2";
        param[1][1] = "Dirty Sock";
        param[2][0] = "1";
        param[2][1] = "Hair Pin";
        param[3][0] = "5";
        param[3][1] = "Microphone";

        String[][] arr2 = new String[4][2];
        arr2[0][0] = "2";
        arr2[0][1] = "Hair Pin";
        arr2[1][0] = "3";
        arr2[1][1] = "Half-Eaten Apple";
        arr2[2][0] = "67";
        arr2[2][1] = "Bowling Ball";
        arr2[3][0] = "7";
        arr2[3][1] = "Toothpaste";

        String res = Arrays.deepToString(updateInventory(param, arr2).toArray());
        System.out.println(res);
    }

    private static ArrayList<List<String>> updateInventory(String[][] arr1, String[][] arr2) {
        // init result
        ArrayList<List<String>> res = new ArrayList<List<String>>();

        ArrayList<String> props = new ArrayList<>();

        for (int i=0; i<arr1.length; i++) {
            //update props array
            props.add(arr1[i][1]);

            //add to res
            List<String> x = new ArrayList<>();
            x.add(arr1[i][0]);
            x.add(arr1[i][1]);
            res.add(x);
        }

        for (int j=0; j<arr2.length; j++) {
            if (props.contains(arr2[j][1])) {
                //update existing num
                int index = props.indexOf(arr2[j][1]);
                int num = Integer.parseInt(arr2[j][0]);
                num += Integer.parseInt(res.get(index).get(0));

                res.get(index).set(0, Integer.toString(num));
            } else {
                //add to res
                List<String> x = new ArrayList<>();
                x.add(arr2[j][0]);
                x.add(arr2[j][1]);
                res.add(x);
            }
        }

        //sort result
        final Comparator<List<String>> comparator = new Comparator<List<String>>() {
            public int compare(List<String> pList1, List<String> pList2) {
                return pList1.get(1).compareTo(pList2.get(1));
            }
        };
        Collections.sort(res, comparator);
        return res;
    }
}