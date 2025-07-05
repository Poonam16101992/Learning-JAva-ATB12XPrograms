package ex_26_ObjectClass;

public class Lab222_Sample {
}
class sample extends Object{
    @Override
    public String toString(){
        System.out.println("This is coming from Object Class");
        return null;
    }
    @Override
    public int hashCode(){
        System.out.println("This is coming from object class");
        return 0;
    }

    @Override
    public boolean equals(Object o){
        System.out.println("coming from object");
        return false;
    }
}
