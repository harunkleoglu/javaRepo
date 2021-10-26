package week4_exercise;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the shape type (S,s) for square, or (R,r) for rectangular:");

        if(input.next()=="s" || input.next()== "S")
        {
            System.out.println("Please enter the edge of square: ");
            Double edge = input.nextDouble();
            Double area = Math.pow(edge,2);

            System.out.println("The area of a square which is edge "+ edge+ " is "+ area);
        }
        else if(input.next()=="r" || input.next()== "R")
        {
            System.out.println("Please enter the first edge of the rectangular: ");
            Double edge1 = input.nextDouble();
            System.out.println("Please enter the second edge of the rectangular: ");
            Double edge2 = input.nextDouble();
            Double area = edge1*edge2;
            System.out.println("The area of a rectangular which first edge "+ edge1+ " and second is "+edge2+" is "+ area);
        }
    }
}
