package ex_22_StaticKeyword;

public class Lab201_InstanceInstantiatedBlockVSStatic {
    public static void main(String[] args) {
        B b= new B();
    }
}
class B{
    {
        System.out.println("IIB called when object is created");
    }
    static {
        System.out.println("SIB called when class is loaded");
    }
}
