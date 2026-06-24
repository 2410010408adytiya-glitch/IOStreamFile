/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author Adytiya Pratama - 2410010408
 */
public class MainTugas {
    public static void main(String[] args) {

    String[] kategori = {
        "Perangkat Komputer",
        "Perangkat Gaming",
        "Penyimpanan Data"
    };

    System.out.println("=== KATEGORI BARANG ===");

    for (String kategoriBarang : kategori) {
        System.out.println("- " + kategoriBarang);
    }

    System.out.println();

    Gudang gudang = new Gudang("barang.txt");

    gudang.tambahBarang(
            new Barang(
                    "PC Gaming Ryzen 5",
                    12000000,
                    3));

    gudang.tambahBarang(
            new Barang(
                    "Monitor LG 24 Inch",
                    2200000,
                    7));

    gudang.tambahBarang(
            new Barang(
                    "Headset HyperX",
                    850000,
                    12));

    gudang.tambahBarang(
            new Barang(
                    "SSD NVMe 1TB",
                    1300000,
                    15));

    gudang.tambahBarang(
            new Barang(
                    "Webcam Logitech",
                    650000,
                    10));

    System.out.println("=== DATA BARANG ===");
    gudang.tampilkanSemua();

    System.out.println();

    gudang.simpanKeBerkas();

    System.out.println("\nData berhasil disimpan ke file.");

    Gudang gudangCadangan = new Gudang("barang.txt");

    gudangCadangan.muatDariBerkas();

    System.out.println("\n=== DATA HASIL PEMUATAN FILE ===");
    gudangCadangan.tampilkanSemua();

    System.out.println(
            "\nTotal Nilai Seluruh Barang : Rp"
                    + gudangCadangan.totalNilai());
}
}
