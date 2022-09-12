package com.buzz.java_05_oop;

/**
 * @author BuzzLightyear
 * @illustrate:
 * @data 2022/9/8 9:38
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        Person4 p = new Student4("Lucy");
        p.run();
    }
}

interface Person4 {
    String getName();

    //接口中可以包含方法体,从而使得接口在进行扩展的时候,不会破坏与接口相关的实现类代码
    default void run() {
        System.out.println(getName() + " run");
    }
}

class Student4 implements Person4 {
    private String name;

    public Student4(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}
