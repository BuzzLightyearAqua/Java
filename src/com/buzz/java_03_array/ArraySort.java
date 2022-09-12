package com.buzz.java_03_array;

import java.util.Arrays;

/**
 * @author BuzzLightyear
 * @illustrate:冒泡排序(比较相邻的两个元素,如果第一个比第二个大,就交换)
 * @data 2022/9/7 20:25
 */
public class ArraySort {
    public static void main(String[] args) {
        int[] arrays = {28, 12, 89, 73, 65, 18, 96, 50, 8, 36};
        //排序前
        System.out.println(Arrays.toString(arrays));
        //开始排序
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays.length - i - 1; j++) {
                if (arrays[j] > arrays[j + 1]) {
                    int tmp = arrays[j];
                    arrays[j] = arrays[j + 1];
                    arrays[j + 1] = tmp;
                }
            }
        }
        //排序后
        System.out.println(Arrays.toString(arrays));
    }
}
