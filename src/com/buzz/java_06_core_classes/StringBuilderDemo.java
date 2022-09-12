package com.buzz.java_06_core_classes;

/**
 * @author BuzzLightyear
 * @illustrate:StringBuilder
 * @data 2022/9/9 9:27
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        //StringBuilder是一个可变对,可以预分一个缓冲区(线程不安全)
        StringBuilder sb = new StringBuilder(1024);
        //链式操作
        sb.append("Buzz")
                .append("Light")
                .append("Year")
                .insert(0, "Hello, ");  //插入指定位置
        System.out.println(sb.toString());
    }
}
