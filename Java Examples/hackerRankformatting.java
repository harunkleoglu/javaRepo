import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("================================");
        for(int i=0; i<3; i++)
        {
        String s1 = input.next();
        int n1 = input.nextInt();
        System.out.printf("%-15s%03d%n", s1, n1);
        }
        System.out.println("================================");
    }
}
