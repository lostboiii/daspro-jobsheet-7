import java.util.Scanner;
public class WhileKelipatan23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int jumlah = 0 ; 
        int kelipatan,counter = 0;
        int i;
        System.out.println("masukkan angka kelipatan (1-9) : ");
        kelipatan = scan.nextInt();
        i = 1;
        while ( i <= 50) {
            if (i % kelipatan == 0 ) {
                jumlah += i;
                counter++;
            }
            i++;
        }
        System.out.printf("Banyak bilangan %d dari 1 sampai 50 %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelkipatan %d dari 1 sampai 50 %d\n", kelipatan, jumlah);
        scan.close();
    }
}
