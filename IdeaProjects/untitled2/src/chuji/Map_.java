package chuji;

import java.util.HashMap;

public class Map_ {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(01,"哪吒");
        hashMap.put(02,"熏悟空");
        hashMap.put(03,"句八戒");
        hashMap.put(04,"迪丽哪吒");
        System.out.println(hashMap.size());
        System.out.println(hashMap.toString());
        for (Integer key : hashMap.keySet()) {
            System.out.println(key + "-----" + hashMap.get(key));
        }

    }
}
