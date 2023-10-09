import java.util.Scanner;

public class latihan1while {
    public static void main(String[] args) {

        String nama;
        String kelamin;
        int i;
        Scanner sc = new Scanner(System.in);
        i = 1;
        while (i <= 30) {
            System.out.println("Masukkan nama :");
            nama = sc.nextLine();
            System.out.println("Masukkan jenis kelamin :");
            kelamin = sc.nextLine();
            if (kelamin.equalsIgnoreCase("perempuan")) {
            System.out.println("Nama anda : " + nama + " berjenis kelamin : " + kelamin);
            
        }
       i++;
    }
    sc.close();
}
}
