/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_latihan;

public class KonversiSuhu {
        // buat method Kelvin 
    public double Kelvin(double celcius){
        return (celcius + 273.15);
    }
        // buat method Fahrenheit
    public double Fahrenheit(double celcius){
        return (celcius * 1.8 + 32);
    }
        // buat method Rankine
    public double Rankine(double celcius){
        return (celcius * 1.8 + 491.67);
    }
        // buat method Delisle
    public double Delisle(double celcius){
        return (100 - celcius) * 1.5;
    }
        // buat method Newton
    public double Newton(double celcius){
        return (celcius * 33/100);
    }
        // buat method Reaumur
    public double Reaumur(double celcius){
        return (celcius * 0.8);
    }
        // buat method Romer
    public double Romer(double celcius){
        return (celcius * 21 / 40 + 7.5);
    }
}

