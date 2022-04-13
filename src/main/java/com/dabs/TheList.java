package com.dabs;

import java.util.ArrayList;
import java.util.List;

public class TheList {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<String>();
        colors.add("Pink");
        colors.add("Blue");
        colors.add("Red");

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
    }
}
