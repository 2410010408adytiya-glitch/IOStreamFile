/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian3.kontak;

/**
 *
 * @author Adytiya Pratama - 2410010408
 */
public class MainKontak {
    public static void main(String[] args) {

    BukuKontak dataKontak = new BukuKontak("kontak.txt");

    dataKontak.tambahKontak(
            new Kontak(
                    "Alif Syukri",
                    "081234567890",
                    "fajar@gmail.com"));

    dataKontak.tambahKontak(
            new Kontak(
                    "Nabila Putri",
                    "082345678901",
                    "nabila@gmail.com"));

    dataKontak.tambahKontak(
            new Kontak(
                    "Rizky Pratama",
                    "083456789012",
                    "rizky@gmail.com"));

    System.out.println("=== DAFTAR KONTAK AWAL ===");
    dataKontak.tampilkanSemua();

    dataKontak.simpanKeBerkas();

    System.out.println("\n=== HASIL PENCARIAN ===");
    dataKontak.cariKontak("Nabila Putri");

    System.out.println("\n=== MENGHAPUS KONTAK ===");
    dataKontak.hapusKontak("Alif Syukri");

    System.out.println("\n=== DAFTAR KONTAK TERBARU ===");
    dataKontak.tampilkanSemua();

    BukuKontak dataBaru = new BukuKontak("kontak.txt");

    System.out.println("\n=== MEMUAT DATA DARI FILE ===");
    dataBaru.muatDariBerkas();
    dataBaru.tampilkanSemua();

    System.out.println("\nTotal kontak tersimpan: "
            + dataBaru.jumlahKontak());
}
}
