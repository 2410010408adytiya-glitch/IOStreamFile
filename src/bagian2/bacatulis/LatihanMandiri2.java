/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian2.bacatulis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Adytiya Pratama - 2410010408
 */
public class LatihanMandiri2 {
    public static void main(String[] args) {

    String fileHari = "hari.txt";

    try {

        // Menulis 5 nama hari
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileHari));

        String[] hariAwal = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};

        for (String hari : hariAwal) {
            bw.write(hari);
            bw.newLine();
        }

        bw.close();

        System.out.println("Daftar hari awal:");
        bacaFile(fileHari);

        // Menambahkan 2 hari lagi
        BufferedWriter tambah =
                new BufferedWriter(new FileWriter(fileHari, true));

        tambah.write("Sabtu");
        tambah.newLine();
        tambah.write("Minggu");
        tambah.newLine();

        tambah.close();

        System.out.println("\nDaftar hari setelah ditambah:");
        bacaFile(fileHari);

        // Menghitung jumlah baris
        BufferedReader br =
                new BufferedReader(new FileReader(fileHari));

        int totalBaris = 0;
        String data;

        while ((data = br.readLine()) != null) {
            totalBaris++;
        }

        br.close();

        System.out.println("\nTotal baris: " + totalBaris);

    } catch (IOException e) {
        System.out.println("Error: " + e.getMessage());
    }
}

public static void bacaFile(String namaFile) throws IOException {

    BufferedReader br =
            new BufferedReader(new FileReader(namaFile));

    String isi;

    while ((isi = br.readLine()) != null) {
        System.out.println(isi);
    }

    br.close();
}
}
