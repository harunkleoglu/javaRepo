import java.util.Scanner;
class Solution05{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int c;
        System.out.println("Enter number a: ");
        int a = input.nextInt();
        System.out.println("Enter number b: ");
        int b = input.nextInt();

        c = a;
        a = b;
        b = c;

        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}