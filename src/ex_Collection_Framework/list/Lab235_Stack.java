package ex_Collection_Framework.list;

import java.util.Stack;

public class Lab235_Stack {
    public static void main(String[] args) {

        Stack s= new Stack();
        s.add("poonam");
        s.add(2);
        s.add("poonam");
        s.add(true);
        s.push("sharma");

        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.empty());
    }



}
