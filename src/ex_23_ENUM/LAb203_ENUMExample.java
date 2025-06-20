package ex_23_ENUM;

public class LAb203_ENUMExample {
    public static void main(String[] args) {
        System.out.println(Colors.GREEN.getHexCode());
    }
}

enum Colors{
    RED("#FF0000"),
    GREEN("#61FF33");

    private  String hexCode;

Colors(String hexCode){
     this.hexCode=hexCode;
     }

     String getHexCode(){
     return this.hexCode;
     }
}