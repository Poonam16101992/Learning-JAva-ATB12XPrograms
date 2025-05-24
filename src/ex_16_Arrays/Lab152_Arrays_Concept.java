package ex_16_Arrays;

import java.util.Arrays;

public class Lab152_Arrays_Concept {
    public static void main(String[] args) {

        int a=10;
        int[] b=new int[2];
        int[] c= {1,78,98,90};
        String[] d= new String[5];
        String[] e= {"Poonam","Praveen","Vivaan"};
        boolean[] f= new boolean[3];

        System.out.println(a);
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(d));
        System.out.println(Arrays.toString(e));
        System.out.println(Arrays.toString(f));

        System.out.println(c.length);
        System.out.println(e[2]);

        String g="Poonam";
        String[] h=g.split("");
        System.out.println(Arrays.toString(h));

    }
}

