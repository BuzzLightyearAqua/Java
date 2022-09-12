package com.buzz.java_05_oop;

/**
 * @author BuzzLightyear
 * @illustrate:静态方法
 * @data 2022/9/9 9:00
 */
public class StaticMethodDemo {
    public static void main(String[] args) {
        //调用实例方法必须通过一个实例变量，而调用静态方法则不需要实例变量，通过类名就可以调用
        Person6.setNumber(100);
        System.out.println(Person6.getNumber());
    }
}

class Person6 {
    public static int number;

    public static int getNumber() {
        return number;
    }

    public static void setNumber(int value) {
        number = value;
    }
}