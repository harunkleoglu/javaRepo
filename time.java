import java.util.*;
public class time {
    
    public static void main(String[] args)
    { 
        int totalSeconds, RemSeconds, Minutes;
        Scanner consoleInput = new Scanner(System.in);

        totalSeconds = consoleInput.nextInt();

        RemSeconds = totalSeconds % 60;
        Minutes = totalSeconds/60;
        System.out.println(Minutes + " min " + RemSeconds + " secs ");
        
    }
}
