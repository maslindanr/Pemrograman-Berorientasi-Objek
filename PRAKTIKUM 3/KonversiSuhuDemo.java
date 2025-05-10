/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo_latihan;

/**
 *
 * @author user
 */
public class KonversiSuhuDemo {
    public static void main(String[] args) {
            // buat object value
        KonversiSuhu value = new KonversiSuhu();
            // cetak hasil konversi suhu dari object value
        System.out.println("Celcius \t= 20 ");
        System.out.println("=====================");
        System.out.println("Kelvin \t\t= " +value.Kelvin(20));
        System.out.println("Fahrenheit \t= " +value.Fahrenheit(20));
        System.out.println("Rankine \t= " +value.Rankine(20));
        System.out.println("Delisle \t= " +value.Delisle(20));
        System.out.println("Newton \t\t= " +value.Newton(20));
        System.out.println("Reaumur \t= " +value.Reaumur(20));
        System.out.println("Romer \t\t= " +value.Romer(20));
    }
}
