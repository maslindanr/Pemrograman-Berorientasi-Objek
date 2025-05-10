/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo_latihan;

/**
 *
 * @author user
 */
public class MatematikaDemo {
    public static void main(String[] args) {
            // membuat object
        Matematika operasi1 = new Matematika();
            // cetak hasil
        System.out.println("Pertambahan 20+20 \t= " +operasi1.Pertambahan(20,30));
        System.out.println("Pengurangan 10-5 \t= " +operasi1.Pengurangan(20,30));
        System.out.println("Perkalian 10x20 \t= " +operasi1.Perkalian(20,30));
        System.out.println("Pembagian 10:2 \t\t= " +operasi1.Pembagian(30,6));
    }
}
