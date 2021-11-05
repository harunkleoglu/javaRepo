package Quiz2;
import java.util.*;
public class Q1{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		
		if(input.hasNextInt()||input.hasNextFloat()||input.hasNextDouble()||input.hasNextLong())
		{
			System.out.println("Please enter only valid characters.");
		}
		else
		{
			name = input.nextLine();
			System.out.println("Your name is "+ name);
		}
		input.close();
		
	}

}