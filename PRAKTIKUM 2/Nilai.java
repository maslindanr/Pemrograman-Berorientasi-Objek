/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_latihan;

public class Nilai {
    String nim, nama, predikat;
    float nilaiUts;
    float nilaiTugas;
    float nilaiUas;
    float pNilaiUts;
    float pNilaiTugas;
    float pNilaiUas;
    float nilaiAkhir;
    char nHuruf;

        // membuat method hitungNilai untuk menghitung hasil nilaiAkhir
    public float hitungNilai(){
        pNilaiTugas = nilaiTugas*20/100;
        pNilaiUts = nilaiUts*35/100;
        pNilaiUas = nilaiUas*45/100;
        
        return nilaiAkhir = pNilaiTugas + pNilaiUas + pNilaiUts;
    }
        // membuat method cetakNilai untuk mencetak hasil penghitungan
    public void cetakNilai(){
        System.out.println("Nim \t\t: " + nim);
        System.out.println("Nama \t\t: " + nama);
        System.out.println("Nilai Tugas \t: " + nilaiTugas + " 20%  : " + pNilaiTugas);
        System.out.println("Nilai UTS \t: " + nilaiUts + " 35%  : " + pNilaiUts);
        System.out.println("Nilai UAS \t: " + nilaiUas + " 45%  : " + pNilaiUas);
        System.out.println("Nilai Akhir \t: " + hitungNilai());
        System.out.println("Nilai Huruf \t: " + getNilHuruf(nilaiAkhir));
        System.out.println("Predikat \t: " + getPredikat(nHuruf));
    }
    
        // membuat method getNilHuruf
    public char getNilHuruf(float nilaiAkhir){
        if(nilaiAkhir>=85)
            nHuruf='A';
        else if(nilaiAkhir>=70 && nilaiAkhir<85)
            nHuruf='B';
        else if(nilaiAkhir>=60 && nilaiAkhir<70)
            nHuruf='C';
        else if(nilaiAkhir>=40 && nilaiAkhir<60)
            nHuruf='D';
        else
            nHuruf='E';
        
        return nHuruf;
    }
    
    String getPredikat(char nHuruf){
        switch(nHuruf){
            case 'A':predikat="Apik";
                break;
            case 'B':predikat="Baik";
                break;
            case 'C':predikat="Cukup";
                break;
            case 'D':predikat="Dablek";
                break;
            case 'E':predikat="Elek";
                break;
        }
        return predikat;
    }
}
