package bro;

import java.util.Scanner;

public class java {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah jam: ");
        int jumlahJam = input.nextInt();
        
        System.out.print("Masukkan jumlah semester: ");
        int jumlahSemester = input.nextInt();
        
        input.close();
        
        int hasil = jumlahJam; // Inisialisasi hasil dengan jumlah jam
        
        for (int i = 1; i < jumlahSemester; i++) {
            hasil *= 2; // Mengalikan hasil dengan 2
        }
        
        System.out.println("Hasil perkalian " + jumlahJam + " sebanyak " + jumlahSemester + " semester adalah: " + hasil);
    }
}
