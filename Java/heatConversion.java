import java.util.Scanner;
public class heatConversion {
    public static void main(String[] args) {
        /* Create a new Scanner object.
        Then create two new variables with double datatype. */
        Scanner input = new Scanner(System.in);
        double fahrenheit, celsius;
        
        // Get a fahrenheit degree from the console. Then, make conversion calculations.
        fahrenheit = input.nextDouble();
        celsius = (5.0d /9) * (fahrenheit - 32);

        // Print the result as an output.
        System.out.println(fahrenheit+ " fahrenheit degree is equals to "+celsius+" celsius degree.");
 }    
}
