import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class sorter{
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var numbers = new ArrayList<Integer>();
        System.out.println("Enter first number: ");
        int num1 = input.nextInt();
        numbers.add(num1);
        System.out.println("Enter second number: ");
        int num2 = input.nextInt();
        numbers.add(num2);
        System.out.println("Enter third number: ");
        int num3 = input.nextInt();
        numbers.add(num3);
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("The order of numbers "+numbers);
        input.close();




    }


}