package Asistensi3;

public class Main {

    public static void main(String[] args) {
        Mobil mbl = new Mobil(12, 23, "toyota", "bebek", 150,30);
        mbl.infoKendaraan();
        
        SepedaMotor spd = new SepedaMotor(1234, 50, 100, "Honda", "Supra", 150);
        spd.infoKendaraan();
        
    }
    
}
