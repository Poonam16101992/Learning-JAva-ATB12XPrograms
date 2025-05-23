package ex_08_If_Condition;

import java.util.Scanner;

public class Lab084_TriangleClassification {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter n1");
        int n1 = scanner.nextInt();
        System.out.println("Enter n2");
        int n2 = scanner.nextInt();
        System.out.println("Enter n3");
        int n3 = scanner.nextInt();

        if(n1==n2 && n2==n3){
            System.out.println("Equilateral Triangle");
        }
        else if (n1==n2 || n2==n3 || n3==n1){
            System.out.println("Isosceles Triangle");
        }
        else {
            System.out.println("Scalene Triangle");
        }
    }
}
