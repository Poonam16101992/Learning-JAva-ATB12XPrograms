package ex_19_OOPs_Inheritance_Polymorphism.Encapsulation;

public class Lab183 {
    public static void main(String[] args) {
        ICICI holder= new ICICI("Poonam",109999);
        holder.setBalance(16000000,true);
        System.out.println(holder.getBalance());
    }


}
class ICICI {

    private String name;
    private long balance;
    public String Bank_name = "ICICI";

public ICICI(String name, long balance){
        this.name=name;
        this.balance=balance;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance,boolean isCashier) {
        if (isCashier) {
            this.balance = balance;
        } else {
            System.out.println("Not Allowed");
        }
}
}



