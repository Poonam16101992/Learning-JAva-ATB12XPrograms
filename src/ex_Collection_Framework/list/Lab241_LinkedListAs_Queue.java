package ex_Collection_Framework.list;

import java.util.LinkedList;
import java.util.Queue;

public class Lab241_LinkedListAs_Queue {

    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList();
        q.add(1);
        q.add(8);
        q.add(3);
        System.out.println(q);
    }
}
