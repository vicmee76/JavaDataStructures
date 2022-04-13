package com.dabs;

import java.util.LinkedList;
import java.util.Queue;

public class TheQueue {

    public static void main(String[] args) {
        Queue<Integer> numbs = new LinkedList<>();
        numbs.add(10);
        numbs.add(90);
        numbs.add(20);
        numbs.add(19);
        numbs.add(12);

        System.out.println(numbs);
        numbs.poll();
        System.out.println(numbs);
        System.out.println(numbs.size());
    }
}
