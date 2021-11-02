import java.util.ArrayList;
import java.util.Scanner;

public class splitting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
        int count = 0;
        ArrayList<String> ls = new ArrayList<String>();

        for(String a: s1.split(("[!,?. _'@ ]+")))
        {
            count++;
            ls.add(a);
        }
        System.out.println(count);
        for(int i=0; i<ls.size(); i++)
        {
            System.out.println(ls.get(i));
        }
    }
}
