import java.util.Scanner;
public class SiakadFor28 {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double nilai, teringgi = 0, terendah = 100;
    int lulus = 0, tidakLulus = 0;
    for (int i = 1; i <= 10; i++) {
        System.out.println("Masukkan nilai mahasiswa ke " + i + ":");
        nilai = input.nextDouble();
        if (nilai > 60) {
                lulus++;
            } else {
                tidakLulus++;
            }
        if (nilai > teringgi) {
            teringgi = nilai;
            

        }
        if (nilai < terendah) {
            terendah = nilai;
        }
        System.out.println("Nilai tertinggi: " + teringgi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa lulus: " + lulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + tidakLulus);
    }
    input.close();
    }   
}