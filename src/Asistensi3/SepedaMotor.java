package Asistensi3;

import java.util.Scanner;

public class SepedaMotor extends Kendaraan {
    private String namaKendaraan, tipeKendaraan;
    private float bahanBakar;

    public SepedaMotor(int idKendaraan, float jarakTempuhAwal,
            float jarakTempuh, String namaKendaraan, String tipeKendaraan,
            float bahanBakar) {
        super(idKendaraan, jarakTempuhAwal);
        this.namaKendaraan = namaKendaraan;
        this.tipeKendaraan = tipeKendaraan;
        this.bahanBakar = bahanBakar;
    }
    
    private String getNama(){
        return namaKendaraan;
    }
    
    private String getTipe(){
        return tipeKendaraan;
    }
    
    public void infoKendaraan(){
        System.out.println("\n===== SEPEDA MOTOR =====\n");
        
        Scanner in = new Scanner(System.in);
        
        float y;
        do{
            System.out.println("Masukkan Jumlah Bahan Bakar");
            y = in.nextFloat();
        }
        while(0 < y && y >= 500);
        
        float x;
        do{
            System.out.println("Masukkan Jarak tempuh");
            x = in.nextFloat();
        }
        while(0 < x && x >= 500);
        
        System.out.println("Nama Kendaraan : " + getNama());
        System.out.println("Tipe Kendaraan : " + getTipe());
        System.out.println("Bahan Bakar    : " + bahanBakar);
        System.out.println("Efektivitas : "+super.efektivitas(x, y));
    }
    
}
