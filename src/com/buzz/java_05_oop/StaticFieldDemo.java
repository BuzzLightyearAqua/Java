package com.buzz.java_05_oop;

/**
 * @author BuzzLightyear
 * @illustrate:静态字段
 * @data 2022/9/8 20:41
 */
public class StaticFieldDemo {
    public static void main(String[] args) {
        Person5 Year = new Person5("Year", 20);
        Person5 Buzz = new Person5("Buzz", 22);
        Year.number = 100;
        System.out.println(Year.number);
        Buzz.number = 200;
        System.out.println(Buzz.number);
    }
}

class Person5 {
    public String name;
    public Integer age;

    public static Integer number;

    public Person5(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
