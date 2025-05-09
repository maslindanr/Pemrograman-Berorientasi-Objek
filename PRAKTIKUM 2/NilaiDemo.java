/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo_latihan;

public class NilaiDemo {
    public static void main(String[] args) {
            // Buat object
        Nilai Mahasiswa1 = new Nilai();
        
            // Memberi atribut dan dan memberi nilai
        Mahasiswa1.nim="08982983";
        Mahasiswa1.nama="Ghiyatsi";
        Mahasiswa1.nilaiTugas=80;
        Mahasiswa1.nilaiUts=90;
        Mahasiswa1.nilaiUas=87;
       
            // Cetak hasil hitung Nilai Mahasiswa 1 (Ghiyatsi) 
        Mahasiswa1.hitungNilai();
        Mahasiswa1.cetakNilai();  
    }
}
