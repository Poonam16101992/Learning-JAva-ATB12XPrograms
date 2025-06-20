package ex_24_WrapperClass;

public class LAb208_Conversion_DataTypes {
    public static void main(String[] args) {
        String num="9";
        //converting string into wrapper Integer

        Integer b = Integer.parseInt(num);//parseX()

        //converting string into primitive int data type

        int c= Integer.parseInt(num);

        //converting string into wrapper using value of

        Integer d= Integer.valueOf(num);

        //converting Integer into String

        String s= d.toString();
        System.out.println(s instanceof String);

        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
