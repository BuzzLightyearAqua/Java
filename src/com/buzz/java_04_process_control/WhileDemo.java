package com.buzz.java_04_process_control;

/**
 * @author BuzzLightyear
 * @illustrate:While循环： while循环在每次循环开始前, 首先判断条件是否成立, 如果结果为true, 则执行循环体内的语句,
 * 如为false,则直接跳到循环末尾,继续执行;
 * @data 2022/9/7 19:44
 */
public class WhileDemo {
    public static void main(String[] args) {
        int sum = 1;
        while (sum <= 100) {    //循环条件为sum<=100
            sum++;  //sum自身+1
        }
        System.out.println(sum);    //101
    }
}
