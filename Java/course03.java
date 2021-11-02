import java.util.*;
public class course03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen çekeceğiniz para miktarını giriniz: ");
        int money = input.nextInt();
        
        int ikiyuz= money/200;
        int yuz= (money%200)/100;
        int elli = ((money%200)%100)/50;
        int yirmi = (((money%200)%100)%50)/20;
        int on = ((((money%200)%100)%50)%20)/10;
        int remainValue = money - ikiyuz*200 - yuz*100 - elli*50 - yirmi*20 - on*10;
        String c = input.nextLine();

        System.out.println(" 200₺ "+ikiyuz+"\n 100₺ "+yuz+"\n 50₺ "+elli+"\n 204₺ "+yirmi+"\n 10₺ "+on+"\n  Verilemeyecek miktar: "+ remainValue+c);
    }
    
}