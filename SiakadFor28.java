import java.util.Scanner;
public class SiakadFor28 {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double nilai, teringgi = 0, terendah = 100;
    for (int i = 1; i <= 10; i++) {
        System.out.println("Masukkan nilai mahasiswa ke " + i + ":");
        nilai = input.nextDouble();
        if (nilai > teringgi) {
            teringgi = nilai;
        }
        if (nilai < terendah) {
            terendah = nilai;
        }
        System.out.println("Nilai tertinggi: " + teringgi);
        System.out.println("Nilai terendah: " + terendah);
    }
    input.close();
    }   
}