package Course;

public class binarySearch {

	public static void main(String[] args) {
		int guess, rNum = (int) (Math.random()*1024);
		int i = 9, binaryRange = 1024;
		//Range is [1,1024]
		guess = binaryRange/2;
		System.out.println(rNum);
		while(rNum != guess)
		{
			if(guess < rNum)
			{
			guess = guess + (int) Math.pow(2 , i);
			i--;	
			if(guess == rNum)
			{
			System.out.println("Hit! "+ guess);	
			}
			else
				System.out.println("go up " + guess);
			}
			else if(guess>rNum)
			{
				guess = guess - (int) Math.pow(2 , i);
				i--;
				if(guess == rNum)
				{
				System.out.println("Hit! " + guess);	
				}
				else
					System.out.println("go down " + guess);
		
		}
	}

}
}