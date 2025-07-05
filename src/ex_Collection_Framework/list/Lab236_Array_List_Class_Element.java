package ex_Collection_Framework.list;

import java.util.ArrayList;
import java.util.List;

public class Lab236_Array_List_Class_Element {
    public static void main(String[] args) {

        Student s1= new Student("poonam",3222);
        Student s2= new Student("aman",1234);
        Student s3= new Student("vivaan",123);

        List<Student> myStud = new ArrayList<>();//storing custom data type
        myStud.add(s1);
        myStud.add(s2);
        myStud.add(s3);

        System.out.println(myStud);
        s1.printDetails();
        s2.printDetails();
        s3.printDetails();
    }
}
