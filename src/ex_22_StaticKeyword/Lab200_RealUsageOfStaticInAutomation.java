package ex_22_StaticKeyword;

public class Lab200_RealUsageOfStaticInAutomation {
    public static void main(String[] args) {
Automation a1=new Automation();
        System.out.println(a1.Driver1);
        Automation.Driver1="Firefox";
        System.out.println(a1.Driver1);
        System.out.println(a1.Driver2);
    }
}
class Automation{
    static String Driver1="Chrome";
    static String Driver2;
}
