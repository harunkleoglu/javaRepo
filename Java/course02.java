import java.lang.ProcessBuilder.Redirect.Type;
import java.util.*;
public class course02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Midterm1 notunu giriniz1: ");
        int m1 = input.nextInt();
        System.out.println("Midterm2 notunu giriniz1: ");
        int m2 = input.nextInt();
        System.out.println("Assignment notunu giriniz1: ");
        int As = input.nextInt();
        System.out.println("Quiz notunu giriniz1: ");
        int Quiz = input.nextInt();
        System.out.println("Final notunu giriniz1: ");
        int Final = input.nextInt();

        var Overall = (m1*0.15)+(m2*0.15)+(As*0.29)+(Quiz*0.1)+(Final*0.4);
        System.out.println("Genel Notunuz: "+Overall);

    }
}
