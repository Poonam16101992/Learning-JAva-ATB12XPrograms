package ex_Collection_Framework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab229_ArrayList {
    public static void main(String[] args) {
        List lst= new ArrayList<>();
        lst.add("Poonam");
        lst.add(2);
        lst.add(true);
        lst.add(2.6);

        System.out.println(lst);
        System.out.println(lst.size());
        System.out.println(lst.isEmpty());
        System.out.println(lst.contains(2));
        System.out.println(lst.indexOf(2));

        for (int i= 0; i < lst.size(); i++) {
            System.out.print(lst.get(i));
            
        }
        for(Object o:lst){
            System.out.println(o);
        }
        System.out.println("---------------");

        Iterator I= lst.iterator();
        while (I.hasNext()) {

            System.out.println(I.next());
        }
        }
    }


