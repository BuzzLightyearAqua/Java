package com.buzz.java_04_process_control;

import java.util.Scanner;   //import是导入某个类的语句(必须放到开头)

/**
 * @author BuzzLightyear
 * @illustrate:
 * @data 2022/9/7 17:04
 */
public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   //创建Scanner对象
        System.out.println("Input your name:"); //打印提示
        String name = scanner.nextLine();   //获取一行输入并获取字符串
        System.out.println("Input your age:");  //打印提示
        int age = scanner.nextInt();    //获取一行输入并获取整数
        System.out.println("Hi," + name + " you are " + age + " years old");
    }
}
/*
*   ①创建Scanner对象并传入System.in(标准输入流);System.out(标准输出流)
*   ②scanner.nextLine() 读取用户输入的字符串
*/