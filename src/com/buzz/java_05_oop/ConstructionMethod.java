package com.buzz.java_05_oop;

/**
 * @author BuzzLightyear
 * @illustrate:
 * @data 2022/9/8 8:55
 */
public class ConstructionMethod {
    public static void main(String[] args) {
        Person2 person2 = new Person2("Jack", 22);
        System.out.println(person2.getName() + "," + person2.getAge());
    }
}

class Person2 {
    private String name;
    private Integer age;

    //默认构造方法,编译器会自动生成
    public Person2() {
    }

    //有参构造方法,可以一次性传入属性去创造一个实例
    public Person2(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
/**
 * 方法重载：在同一个类中可以定义多个方法,方法名相同,参数不同;
 */