package com.narisu.qqcommon;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Homework01 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        Class<PrivateTest> privateTestClass = PrivateTest.class;
        PrivateTest privateTestObj = privateTestClass.newInstance();
        Field name = privateTestClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(privateTestObj,"哪吒");
        Method getName = privateTestClass.getMethod("getName");
        Object invoke = getName.invoke(privateTestObj);
        System.out.printf("name属性值=" + invoke);
    }
}
class PrivateTest {
    private String name = "hellokitty";
    public String getName() {
    return name;
    }
}
