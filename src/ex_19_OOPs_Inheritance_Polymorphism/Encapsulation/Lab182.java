package ex_19_OOPs_Inheritance_Polymorphism.Encapsulation;

import java.security.PublicKey;

public class Lab182 {
    public static void main(String[] args) {
     //   VWOLogin login = new VWOLogin("poonam","Po@19");
    //    System.out.println(login.Username);
       // login.Password="P123";
       // System.out.println(login.Password);

        Goodlogin login1=new Goodlogin("Poonam","P145");
        System.out.println(login1.getUsername());
        System.out.println(login1.getPassword());
login1.setPassword("Yui*(",true);
        System.out.println(login1.getPassword());

    }

}
/*class VWOLogin{

    public String Username;
    public String Password;

    public VWOLogin(String username, String password) {
        Username = username;
        Password = password;
    }
}*/

class Goodlogin{
    private String Username;
    private String Password;

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

   public void setPassword(String password,boolean isAdmin) {
        if(isAdmin){
            this.Password = password;
        }else {
            System.out.println("Not Allowed");
        }

   }

    public Goodlogin(String username, String password) {
        Username = username;
        Password = password;
    }
}
