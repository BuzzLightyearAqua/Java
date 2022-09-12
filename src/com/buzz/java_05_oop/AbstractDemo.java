package com.buzz.java_05_oop;

/**
 * @author BuzzLightyear
 * @illustrate:
 * @data 2022/9/8 9:18
 */
public class AbstractDemo {
    public static void main(String[] args) {
        Person3 person3 = new Student();
        person3.run();
    }
}

/**
 * 抽象类
 * 如果一个类定义了方法,但没有具体的执行代码,这个方法就是抽象方法,用abstract修饰
 * 有抽象方法的类一定是抽象类
 */
abstract class Person3 {
    public abstract void run();
}

class Student extends Person3 {
    @Override
    public void run() {
        System.out.println("Student.run");
    }
}
