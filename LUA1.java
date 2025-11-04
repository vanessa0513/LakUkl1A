import java.util.Scanner;

public class LUA1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // === INPUT DATA PAKET ===
        System.out.print("Masukkan berat paket (kg): ");
        double berat = input.nextDouble();

        System.out.print("Masukkan jarak tempuh (km): ");
        double jarak = input.nextDouble();

        System.out.print("Masukkan panjang paket (cm): ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar paket (cm): ");
        double lebar = input.nextDouble();

        System.out.print("Masukkan tinggi paket (cm): ");
        double tinggi = input.nextDouble();

        // === HITUNG VOLUME PAKET ===
        double volume = panjang * lebar * tinggi;

        // === TENTUKAN TARIF BERDASARKAN JARAK ===
        double biayaPerKg;
        if (jarak <= 10) {
            biayaPerKg = 4250; // tarif untuk jarak <= 10 km
        } else {
            biayaPerKg = 6000; // tarif untuk jarak > 10 km
        }

        // === HITUNG BIAYA UTAMA ===
        double biayaUtama = berat * biayaPerKg;

        // === CEK BIAYA TAMBAHAN BERDASARKAN VOLUME ===
        double biayaTambahan = 0;
        if (volume > 100) {
            biayaTambahan = 50000; // jika volume lebih dari 100 cm³
        }

        // === HITUNG TOTAL BIAYA ===
        double totalBiaya = biayaUtama + biayaTambahan;

        // === TAMPILKAN HASIL PERHITUNGAN ===
        System.out.println("\n=== RINCIAN BIAYA PENGIRIMAN ===");
        System.out.println("Berat Paket   : " + berat + " kg");
        System.out.println("Jarak Tempuh  : " + jarak + " km");
        System.out.println("Volume Paket  : " + volume + " cm³");
        System.out.println("Biaya Per Kg  : Rp " + biayaPerKg);
        System.out.println("Biaya Tambahan: Rp " + biayaTambahan);
        System.out.println("Total Biaya   : Rp " + totalBiaya);

        input.close();
    }
}
