package ex_Collection_Framework.list;

import java.util.Vector;

public class Lab230_Vector_A_Legacy_Class {
    public static void main(String[] args) {
        Vector v= new Vector();
        v.add("Poonam");
        v.add(1);
        System.out.println(v);
        v.remove("Poonam");
        System.out.println(v);

    }
}
