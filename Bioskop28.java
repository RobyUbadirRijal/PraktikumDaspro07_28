import java.util.Scanner;
public class Bioskop28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total;
        int tiket;
        int hargaTiket = 50000;
        String namaPelanggan;
        do {
            System.out.println("Sebutkan nama pelanggan atau (Apakah sudah sehari? 'iya'): ");
            namaPelanggan = input.nextLine();
            if (namaPelanggan.equalsIgnoreCase("iya")) {
                System.out.println("Sudah sehari penuh, selamat beristirahat");
                break;
            }
            System.out.println("Jumlah tiket yang dibeli: ");
            tiket = input.nextInt();
            if (tiket >= 0 &&  tiket <= 4) {
                System.out.println("Nama Pelanggan: " + namaPelanggan);
                System.out.println("Maaf anda tidak mendapatkan Diskon ");
                total = hargaTiket * tiket;
                System.out.println("Total yang harus anda bayar: Rp " + total );
            }
            else if (tiket > 4 && tiket <= 10) {
                System.out.println("Nama Pelanggan: " + namaPelanggan);
                System.out.println("Selamat Anda mendapatkan Diskon 10% ");
                total = tiket * hargaTiket / 0.10;
                System.out.println("Total yang harus anda bayar: Rp " + total);
            }
            else if (tiket > 10) {
                System.out.println("Nama Pelanggan: " + namaPelanggan);
                System.out.println("Selamat Anda mendapatkan Diskon 15%");
                total = tiket * hargaTiket / 0.15;
                System.out.println("Total yang harus anda bayar: Rp " + total);
            }
            else {
                System.out.println("Jumlah input tidak valid, mohon coba lagi");
            }
            input.nextLine();
        } while (true);
        input.close();
    }
}
