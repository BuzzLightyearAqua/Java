package com.buzz.java_03_array;

/**
 * @author BuzzLightyear
 * @illustrate:数组遍历
 * @data 2022/9/7 20:16
 */
public class EachArray {
    public static void main(String[] args) {
        int[] arrays = {1, 4, 6, 2, 5, 45, 73, 12, 99};
        //正序遍历
        for (int i = 0; i < arrays.length; i++) {
            int j = arrays[i];
            System.out.println(j);
        }
        for (int i : arrays) {
            System.out.println(i);
        }
        //倒序遍历
        for (int i2 = arrays.length-1; i2 >= 0; i2--) {
            int j2 = arrays[i2];
            System.out.println(j2);
        }
    }
}
