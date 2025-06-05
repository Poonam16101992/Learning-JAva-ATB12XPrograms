package ex_19_OOPs_Inheritance_Polymorphism.SuperKeyword;

public class Lab184 {

}
class Baseclass {
    private String Browser;

    public Baseclass(String browser) {
        this.Browser = browser;
    }


    public String getBrowser() {
        return Browser;
    }

    public void setBrowser(String browser, boolean isAdmin) {
        if (isAdmin) {
            Browser = browser;
        } else {
            System.out.println("Not Allowed");
        }
    }

    void openBrowser(){
        System.out.println("Opening Browser");
    }
    void openBrowser(String Browser){
        System.out.println("Browser Opening");
    }
    void closeBrowser(){
        System.out.println("Close Browser");
    }
}
class TestCase1 extends Baseclass{
    public void tc(){

    }
    public TestCase1(String browser) {
        super(browser);
        super.closeBrowser();
        super.openBrowser();
        this.tc();
    }
}
