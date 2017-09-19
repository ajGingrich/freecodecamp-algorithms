package com.example.helloworld;

import java.util.*;
import java.util.stream.Collectors;

public class HelloWorld {
    public static void main(String[] args) {

        List<Object> param = new ArrayList<>(Arrays.asList(7, "ate", "", false, 9));

        //convert ArrayList to string
        String result = falsyBouncer(param).stream().map(Object::toString).collect(Collectors.joining(", "));

        System.out.println(result);
    }

    private static ArrayList<Object> falsyBouncer(List<Object> arr) {

        ArrayList<Object> res = new ArrayList<>();

        for (Object item: arr) {

            //determine what exactly is in object
            if (item instanceof Integer)
                if ((int) item != 0) {
                    res.add(item);
                }
                else if (item instanceof String)
                    System.out.println(item);
            if (item.toString().length() > 1) {
                res.add(item);
            }
        }

        return res;
    }
}