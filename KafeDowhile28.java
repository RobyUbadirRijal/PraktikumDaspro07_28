import java.util.Scanner;
public class KafeDowhile28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kopi, teh, roti;
        int hargaKopi = 12000;
        int hargaTeh = 7000;
        int hargaRoti = 20000;
        int totalHarga;
        String namaPelanggan;
        
        do {
            System.out.println("Masukkan nama pelanggan (Ketik 'batal' untuk keluar): ");
            namaPelanggan = input.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan. ");
                break;
            }
            System.out.println(("Jumlah kopi: "));
            kopi = input.nextInt();
            System.out.println(("Jumlah teh: "));
            teh = input.nextInt();
            System.out.println(("Jumlah roti: "));
            roti = input.nextInt();
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus di bayar: Rp " + totalHarga);
            input.nextLine();
        } while (true);
        
        input.close();
    }
}
