package Asistensi1;//Deklarasi nama package

public class mobil {//Deklarasi class Mobil
    private String nama, warna, jenis;
    //Deklarasi Nama, Warna, Jenis dengan tipe String yg bersifat private
    private int berat, penumpang;
    //Deklarasi Berat, Penumpang dengan tipe Int yg bersifat private
        
    void infoMobil(){//Membuat method
        System.out.println("Merk Mobil          : " + getNama());
        //Mencetak Merk Mobil dan memanggil method
        System.out.println("Warna Mobil         : " + getWarna());
        //Mencetak Warna Mobil dan memanggil method
        System.out.println("Jenis Mobil         : " + getJenis());
        //Mencetak Jenis Mobil dan memanggil method
        System.out.println("Berat Mobil         : " + getBerat());
        //Mencetak Berat Mobil dan memanggil method
        System.out.println("Kapasitas Penumpang : " + getPenumpang());
        //Mencetak Kapasitas Penumpang dan memanggil method
    }//menutup method
    public void setNama(String merk){//Membuat method
        nama = merk;//Mendeklarasikan nama
    }//menutup method
    public String getNama(){//Membuat method
        return nama;//return nama
    }//menutup method
    public void setWarna(String color){//Membuat method
        warna = color;//Mendeklarasikan warna
    }//menutup method
    public String getWarna(){//Membuat method
        return warna;//return warna
    }//menutup method
    public void setJenis(String Jenis){//Membuat method
        jenis = Jenis;//Mendeklarasikan  jenis
    }//menutup method
    public String getJenis(){//Membuat method
        return jenis;//return jenis
    }//menutup method
    public void setBerat(int weight){//Membuat method
        berat = weight;//Mendeklarasikan berat
    }//menutup method
    public int getBerat(){//Membuat method
        return berat;//return berat
    }//menutup method
    public void setPenumpang(int passenger){//Membuat method
        penumpang = passenger;//Mendeklarasikan penumpang
    }//menutup method
    public int getPenumpang(){//Membuat method
        return penumpang;//return penumpang
    }//menutup method    
    
}//menutup method
