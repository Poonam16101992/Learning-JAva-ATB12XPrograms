package ex_Collection_Framework.list;
import java.util.*;
public class Lab231_Nested_array_List {
    public static void main(String[] args) {
        List fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        List<String> fruits1= new ArrayList();
        fruits1.add("Kiwi");
        fruits1.add("Grapes");

        List<String> Vegies= new ArrayList();
        Vegies.add("Potato");
        Vegies.add("Tomato");

        List<List<String>> All_eatables= new ArrayList();
        All_eatables.add(fruits1);
        All_eatables.add(fruits);
        All_eatables.add(Vegies);

        System.out.println(All_eatables);
        System.out.println(All_eatables.size());
        System.out.println(All_eatables.get(2));
        System.out.println(All_eatables.get(0).get(1));

    }
}
