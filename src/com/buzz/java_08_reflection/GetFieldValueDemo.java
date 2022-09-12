package com.buzz.java_08_reflection;

import java.lang.reflect.Field;

/**
 * @author BuzzLightyear
 * @illustrate:
 * @data 2022/9/12 17:46
 */
public class GetFieldValueDemo {
    public static void main(String[] args) throws Exception {
        Object p = new Person2("Xiao Ming");
        Class c = p.getClass();
        Field f = c.getDeclaredField("name");
        f.setAccessible(true);
        Object value = f.get(p);    //不管字段是不是public 一律允许访问
        System.out.println(value);
    }
}

class Person2 {
    private String name;

    public Person2(String name){
        this.name = name;
    }
}
