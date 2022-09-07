package com.buzz.java_04_process_control;

/**
 * @author BuzzLightyear
 * @illustrate:Switch语句:
 *      根据switch(表达式)计算的结果,跳转到匹配的case结果,然后继续执行,遇到break结束执行;
 * @data 2022/9/7 19:36
 */
public class SwitchDemo {
    public static void main(String[] args) {
        int flag = 99;
        switch (flag){
            case 1:
                System.out.println("Selected 1");
                break;
            case 2:
                System.out.println("Selected 2");
                break;
            case 3:
                System.out.println("Selected 3");
                break;
            //如果flag的值没有匹配到任何case时,则执行default语句;
            default:
                System.out.println("Not Selected");
                break;
        }

    }
}
