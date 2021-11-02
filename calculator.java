import java.util.*;
import java.text.DecimalFormat;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        DecimalFormat format = new DecimalFormat("0.#");
        System.out.println("Enter the calculation: ");
        try{
        double firstNumber = input.nextDouble();
        String operator = input.next();
        double secondNumber = input.nextDouble();
        switch(operator){
            case "+":
            System.out.println(format.format(firstNumber)+"+"+format.format(secondNumber)+" = "+format.format(firstNumber + secondNumber));
            break;
            case "-":
            System.out.println(format.format(firstNumber)+"-"+format.format(secondNumber)+" = "+ format.format(firstNumber - secondNumber));
            break;
            case "*":
            System.out.println(format.format(firstNumber)+"*"+format.format(secondNumber)+" = "+format.format(firstNumber * secondNumber));
            break;
            case "/":
            System.out.println(format.format(firstNumber)+"/"+format.format(secondNumber)+" = "+format.format(firstNumber / secondNumber));
            break;
            default:    System.out.println("Invalid Operator. Please use (+,-,/,*).");
        }
    }
        catch(Exception ex)
        {
            System.out.println("Invalid Calculations");
        }   
}
}  