import java.text.*;
import java.util.*;
public class Timer {
    public static void main(String[] args) {
        DecimalFormat format = new DecimalFormat("00");
        clearScreen();
        int i=0;
        Scanner In = new Scanner(System.in);
        System.out.print("Enter the seconds please: ");
        int totalSeconds = In.nextInt();
        if(totalSeconds<0)
        {
            System.out.println("Unvalid Value!");
            
        }
        while(totalSeconds>i)
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
