package com.buzz.java_05_oop;

/**
 * @author BuzzLightyear
 * @illustrate:
 * @data 2022/9/7 21:26
 */
public class PersonDemo {
    public static void main(String[] args) {
        Person Tom = new Person();
        Tom.setName("Tom");
        Tom.setAge(21);
        System.out.println("我是" + Tom.getName() + ",我" + Tom.getAge() + "岁");
    }
}

class Person {
    //private修饰符(外部不可以直接读取private字段,但可以通过getName()和getAge()间接获取)
    private String name;
    private Integer age;

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
