package ex_27_Generics;

public class Lab224_GenericsUsage {
    public static void main(String[] args) {
Generic G1= new Generic(2);
Generic G2= new Generic("Poonam");
Generic G3= new Generic(true);
Generic G4= new Generic(3.4);
    }
}

class Generic<T>{
   private T data;

   public  Generic(T data){
       this.data=data;
   }

    public T getData() {
        return data;
    }
}