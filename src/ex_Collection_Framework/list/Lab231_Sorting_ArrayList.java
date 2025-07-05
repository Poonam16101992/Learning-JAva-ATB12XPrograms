package ex_Collection_Framework.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lab231_Sorting_ArrayList {
    public static void main(String[] args) {

        List marks= new ArrayList<>();
        marks.add(91);
        marks.add(96);
        marks.add(92);
        marks.add(99);
        System.out.println(marks);

        Collections.sort(marks);
        System.out.println(marks);

        Collections.sort(marks,Collections.reverseOrder());
        System.out.println(marks);
    }
}
