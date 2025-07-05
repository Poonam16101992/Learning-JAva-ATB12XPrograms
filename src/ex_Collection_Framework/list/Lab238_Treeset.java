package ex_Collection_Framework.list;

import java.util.*;

public class Lab238_Treeset {
    public static void main(String[] args) {
        Set<Integer> ts= new TreeSet();
        ts.add(9);
        ts.add(2);
        ts.add(0);
        System.out.println(ts);

        Iterator iterator=ts.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
