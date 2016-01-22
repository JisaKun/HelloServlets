package com.hongchuan1992.testJSP;

/**
 * Created by Zhang Hongchuan on 2016/1/15.
 * ·ÃÎÊ¼ÆÊıÆ÷
 */
public class Counter {
    private static int counter;
    public static synchronized int getCounter(){
        counter ++;
        return counter;
    }
}
