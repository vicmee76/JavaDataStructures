package com.dabs;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
      String[] colors = {"Red", "Yellow", "Pink", "Blue", "Green"};

        // reverse loop
        for(int i = colors.length - 1; i>=0; i--) {
            System.out.println(colors[i]);
        }

        Arrays.sort(colors);

        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }
    }
}
