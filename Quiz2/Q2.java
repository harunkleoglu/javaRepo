package Quiz2;
import java.util.*;
public class Q2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        input.close();
		int number = input.nextInt();
		int digitOne = number/100;
		int digitTwo = (number%100)/10;
		int digitThree = number%10;
		
		if(number>99 && number<=999)
		{
		switch(digitOne)
		{
		case 1: System.out.print("Yüz "); break;
		case 2: System.out.print("İkiyüz "); break;
		case 3: System.out.print("Üçyüz "); break;
		case 4: System.out.print("Dörtyüz "); break;
		case 5: System.out.print("Beşyüz "); break;
		case 6: System.out.print("Altıyüz "); break;
		case 7: System.out.print("Yediyüz "); break;
		case 8: System.out.print("Sekizyüz "); break;
		case 9: System.out.print("Dokuzyüz "); break; 
		}
		switch(digitTwo)
		{
		case 1: System.out.print("On "); break;
		case 2: System.out.print("Yirmi "); break;
		case 3: System.out.print("Otuz "); break;
		case 4: System.out.print("Kırk "); break;
		case 5: System.out.print("Elli "); break;
		case 6: System.out.print("Altmış "); break;
		case 7: System.out.print("Yetmiş "); break;
		case 8: System.out.print("Seksen "); break;
		case 9: System.out.print("Doksan "); break;
		}
		switch(digitThree)
		{
		case 0: break;
		case 1: System.out.print("Bir"); break;
		case 2: System.out.print("İki"); break;
		case 3: System.out.print("Üç"); break;
		case 4: System.out.print("Dört"); break;
		case 5: System.out.print("Beş"); break;
		case 6: System.out.print("Altı"); break;
		case 7: System.out.print("Yedi"); break;
		case 8: System.out.print("Sekiz"); break;
		case 9: System.out.print("Dokuz"); break;
		}
		}
		else
		{
			System.out.println("Enter a 3 digit number please.");
		}
		
}
}

