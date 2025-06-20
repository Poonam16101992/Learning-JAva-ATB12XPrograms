package ex_22_StaticKeyword;

public class Lab198_StaticUsage2 {
    public static void main(String[] args) {
ATB_Users a1= new ATB_Users(9999999,"poonam");
ATB_Users a2= new ATB_Users(9999998,"poonam2");
a1.Display();
a2.Display();
        System.out.println(ATB_Users.course_name);
    }
}
class ATB_Users{
    String name;
    static String course_name="ATB";
    int phone;

    public ATB_Users(int phone, String name) {
        this.phone = phone;
        this.name = name;
    }
    void Display(){
        System.out.println("name is "+this.name+" phone is "+this.phone+" course is "+course_name);
    }
    static void Mark_attendance(){
        System.out.println("Mark Attendance");
    }
}
