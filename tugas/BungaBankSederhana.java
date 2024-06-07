import java.util.Scanner;

public class BungaBankSederhana
{
  public static void main(String[] args)
  {
    System.out.println("Program Menghitung Bunga Bank");
    System.out.println("-----------------------------");

    Scanner sc = new Scanner(System.in); //objek
    System.out.print("Masukkan jumlah uang kamu (contoh: 10000): ");
    double amount = sc.nextDouble(); //amount membaca jumlah uang awal dari pengguna
    System.out.print("Masukkan bunga bank (contoh: 0.1): ");
    double rate = sc.nextDouble(); //membaca suku bunga tahunan yg diberikan bank
    System.out.print("Masukkan tahun (contoh: 1): ");
    int years = sc.nextInt(); //baca jumlah tahun uang yg disimpan
    sc.close();

    double interest = amount * rate * years;

    System.out.printf("Bunga yang didapatkan sebanyak Rp%.2f\n", interest);
    amount += interest;
    System.out.printf("Jumlah uang sekarang : Rp%.2f\n", amount);
  }
}