package ex_16_Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class LAb157_UserInput {
    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size= scanner.nextInt();
        int[] number = new int[size];//String[] number= new String[size];
        System.out.println(Arrays.toString(number));

        for(int i=0;i<number.length;i++){
            System.out.println("Enter the "+i+" element");
            number[i]=scanner.nextInt();//number[i]=scanner.next();
        }
        System.out.println("print the elements");
        for(int num: number){// for(String num:number){
            System.out.println(num);
        }

scanner.close();
    }
}
