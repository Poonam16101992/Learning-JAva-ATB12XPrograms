package ex_Collection_Framework.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab232_Interview {
    public static void main(String[] args) {
        List<Integer> num= new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);

        Collections.sort(num,Collections.reverseOrder());

        for (Integer x: num){
            System.out.println(6*x);
        }
    }
}
