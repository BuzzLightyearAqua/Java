package com.buzz.java_08_reflection;

/**
 * @author BuzzLightyear
 * @illustrate:获取字段
 *  对任意的一个Object实例，只要我们获取了它的Class，就可以获取它的一切信息。
 * @data 2022/9/12 17:35
 */

/**
 * Field getField(name)：根据字段名获取某个public的field（包括父类）
 * Field getDeclaredField(name)：根据字段名获取当前类的某个field（不包括父类）
 * Field[] getFields()：获取所有public的field（包括父类）
 * Field[] getDeclaredFields()：获取当前类的所有field（不包括父类）
 */
public class AccessFieldDemo {
    public static void main(String[] args) throws NoSuchFieldException {
        Class stdClass = Student.class;
        System.out.println(stdClass.getField("score"));
        System.out.println(stdClass.getField("name"));
        System.out.println(stdClass.getDeclaredField("grade"));
        //报错：因为grade不是public类型
        System.out.println(stdClass.getField("grade"));
    }
}

class Student extends Person {
    public int score;   //分数
    private int grade;  //年级
}

class Person{
    public String name;
}
