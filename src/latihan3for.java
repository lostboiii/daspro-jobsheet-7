public class latihan3for {
    public static void main(String[] args) {
        int angka = 50;
        int deret = 0;
        for (int i = 1; i <=angka; i++) {
            deret = i;
            if (deret %3 != 0) {
                System.out.println(deret);                
            }
        }
        
    }
}
