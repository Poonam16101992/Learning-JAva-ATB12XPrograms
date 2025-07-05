package ex_27_Generics;

public class Lab223_Generics {
    public static void main(String[] args) {
temp(3,4);
temp(3.2,44.4);
temp("poonam","majo");
    }
    static <T> T temp(T a,T b){
        System.out.println(a+ " "+ b);

                return null;
    }
}
