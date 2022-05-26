package com.collection.list;

import java.util.*;

public class DemoLinkedList {
    public static void main(String[] args) {

        LinkedList<Integer> l = new LinkedList<>();
        l.add(23);
        l.add(88);
        l.add(433);
        l.add(88);

        List<Integer> l1 = new LinkedList<>();
        l1.add(828);
        l1.add(88);
        l1.add(722);
        l1.add(433);


//        l.push(12); //these method are of the queue and deque
//        System.out.println(l.);
//        System.out.println(l.removeFirstOccurrence(88));
//        System.out.println(l.offerFirst(0));
//        System.out.println(l.poll());
//        System.out.println(l.pollFirst());
//        System.out.println(l.pollLast());
//        System.out.println(l.peek());
//        System.out.println(l.peekFirst());
//        System.out.println(l.peekLast());
//        System.out.println(l.offer(99));
//        l.addFirst(1);
//        l.addLast(9);
//        Collections.sort(l);
//        l.ensureCapacity(2);
//        System.out.println(l.clone());
//        l.getClass();
//        System.out.println(l.set(0,890));
//        System.out.println(l.toArray());
//        System.out.println(l.size());
//        System.out.println(l.removeAll(l));
//        l.clear();
//        System.out.println(l1.retainAll(l));
//        System.out.println(l.indexOf(23));
//        System.out.println(l.indexOf(88));
//        System.out.println(l.hashCode());
//        System.out.println(l.get(2));
//        System.out.println(l.getClass().getName());
//        System.out.println(l.isEmpty());
//        System.out.(l.equals(l1));
//        System.out.println(l.contains(88));
//        l.clear();
//        l1.removeAll(l1);
//        l.add(0, 99);
//        l.addAll(l1);

//        System.out.println(l);

        System.out.println("This is l list");
        Iterator i = l.iterator();
        while (i.hasNext()) {
            System.out.print(" " + i.next());
        }
        System.out.println();
        System.out.println("This is l1 list");
        Iterator j = l1.iterator();
        while (j.hasNext()) {
            System.out.print(" " + j.next());
        }
    }
}
