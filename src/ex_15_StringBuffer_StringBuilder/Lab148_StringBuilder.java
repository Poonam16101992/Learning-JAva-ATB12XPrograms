package ex_15_StringBuffer_StringBuilder;

public class Lab148_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb= new StringBuilder("Hello");
        sb.append(" World!");
        sb.reverse();
        System.out.println(sb);

    }
}
