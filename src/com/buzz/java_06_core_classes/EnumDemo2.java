package com.buzz.java_06_core_classes;
/**
 * @author BuzzLightyear
 * @illustrate:
 * @data 2022/9/12 15:08
 */
public class EnumDemo2 {
    public static void main(String[] args) {
        Weekday day = Weekday.SUN;
        switch (day){
            case MON:
            case TUE:
            case WED:
            case THU:
            case FRI:
                System.out.println("Today is "+day+", Work at home");
                break;
            case SUN:
            case SAT:
                System.out.println("Today is "+day+", Work at office");
            default:
                System.out.println("cannot process" + day);
        }
    }
}
