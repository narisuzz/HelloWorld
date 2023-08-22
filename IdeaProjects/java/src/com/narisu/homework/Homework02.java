package com.narisu.homework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Homework02 {
    public static void main(String[] args) {
        Map m  = new HashMap();
        m.put("jack",1200);
        m.put("smith",2900);
        System.out.println("m=" + m);
        m.put("jack",2600);
        System.out.println("m=" + m);
        //为所有的员工工资加薪100元
        Set keySet = m.keySet();
        for (Object key :keySet) {
            m.put(key,(Integer)m.get(key) + 100);
        }
        System.out.println("m=" + m);
        //遍历
        Set entryset = m.entrySet();
        Iterator iterator = entryset.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry =  (Map.Entry)iterator.next();
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }
}
