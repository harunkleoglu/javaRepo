import java.util.Scanner;
public class PrimeNumbers {

	public static void main(String[] args) {
		var input = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int number = input.nextInt();
		boolean isEven = number % 2  == 0;
		
		if(!isEven)
		{
			int i;
			for(i=2; i<number; i++)
			{
				int a = number%i;
				
				if(a==0)
				{
					System.out.println("Not a prime number.");
					break;
				}
			}
			if(i==number)
				System.out.println("A prime number.");
		}
		else if(isEven && number != 2)
		{
			System.out.println("Not a prime number.");
		}
		else
		{
			System.out.println("A prime number.");
		}

		

	}

}
