package Asistensi3;

import java.util.Scanner;

public class Mobil extends Kendaraan {
    Scanner in = new Scanner(System.in);
    private String namaKendaraan, tipeKendaraan;
    private int kapasitasMesin;
    private float bahanBakar;

    public Mobil(int idKendaraan, float jarakTempuhAwal, String namaKendaraan, 
            String tipeKendaraan, int kapasitasMesin,float bahanBakar) {
        super(idKendaraan, jarakTempuhAwal);
        this.namaKendaraan = namaKendaraan;
        this.tipeKendaraan = tipeKendaraan;
        this.kapasitasMesin = kapasitasMesin;
        this.bahanBakar = bahanBakar;
    }
    
    private String getNama(){
        return namaKendaraan;
    }
    
    private String getTipe(){
        return tipeKendaraan;
    }
    
    public void infoKendaraan(){
        System.out.println("\n===== MOBIL =====\n");
        
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
        System.out.println("Kapasitas Mesin: " + kapasitasMesin);
        System.out.println("Bahan Bakar    : " + bahanBakar);
        System.out.println("Efektivitas : "+super.efektivitas(x, y));
    }
}
