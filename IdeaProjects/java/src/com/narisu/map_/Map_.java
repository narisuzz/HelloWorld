package com.narisu.map_;

import java.util.HashMap;
import java.util.Map;

public class Map_ {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("no1","哪吒");
        map.put("no2","迪丽哪吒");
        map.put("no3","熏悟空");
        map.put(null,null);
        map.put(null,"唐算奘");
        System.out.println("map=" + map);
    }
}
