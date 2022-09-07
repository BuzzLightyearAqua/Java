package com.buzz.java_04_process_control;

/**
 * @author BuzzLightyear
 * @illustrate:for循环(初始条件;循环检测条件;循环后更新计数器)
 * @data 2022/9/7 19:58
 */
public class ForDemo {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = +i;
        }
        System.out.println(sum);
        /*for each循环*/
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i : array) {
            System.out.print(i);
        }
    }
}
