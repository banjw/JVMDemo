package com.learn.demo.jvm;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) {
        hashMapDemo();
        System.out.println("======================================");
        weakHashMapDemo();
    }
    static void hashMapDemo(){
        Map<Integer,String> map = new HashMap<>();
        Integer key = new Integer(1);
        String value = "HashMap";
        map.put(key, value);
        System.out.println(map);
        key = null;
        System.out.println(map);
        System.gc();
        System.out.println(map + "\t" + map.size());
    }
    static void weakHashMapDemo(){
        Map<Integer,String> map = new WeakHashMap<>();
        Integer key = new Integer(1);
        String value = "HashMap";
        map.put(key, value);
        System.out.println(map);
        key = null;
        System.out.println(map);
        System.gc();
        System.out.println(map + "\t" + map.size());
    }
}
