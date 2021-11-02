import java.util.Scanner;
public class example {
    public static void main(String[] args) {
        int day, month, year;
        String[] months = {"Ocak", "Şubat", "Mart", "Nisan", "Mayıs", "Haziran", "Temmuz", "Ağustos", "Eylül", "Ekim", "Kasım", "Aralık"};
        Scanner input = new Scanner(System.in);

        System.out.println("Write the day: ");
        day = input.nextInt();
        
        System.out.println("Write the month: ");
        month = input.nextInt();
        month = month - 1;
        
        System.out.println("Write the year: ");
        year = input.nextInt();

        if(day>31 || month>11 || day<1 || month<0)
        {
            System.out.println("Unvalid Date!");
        }
        else if(day<30 && month == 1 && month == 3 && month == 5 && month == 8 && month == 10)
        {
            System.out.println(day+" "+months[month] +" " + year);
        }
        else if(day<29 && month==1)
        {
            System.out.println(day+" "+months[month] +" " + year);
        }
        else if(day<31 && month == 0 && month == 2 && month == 4 && month == 6 && month == 7 && month == 9 && month == 11)
        {
            System.out.println(day+" "+months[month] +" " + year);
        }
        
        // switch-case kullan


        }
}
