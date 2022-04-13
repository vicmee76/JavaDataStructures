package com.dabs;

import java.util.LinkedList;
import java.util.ListIterator;

public class TheLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(43);
        list.add(35);
        list.add(34);
        list.add(32);
        list.add(56);
        list.add(343);
        list.add(233);
        list.add(456);
        list.add(334);

        System.out.println(list);
        System.out.println(list.peek());
        System.out.println(list.poll());
        System.out.println(list);
        System.out.println(list.pollLast());
        System.out.println(list);
        System.out.println(list.pop());
        System.out.println(list);

        ListIterator<Integer> listIterator = list.listIterator();

        System.out.println(  listIterator.next());
        System.out.println(  listIterator.next());
        System.out.println(  listIterator.previous());
        System.out.println(  listIterator.next());

        list.addFirst(1);
        list.addLast(1);

        System.out.println(list);

    }
}
