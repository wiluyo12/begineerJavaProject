import java.util.Scanner;

public class cekGanjilGenap {
  public static void cekAngka(int x) {
    if (x == 0) {
      System.out.println("Bilangan " + x + " bukan bilangan genap/ganjil");
    } else if (x % 2 == 0) {
      System.out.println("Bilangan " + x + " adalah genap");
    } else {
      System.out.println("Bilangan " + x + " adalah ganjil");
    }
  }

  public static void main(String[] args) {
    System.out.println("Program Cek Angka Ganjil dan Genap");
    System.out.println("----------------------------------");

    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan bilangan bulat: ");
    int angka = sc.nextInt();
    sc.close();

    cekAngka(angka);
  }
}