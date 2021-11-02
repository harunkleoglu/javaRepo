import java.util.*;
public class course01 {
public static void main(String[] args) {
    double tax = 0.18d;
    System.out.println("Lütfen TL değerinde yıllık gelirinizi giriniz: ");
    Scanner input = new Scanner(System.in);

    int annual_income = input.nextInt();
    var Tax_expense = annual_income*tax;
    System.out.println("Yıllık KDV verginiz "+Tax_expense+" TL'dir");
}    
}
