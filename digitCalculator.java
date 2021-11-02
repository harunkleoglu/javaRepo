package Course;
import java.util.Scanner;
public class digitCalculator {
		public static void main(String[] args)
		{
			var input = new Scanner(System.in);
			long num = input.nextLong();
			var y = Long.toString(num).length();
			System.out.println("It is a "+ y + " digit number.");
		}
}