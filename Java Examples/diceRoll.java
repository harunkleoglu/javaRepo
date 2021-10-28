import java.util.*;
public class diceRoll {

    public static void dice(int var)
    {
        int doubleDice=0, doubleSix =0;
        clearScreen();
        for(int e = var; e>0; e--)
        {
            //Pick random numbers in range of 1-6
            //d1 is first dice and d2 is second dice
            int d1 = (int)(Math.random() * 6)+1;
            int d2 = (int)(Math.random() * 6)+1;

            if(d1==d2 && d1==6)
            {
                doubleSix++;
                System.out.print(var+1-e+"# ("+d1+"-"+d2+") Double Six!"+"\n");
            }
            else if(d1==d2)
            {
                doubleDice++;
                System.out.print(var+1-e+"# ("+d1+"-"+d2+") Double Dice!"+"\n");
            }
            else
            {
                System.out.print(var+1-e+"# ("+d1+"-"+d2+")\n");
            }
        }
        //#region Double Dice counter..
        if(doubleDice>0 && doubleSix>0)
        {
            System.out.println("You have "+doubleDice+" Double Dice and "+doubleSix+" Double Six!");
        }
        else if(doubleDice==0 && doubleSix==0)
        {
            System.out.println("You do not have any Double Dices..");
        }
        else if(doubleDice>0 && doubleSix==0)
        {
            System.out.println("You have "+doubleDice+" Double Dice..");
        }
        else if(doubleDice==0 && doubleSix>0)
        {
            System.out.println("You have "+doubleSix+" Double Six..");
        }
        //#endregion
    }
    public static void main(String[] args) {
        clearScreen();
        roller();
    }
    public static void roller()
    {
        System.out.println("How many dice do you want to roll?");
        Scanner In = new Scanner(System.in);
        while(In.hasNext())
        {
            if(In.hasNextInt())
            {
                int i = In.nextInt();
                if(i>0)
                {
                    dice(i);
                }
                else
                {
                    clearScreen();
                    System.out.println("Negative Value: "+i+" is not a valid value, enter a countable number please!");
                }
            }
            else
            {
                clearScreen();
                System.out.println("Unvalid Symbol: "+In.next()+" is not a valid value, enter a countable number please!");
            }
        }
    }
    //region clearScreen
    public static void clearScreen()
    {
        System.out.print("\33[H\033[2J");
        System.out.flush();
    }
    //endregion
}
