package com.karan.practice.practice.samplets;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {

    public static void main(String[] args) {

        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("aaa", "aaa");
        map.put("bbb", "bbb");
        map.put("ccc", "ccc");
        map.put("aaa", "aaa");
        System.out.println(map);

        String val = map.get("ccc");
        System.out.println(val);

    }
}
