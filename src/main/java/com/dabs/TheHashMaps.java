package com.dabs;

import java.util.HashMap;
import java.util.Map;

public class TheHashMaps {

    public static void main(String[] args) {
        Map<Integer, String> maps = new HashMap<>();
        maps.put(1, "Pinks");
        maps.put(2, "Red");
        maps.put(3, "Blue");
        maps.put(4, "Orange");
        maps.put(5, "Orange");
        maps.put(6, "Orange");

        System.out.println(maps);
        System.out.println(maps.size());
        System.out.println(maps.get(3));
        System.out.println(maps.containsKey(3));
        System.out.println(maps.entrySet());
        System.out.println(maps.keySet());
        System.out.println(maps.values());
        System.out.println(maps.remove(6));
        System.out.println(maps);
        maps.replace(5, "Yellow");
        System.out.println(maps);
    }
}
