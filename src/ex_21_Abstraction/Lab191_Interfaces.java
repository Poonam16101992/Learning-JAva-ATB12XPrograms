package ex_21_Abstraction;

import java.lang.classfile.Interfaces;

public class Lab191_Interfaces {


}
interface Tyre{
    void rubberTyre();
    void blackColourTyre();
    default void d1() {
        System.out.println("default");
    }
    static void s1(){
            System.out.println("static function");
        }

}
interface Gear{
    void changeGear();
}