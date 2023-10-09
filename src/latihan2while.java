import java.util.Scanner;
public class latihan2while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka = 25,deret,i;
        deret = 0;
        i = 1;
      while (i<=angka) {
        deret = deret + i;
        System.out.println("hasil deret angka " + i + " = " + deret);
         i++;
      }
     
        sc.close();
    }
}
