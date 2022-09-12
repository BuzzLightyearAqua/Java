package com.buzz.java_07_throwable;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * @author BuzzLightyear
 * @illustrate:异常捕获
 * @data 2022/9/12 16:29
 */
public class TryCatchDemo {
    public static void main(String[] args) {
        byte[] bs = toGBK("中文");
        System.out.println(Arrays.toString(bs));
    }
    static byte[] toGBK(String s){
        try {
            return s.getBytes("GBK");
        } catch (UnsupportedEncodingException e) {
            //System.out.println(e);
            e.printStackTrace();    //打印异常栈
            return s.getBytes();
        }

    }
}
