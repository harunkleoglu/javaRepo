public class selector {
    public static void main(String[] args) {
        random();

    }
    public static void random()
    {
        clearScreen();
        String[] where = {"KYK Yurdunda ", "Yasinin yatağında ", "Emrenin Tofaşında ", "Okul kafeteryasında ", "Toprağın Almanca kursunda "};
        String[] who = {"Yasinle ", "Emreyle ", "İnançla ", "Karahanla ", "Serhatla "};
        String[] what = {"TTEN.", "Kumar oynuyoruz.", "Yasini şapalaklıyoruz.", "Almanca öğreniyoruz.", "Programlama yapıyoruz."};
        int r1 = (int)(Math.random() * where.length);
        int r2 = (int)(Math.random() * who.length);
        int r3 = (int)(Math.random() * what.length);
        
       System.out.println(where[r1]+who[r2]+what[r3]); 
    }
    public static void clearScreen()
    {
        System.out.print("\33[H\033[2J");
        System.out.flush();
    } 
}

