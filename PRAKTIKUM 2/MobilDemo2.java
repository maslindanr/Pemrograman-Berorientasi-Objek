/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo_latihan;

/**
 * @author Lindo
 */
public class MobilDemo2 {
    public static void main(String[] args) {
            // Membuat object
        Mobil2 mobilku = new Mobil2();
        Mobil2 mobilmu = new Mobil2();
        
            // Memanggil atribut dan memberi nilai
        mobilku.warna="Hitam";
        mobilku.tahunProduksi=2006;
        mobilmu.warna="Hijau";
        mobilmu.tahunProduksi=2010;
        
            // menampilkan warna dan tahun produksi mobilku
        System.out.println("Warna : " + mobilku.warna);
        System.out.println("Tahun : " + mobilku.tahunProduksi);
        
            // menampilkan warna dan tahun produksi mobilmu
        System.out.println("Warna : " + mobilmu.warna);
        System.out.println("Tahun : " + mobilmu.tahunProduksi);
        
            // menampilkan hidupkan mobil, ubah gigi, dan matikan mobil
        System.out.println("Hidupkan Mobil  : " + mobilku.hidupkanMobil());
        System.out.println("Ubah Gigi       : " + mobilku.ubahGigi());
        System.out.println("Matikan Mobil   : " + mobilku.matikanMobil());
    }
}
