package com.buzz.java_04_process_control;

/**
 * @author BuzzLightyear
 * @illustrate:
 * @data 2022/9/7 17:30
 */
public class IfDemo {
    public static void main(String[] args) {
        int n = 70;
        if (n >= 90) {
            System.out.println("优秀");

        } else if (n >= 60) {
            System.out.println("恭喜你 及格了");
        } else {
            System.out.println("不及格");
        }
        System.out.println("END");

        String s1 = "hello";
        String s2 = "HELLO";
        if (s1 != null && s1.equals(s2)) {
            /*
                “==”用来比较基本数据类型(int ,double)时候是直接比较数值,比较引用数据类型(class、接口、Arrays)的时候比较的是对象的引用地址;
                equal没有重写之前比较的也是对象的地址,但是重写之后比较的两个对象的内容是不是相同;
            */
            System.out.println("s1 equals s2");
        } else {
            System.out.println("s1 not equals s2");
        }
    }

}
