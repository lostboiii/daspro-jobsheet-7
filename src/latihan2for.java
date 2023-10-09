import java.util.Scanner;
public class latihan2for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka = 25,deret;
        deret = 0;
        for (int i = 1; i <=angka; i++) {
            deret  = deret + i;
            System.out.println("hasil deret angka " + i + " = " + deret);
        }
        
        sc.close();
    }
}
