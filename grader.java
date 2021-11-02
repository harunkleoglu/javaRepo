package Course;
import java.util.Scanner;

public class grader {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Enter your score please: ");
        int score = input.nextInt();

        if(score>=0 && score<=100)
        {
            switch((int)score/10)
            {
                case 10:
                case 9: System.out.println("A"); break;
                case 8:
                case 7: System.out.println("B"); break;
                case 6: System.out.println("C"); break;
                case 5:
                case 4: System.out.println("D"); break;
                case 3:
                case 2:
                case 1:
                case 0: System.out.println("F"); break;
            }
        }
        else
        {
            System.out.println("Score should be between 0 and 100");
        }
    }
}
