package com.buzz.java_08_reflection;

import java.lang.reflect.Field;

/**
 * @author BuzzLightyear
 * @illustrate:
 * @data 2022/9/12 19:22
 */
public class SetFieldValueDemo {
    public static void main(String[] args) throws Exception {
        Person3 p = new Person3("XiaoMing");
        System.out.println(p.getName());
        Class c = p.getClass();
        Field f = c.getDeclaredField("name");
        f.setAccessible(true);
        f.set(p,"XIAOMING");
        System.out.println(p.getName());
    }
}
class Person3 {
    private String name;

    public Person3(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}