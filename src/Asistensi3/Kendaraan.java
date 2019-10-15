package Asistensi3;

import java.util.Scanner;

public class Kendaraan {
    private int idKendaraan;
    protected float jarakTempuhAwal, jarakTempuh;

    // Konstruktor 3 parameter
    public Kendaraan(int idKendaraan, float jarakTempuhAwal) {
        this.idKendaraan = idKendaraan;
        this.jarakTempuhAwal = jarakTempuhAwal;
    }
    
    // Konstruktor 1 parameter
    public Kendaraan(int idKendaraan) {
        this.idKendaraan = idKendaraan;
    }
    
    
    public int getId(){
        return idKendaraan;
    }
    
    public float totalJarak(){
        return jarakTempuh;
    }
    
    public float efektivitas(float x, float y){
        float rumus = (float) ((float)Math.exp(x/Math.floor(y))*Math.log(2));
        System.out.println();
        return rumus;
    }
    
    public void infoKendaraan(){
        System.out.println("ID Kendaraan     : " + getId());
        System.out.println("Total jarak tempuh : "+totalJarak());
    }
    
    
}
