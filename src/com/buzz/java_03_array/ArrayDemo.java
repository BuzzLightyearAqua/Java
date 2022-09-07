package com.buzz.java_03_array;

/**
 * @author BuzzLightyear
 * @illustrate:数组类型 Arrays
 *    数组为引用数据类型
 *    数组所有元素的初始化为默认值，整型为0，浮点型为0.0，布尔值为false
 *    数组一旦创建后，大小不可改变，数组索引从0开始
 * @data 2022/9/7 16:46
 */
public class ArrayDemo {
    public static void main(String[] args) {
        //5人的成绩
        int[] array = new int[5];
        array[0] = 90;  //给数组赋值
        array[1] = 91;
        array[2] = 92;
        array[3] = 93;
        array[4] = 94;
        System.out.println(array.length);   //打印数组的长度(5)

        int[] array2 = new int[] {1,2,3,4,5,6,7,8,9};   //定义数组时指定初始化元素
        System.out.println(array2.length);  //编译器自动推算数组长度(9)

        /*字符串数组*/
        String[] names = {"Jack","Tom","Lucy"};
        String s1 = names[0];   //将names[0]的值(Jack)赋值给s1
        names[0] = "Cat";   //将"Cat"赋值给names[0]
        System.out.println(s1); //此时s1的值为Jack

        for (String s : names
             ) {
            System.out.println(s);  //此时names[0]的值为Cat(执行结果由上至下)
        }
    }
}
