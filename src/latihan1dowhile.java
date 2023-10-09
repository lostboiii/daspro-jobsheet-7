import java.util.Scanner;

public class latihan1dowhile {
    public static void main(String[] args) {

        String nama;
        String kelamin;
        Scanner sc = new Scanner(System.in);
        int i = 1;
        
        do {
            System.out.println("Masukkan nama :");
            nama = sc.nextLine();
            System.out.println("Masukkan jenis kelamin :");
            kelamin = sc.nextLine();
            if (kelamin.equalsIgnoreCase("perempuan")) {
                System.out.println("Nama anda : " + nama + " berjenis kelamin : " + kelamin);
            }
        } while (++i <=30);
       sc.close();
    }
}
