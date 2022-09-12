package com.buzz.java_09_collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author BuzzLightyear
 * @illustrate:
 * @data 2022/9/12 19:45
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> list = List.of("A", "B", "C");
        for (String s : list
        ) {
            System.out.println(s);
        }


        System.out.println(list.size());
    }
}
