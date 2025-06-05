package ex_20_SuperAbstraction;

public class Lab188_Private {
}
class XYZ{
    protected int gold=10;
    XYZ(){

    }

}
class ABC extends XYZ{
    void Display(){
        System.out.println(super.gold);//class ABC can access XYZ gold
    }
}