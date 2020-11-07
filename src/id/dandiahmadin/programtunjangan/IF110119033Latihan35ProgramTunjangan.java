/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.dandiahmadin.programtunjangan;
import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Dandi Ahmadin
 * KELAS    : IF-1
 * NIM      : 10119033
 * Deskripsi Program : Program ini berisi menghitung tunjangan dengan konsep pendekatan berbasis objek
 */
public class IF110119033Latihan35ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        Tunjangan tunjangan1 = new Tunjangan();
        
        System.out.println("============Program Tunjangan============");
        System.out.print("Berapa gaji pokok anda perbulan? : ");
        tunjangan1.gajiPokok = input.nextDouble();
        System.out.print("Status anda? (Menikah/Belum) : ");
        tunjangan1.status = input.next();

        tunjangan1.pengecekanTunjangan();
        System.out.println("(Developed by : Dandi Ahmadin)");
    }
    
}
