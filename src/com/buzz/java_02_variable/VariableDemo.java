package com.buzz.java_02_variable;

/**
 * @author BuzzLightyear
 * @illustrate:基本类型变量
 *    基本数据类型是CPU可以直接进行运算的变量；
 *    Java定义了以下几种基本数据类型：
 *      + 整数：byte int short long
 *      + 浮点型：float double
 *      + 字符型：char
 *      + 布尔型：true false
 * @data 2022/9/7 16:38
 */
public class VariableDemo {
    public static void main(String[] args) {
        int x = 100;    //定义int类型变量x 并赋初始值100
        System.out.println(x);  //打印该变量的值
        x = 200;    //重新赋值为200
        System.out.println(x);  //打印该变量的值(200)
        int y = x;  //将变量x的值赋予变量y
        System.out.println(y);  //打印变量y的值(200)
    }
}
