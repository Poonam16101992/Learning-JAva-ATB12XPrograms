package ex_23_ENUM;

public class LAb204 {
    public static void main(String[] args) {
        System.out.println(locators.page_button.getlocator());
        System.out.println(APIURLs.Google.getURL());
    }
}
enum locators{
    page_button("#btn1"),
    page_input("#input1");

    private String locator;
locators(String locator){
    this.locator=locator;
}
String getlocator(){
    return this.locator;
}

}
