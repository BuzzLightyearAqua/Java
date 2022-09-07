package com.buzz.java_04_process_control;

/**
 * @author BuzzLightyear
 * @illustrate:do-while循环： do while循环时先执行循环在判断条件,条件满足时继续执行,不满足则停止;
 * @data 2022/9/7 19:53
 */
public class DoWhileDemo {
    public static void main(String[] args) {
        int sum = 1;
        do {
            sum++;
        } while (sum < 100);
        {
            System.out.println(sum);
        }
    }
}
