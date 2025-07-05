package ex_Collection_Framework.list;

import java.util.PriorityQueue;

public class Lab239_Queue {
    public static void main(String[] args) {

        PriorityQueue pq= new PriorityQueue();//natural sorting
        pq.add("poonam");
        pq.add("sharma");
        pq.add("vivaan");
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);

    }
}
