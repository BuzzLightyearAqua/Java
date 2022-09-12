package com.buzz.java_06_core_classes;

/**
 * @author BuzzLightyear
 * @illustrate:String(在Java中,String是一个引用类型,本身也是一个class)
 * @data 2022/9/9 9:10
 */
public class StringDemo {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1);
        System.out.println("==字符串比较==");
        /*
            在Java编译期间,会把相同字符串当作一个对象放入常量值
            两个字符串比较必须使用equals()方法
        */
        System.out.println(s1 == s2);   //true
        System.out.println(s1.equals(s2));  //true
    }
}
/**
 * public final class String
 * 因为内部通过private final修饰 所以字符串不可变
 */
