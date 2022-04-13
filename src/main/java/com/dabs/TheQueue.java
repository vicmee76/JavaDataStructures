package com.dabs;

import java.util.LinkedList;
import java.util.Queue;

public class TheQueue {

    public static void main(String[] args) {
        Queue<Integer> nums = new LinkedList<>();
        nums.add(10);
        nums.add(90);
        nums.add(20);
        nums.add(19);
        nums.add(12);

        System.out.println(nums);
        nums.poll();
        System.out.println(nums);
        System.out.println(nums.size());
    }
}
