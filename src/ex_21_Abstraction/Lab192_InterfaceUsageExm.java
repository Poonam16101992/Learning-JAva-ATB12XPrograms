package ex_21_Abstraction;

public class Lab192_InterfaceUsageExm {
    public static void main(String[] args) {
        Car1 wagon = new Car1();
        wagon.func();
    }
}
class Car1 implements brakes,Engine1 {
  void func(){
      applyBreak();
      startEngine();
      StopeENgine();
      testEngine();
  }
    @Override
    public void applyBreak() {
        System.out.println("ApplyBrakes");
    }

    @Override
    public void startEngine() {
        System.out.println("start engine");
    }

    @Override
    public void StopeENgine() {
        System.out.println("stop engine");
    }

}

interface brakes{
    void applyBreak();

}
interface Engine1 {
    void startEngine();

    void StopeENgine();

    default void testEngine() {
        System.out.println("TestEngine Default");
    }
}

