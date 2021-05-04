package com.karan.practice.practice.ds;

import java.util.HashMap;

public class Hashing {

    public static void main(String[] args) {

        Object key= new String("abcdddfght");
        int h=0;
        h = key.hashCode() ^ (h >>> 16);

        key= new String("asdsadasdasdaAAAAdsadas");
        System.out.println("HashCode: "+ key.hashCode() + " Index: " + ((key.hashCode() ^ (h >>> 16)) & 31));
        key= new String("Rajadasu");
        System.out.println("HashCode: "+ key.hashCode() + " Index: " + ((key.hashCode() ^ (h >>> 16)) & 15));
        key= new String("sdsdasdsadasdasdsadad");
        System.out.println("HashCode: "+ key.hashCode() + " Index: " + ((key.hashCode() ^ (h >>> 16)) & 15));
        key= new String("adas123432daM1234K");
        System.out.println("HashCode: "+ key.hashCode() + " Index: " + ((key.hashCode() ^ (h >>> 16)) & 15));

     /*   HashMap map = new HashMap();
        map.put(K,V);
        map.get(K);*/


    }
}
