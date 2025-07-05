package ex_Collection_Framework.list;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab237_HashSet_LinkedHash_TreeSet {
    public static void main(String[] args) {

        Set<String> HS= new HashSet();//no defined order

        HS.add("Apple");
        HS.add("Apple");
        HS.add("apple");
        HS.add("mango");
        HS.add(null);
        //HS.add(123);

        System.out.println(HS);
        System.out.println("---------------LinkedSet-----------");

        Set LH= new LinkedHashSet();//
        LH.add("Monkey");
        LH.add("Monkey");
        LH.add("monkey");
        LH.add(true);
        LH.add(null);
        System.out.println(LH);
        System.out.println(LH.isEmpty());
        System.out.println(LH.size());

        System.out.println("---------------TreeSet-----------");

        Set TS= new TreeSet();//natural sorting is done , order will be maintained
        TS.add("poonam");
        TS.add("Vivaan");
        TS.add("Vivaan");
        TS.add("Sidhu");
        TS.add("vivaan");

        System.out.println(TS);

    }
}
