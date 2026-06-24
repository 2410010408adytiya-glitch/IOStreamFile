/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian1.berkas;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Adytiya Pratama - 2410010408
 */
public class LatihanMandiri1 {
    public static void main(String[] args) {

        // Nomor 1
        File laporan = new File("laporan.txt");

        if (laporan.exists()) {
            System.out.println("laporan.txt ditemukan.");
            System.out.println("Ukuran file: " + laporan.length() + " byte");
        } else {
            System.out.println("laporan.txt tidak ditemukan.");
        }

        System.out.println();

        // Nomor 2
        File arsip = new File("arsip");

        if (arsip.mkdir()) {
            System.out.println("Folder arsip berhasil dibuat.");
        } else {
            System.out.println("Folder arsip gagal dibuat atau sudah ada.");
        }

        System.out.println();

        // Nomor 3
        File sementara = new File("sementara.txt");

        try {
            sementara.createNewFile();

            System.out.println("Status sebelum dihapus:");
            System.out.println("Apakah file ada? " + sementara.exists());

            if (sementara.delete()) {
                System.out.println("File sementara.txt berhasil dihapus.");
            } else {
                System.out.println("File sementara.txt gagal dihapus.");
            }

            System.out.println("Status sesudah dihapus:");
            System.out.println("Apakah file ada? " + sementara.exists());

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}
