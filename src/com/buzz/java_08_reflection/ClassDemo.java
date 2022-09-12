package com.buzz.java_08_reflection;

/**
 * @author BuzzLightyear
 * @illustrate:
 * @data 2022/9/12 16:38
 */
public class ClassDemo {
    public static void main(String[] args) {
        printClassInfo(" ".getClass());
        printClassInfo(Runnable.class);
        printClassInfo(java.time.Month.class);
        printClassInfo(String[].class);
        printClassInfo(int.class);
    }
    static void printClassInfo(Class cls) {
        System.out.println("Class name:"+cls.getName());
        System.out.println("Simple name:"+cls.getSimpleName());
        if (cls.getPackage() != null){
            System.out.println("Package name:"+cls.getPackage().getName());
        }
        System.out.println("is interface:"+cls.getInterfaces());
        System.out.println("is enum:" + cls.isEnum());
        System.out.println("is array:"+cls.isArray());
        System.out.println("is primitive:"+cls.isPrimitive());  //是否是原始数据(基本数据)
    }
}
