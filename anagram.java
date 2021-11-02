import java.util.Scanner;

public class anagram {

    static boolean isAnagram(String a, String b) {
        
        char[] cr1 = a.toLowerCase().toCharArray();
        char[] cr2 = b.toLowerCase().toCharArray();

        if(a.length() != b.length())
        {
            return false;
        }
        else
        {
            java.util.Arrays.sort(cr1);
            java.util.Arrays.sort(cr2);
            return java.util.Arrays.equals(cr1, cr2);
        }

    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret)?"Anagrams" :"Not Anagrams" );
    }
}