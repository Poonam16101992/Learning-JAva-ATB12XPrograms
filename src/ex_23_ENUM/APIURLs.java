package ex_23_ENUM;

public enum APIURLs {
    Google("www.google.com"),
    katalon("www.katalon.com");

    private String URL;

    APIURLs(String URL){
        this.URL=URL;
    }
    String getURL(){
        return this.URL;
    }
}
