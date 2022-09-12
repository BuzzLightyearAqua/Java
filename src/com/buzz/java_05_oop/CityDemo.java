package com.buzz.java_05_oop;

/**
 * @author BuzzLightyear
 * @illustrate:
 * @data 2022/9/7 20:44
 */
public class CityDemo {
    public static void main(String[] args) {
        City ct = new City();
        ct.name = "NewYork";
        ct.latitude = 40.43;
        ct.longitude = 70.00;
        System.out.println("City name:" + ct.name);
        System.out.println("location: " + ct.latitude + ", " + ct.longitude);
    }
}

class City {
    public String name;     //名称
    public double latitude;     //纬度
    public double longitude;    //经度
}
