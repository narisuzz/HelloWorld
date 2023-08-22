package com.hspedu.reflection.question;



import java.io.FileInputStream;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;



public class ReflectionQuestion {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Properties properties = new Properties();
        properties.load(new FileInputStream("src/re.properties"));
        String classfullpath = properties.get("classfullpath").toString();
        String methodName = properties.get("method").toString();
        System.out.println("classfullpath =" + classfullpath);
        System.out.println("method =" + methodName);
        Class cls = Class.forName(classfullpath);
        Object o = cls.newInstance();
        Method method1 = cls.getMethod(methodName);
        method1.invoke(o);

    }
}
