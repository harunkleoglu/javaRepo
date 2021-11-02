import java.util.Scanner;
public class index {

    public static void main(String[] args)
    {
        float yaricap, alan;
        final float PI = 3.14F;
        Scanner consoleInput = new Scanner(System.in);
        System.out.println("Write radius: ");
        yaricap = consoleInput.nextFloat();
        alan = yaricap*yaricap*PI;
        System.out.println(alan + " is the area of the circle which radius is " + yaricap);
    }
}