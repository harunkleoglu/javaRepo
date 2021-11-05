import java.text.*;
import java.util.*;
public class Timer {
    public static void main(String[] args) 
    {
        Timer();
    }
    public static void Timer()
    {
        DecimalFormat format = new DecimalFormat("00");
        clearScreen();
        Scanner In = new Scanner(System.in);
        System.out.print("Enter the seconds please: ");
        if(In.hasNextInt())
        {
            int totalSeconds = In.nextInt();
            In.close();
            if(totalSeconds<0)
            {
                System.out.println("Unvalid Value!");
                
            }
            while(totalSeconds>0)
            {
                clearScreen();
                totalSeconds--;
                int RemSeconds = totalSeconds % 60;
                int Minutes = totalSeconds/60;
                int RemMin = Minutes%60;
                int Hours = Minutes/60;
                System.out.println(format.format(Hours)+":"+format.format(RemMin) + ":" + format.format(RemSeconds));
                Wait(1000);
            }
            System.out.println("Ringed!");
        }
        else
        {
            clearScreen();
            System.out.println("Please enter an integer value.");
            Wait(2000);            
            Timer();
        }
    }
    public static void Wait(int ms)
    {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {

        }
    }
    public static void clearScreen()
    {
        System.out.print("\33[H\033[2J");
        System.out.flush();
    } 
}
