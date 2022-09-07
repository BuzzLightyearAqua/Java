package com.buzz.java_04_process_control;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author BuzzLightyear
 * @illustrate:
 * @data 2022/9/7 17:19
 */
public class Output {
    public static void main(String[] args) {
        System.out.print("A");
        System.out.print("B");
        System.out.print("C");
        System.out.println();   //println是print line的缩写 表示输出并换行
        System.out.println("END");
        /*格式化输出*/
        double d = 13100000;
        System.out.println(d);  //1.31E7(E7表示浮点数)
        double d2 = 3.1415925;
        DecimalFormat format = new DecimalFormat("0.00");
        System.out.println(format.format(d2));
    }
}
