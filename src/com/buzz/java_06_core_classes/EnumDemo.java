package com.buzz.java_06_core_classes;

/**
 * @author BuzzLightyear
 * @illustrate:
 * @data 2022/9/12 11:54
 */
public class EnumDemo {
    public static void main(String[] args) {
        Weekday weekday = Weekday.SUN;
        if (weekday.datValue == 6 || weekday.datValue == 0) {
            System.out.println("Today is " + weekday + ", Work at home");
        } else {
            System.out.println("Today is " + weekday + ", Work at office");
        }
    }
}

enum Weekday {
    MON(1, "星期一"), TUE(2, "星期二"), WED(3, "星期三"), THU(4, "星期四"), FRI(5, "星期五"), SAT(6, "星期六"), SUN(0, "星期日");

    public final int datValue;
    private final String chinese;

    private Weekday(int datValue, String chinese) {
        this.datValue = datValue;
        this.chinese = chinese;
    }

    @Override
    public String toString() {
        return this.chinese;
    }
}
