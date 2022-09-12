package com.buzz.java_07_throwable;
/**反射
 * @author BuzzLightyear
 * @illustrate:Throwable是异常体系的根,继承自Object.
 *  Throwable有两个体系：Error和Exception
 *      Error表示严重错误,程序对此无能为力
 *          OutOfMemoryError(内训耗尽)
 *          NoClassDefFoundError(无法加载某个Class)
 *          StackOverFlowError(栈溢出)
 *      Exception表示运行时的错误,可以被捕获并处理
 *          NumberFormatException(数值类型的格式错误)
 *          FileNotFoundException(未找到文件)
 *          SocketException(读取网络失败)
 * @data 2022/9/12 15:59
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        int x = -1;
        assert x > 0;
        System.out.println(x);
    }

}
