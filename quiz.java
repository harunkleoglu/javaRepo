import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number please: ");
        int firstNumber = input.nextInt();
        System.out.println("Enter second number please: ");
        int secondNumber = input.nextInt();

        System.out.println("Result of "+firstNumber+" x "+secondNumber+" --> "+firstNumber*secondNumber);

    }
}
