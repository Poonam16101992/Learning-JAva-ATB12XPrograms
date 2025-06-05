package ex_19_OOPs_Inheritance_Polymorphism.MethodOverridingPolyMorphism;

public class RealWorldExample {
    public static void main(String[] args) {
TC_Chrome t= new TC_Chrome();
t.openBrowser();
    }
}
class CommonToAll {
    void openBrowser(){
        System.out.println("Open the Browser");
    }
}
class TC_Chrome extends CommonToAll {
    @Override
    void openBrowser(){
        System.out.println("Starting a Chrome");
    }
}

