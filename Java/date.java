import java.time.LocalDate;
import java.util.*;
public class date {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try
        {
            System.out.println("Please enter a date in DD MM YYYY format: ");
            int day = input.nextInt();
            int month = input.nextInt();
            int year = input.nextInt();
    
            LocalDate date = LocalDate.of(year, month, day);
            System.out.println(date.getDayOfMonth() +"/"+ date.getMonth().toString() +"/"+date.getYear());
        }
        catch(Exception ex)
        {
            System.out.println("Invalid Date!!");
        }
    }
    
}
