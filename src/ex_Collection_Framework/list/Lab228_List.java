package ex_Collection_Framework.list;

import java.util.ArrayList;
import java.util.List;

public class Lab228_List {
    public static void main(String[] args) {

        List fruits= List.of("Mango","Apple","Banana");
        System.out.println(fruits);

        List arr_List= new ArrayList();// Dynamic Dispatch-->Parent reference with Child Object
        arr_List.add("Poonam");
        arr_List.add("Poonam");
        arr_List.add(2);
        arr_List.add(null);
        System.out.println(arr_List);
        System.out.println(arr_List.size());

    }
}
