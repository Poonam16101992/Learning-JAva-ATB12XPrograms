package ex_Collection_Framework.list;

import java.util.*;

public class Lab240_Deque {
    public static void main(String[] args) {
        Deque<Integer> dq= new ArrayDeque();
        dq.add(1);
        dq.push(2);
        dq.push(6);
        dq.add(3);
        System.out.println(dq);

    }
}
