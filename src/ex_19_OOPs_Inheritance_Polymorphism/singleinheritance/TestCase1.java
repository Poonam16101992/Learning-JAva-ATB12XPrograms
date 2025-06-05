package ex_19_OOPs_Inheritance_Polymorphism.singleinheritance;

public class TestCase1 extends CommonToAll{

    void runningTC1(){

        readExcelFile();
        startBrowser();
        closeBrowser();
        System.out.println("Running TestCAse2");
    }
}
