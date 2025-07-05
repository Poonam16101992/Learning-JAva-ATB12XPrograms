package Exception_Tasks;

public class CodingChallenge1 {
    public static void main(String[] args) {
        int age=16;
        try {
            if (age < 18) {
                throw new Exception("InvalidAgeException: Age must be 18 or older");
            } else {
                System.out.println("Valid age: " + age);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


