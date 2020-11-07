/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.dandiahmadin.programtunjangan;

/**
 *
 * @author
 * NAMA     : Dandi Ahmadin
 * KELAS    : IF-1
 * NIM      : 10119033
 * Deskripsi Program : Program ini berisi class Tunjangan
 */
public class Tunjangan {
    public double gajiPokok;
    public String status;
    
    private boolean cekStatus(String stat) {
        boolean cek = false;
        if (stat.toUpperCase().equals("MENIKAH")) {
            cek = true;
        }
        return cek;
    }
    
    private double hitungTunjangan(double parGaji){
        double tunjangan = (cekStatus(status)) ? 0.35 * parGaji : 0.0;
        return tunjangan;
    }
    
    private void cetakHasil() {
        System.out.println("============Hasil Perhitungan Gaji Anda============");
        System.out.printf("Gaji Pokok\t\t: %.1f%n", gajiPokok);
        double tunjangan = hitungTunjangan(gajiPokok);
        System.out.printf("Tunjangan\t\t: %.1f%n", tunjangan);
        double totalGaji = tunjangan + gajiPokok;
        System.out.printf("Total Gaji\t\t: %.1f%n", totalGaji);

    }
    
    public void pengecekanTunjangan() {
        hitungTunjangan(gajiPokok);
        cetakHasil();
    }
}
