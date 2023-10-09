public class latihan3dowhile {
    public static void main(String[] args) {
        int angka = 50;
        int deret = 0;
        int i = 1;

        do {
            deret = i;
            if (deret %3 != 0) {
                System.out.println(deret);                
            }
        } while (++i <= angka);
   
}
}
