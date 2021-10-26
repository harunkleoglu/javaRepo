package week4_exercise;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);        
        System.out.println("Enter the price please: ");
        double salePrice = input.nextDouble();

        if(salePrice<=100 && salePrice>0)
        {
            salePrice = salePrice*96/100;
            System.out.println("Your net payment is: "+ (salePrice));
        }
        else if(salePrice>100 && salePrice<=250)
        {
            double remain = (salePrice-100);
            double g0_100 = (100)*95/100;
            remain = remain*93/100;
            System.out.println("Your net payment is: "+(remain+g0_100));
        }
        else if(salePrice>250)
        {
            double remain = salePrice-250;
            double g100_250 = (150)*92/100;
            double g0_100 = 100*94/100;
            remain = remain*90/100;
            System.out.println("Your net payment is: "+(remain+g0_100+g100_250)); 
        }
    }
}
