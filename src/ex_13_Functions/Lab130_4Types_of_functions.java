package ex_13_Functions;

public class Lab130_4Types_of_functions {
    public static void main(String[] args) {
        withoutReturn_withoutParameter();
        withoutReturn_withParameter("poonam",32);
       String a= withReturn_withoutParameter();
        System.out.println(a);
        int Sum=withReturn_withParameter(2,3);
        System.out.println(Sum);
    }
   static void withoutReturn_withoutParameter(){// This has no return type and no parameter
        System.out.println("Hi");
}
   static void withoutReturn_withParameter(String name,int age) {//This has no return type and has parameter
        System.out.println("My name is "+name+" and my age is "+age);
    }
   static String withReturn_withoutParameter(){//This has return type and no parameter
       return "How are you?";
   }
   static int withReturn_withParameter(int a,int b){//This has return type and parameter
        return a+b;

   }
}
