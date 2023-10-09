import java.util.Scanner;
public class latihan2dowhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka = 25,deret,i;
        deret = 0;
        i = 1;
        do {
            deret = deret + i;
            System.out.println("hasil deret angka " + i + " = " + deret);
        } while (++i <= angka);
        
        sc.close();
    }
}
