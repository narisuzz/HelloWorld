package com.narisu.string;

public class StringBuffer {
    public static void main(String[] args) {
        //String  转 StringBuffer
        String str = "ahahaha";
        //使用构造器
        //注意  返回的才是StringBuffer对象  对str 本身没影响
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer1 = new StringBuffer();


        //StringBuffer  转
        StringBuffer stringBuffer2 = new StringBuffer();
        String s = stringBuffer2.toString();
    }
}

