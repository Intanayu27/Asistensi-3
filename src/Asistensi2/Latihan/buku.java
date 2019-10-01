package Asistensi2.Latihan;//Deklarasi nama package

public class buku {//Deklarasi class
    
    String namaPengarang, judulBuku;
    //Deklarasi namaPengarang, judulBuku dengan tipe String
    int tahunTerbit, cetakanKe;
    //Deklarasi tahunTerbit, cetakanKe dengan tipe Int
    double hargaJual;
    //Deklarasi hargaJual dengan tipe Double

    public String getNamaPengarang() {//Membuat method
        return namaPengarang;//Return namaPengarang
    }//menutup method
    
    public void setNamaPengarang(String namaPengarang) {//Membuat method
        this.namaPengarang = namaPengarang;//Mendeklarasikan namaPengarang
    }//menutup method

    public String getJudulBuku() {//Membuat method
        return judulBuku;//Return judulBuku
    }//menutup method

    public void setJudulBuku(String judulBuku) {//Membuat method
        this.judulBuku = judulBuku;//Mendeklarasikan judulBuku
    }//menutup method

    public int getTahunTerbit() {//Membuat method
        return tahunTerbit;//Return tahunTerbit
    }//menutup method

    public void setTahunTerbit(int tahunTerbit) {//Membuat method
        this.tahunTerbit = tahunTerbit;//Mendeklarasikan tahunTerbit
    }//menutup method

    public int getCetakanKe() {//Membuat method
        return cetakanKe;//Return cetakanKe
    }//menutup method

    public void setCetakanKe(int cetakanKe) {//Membuat method
        this.cetakanKe = cetakanKe;//Mendeklarasikan cetakanKe
    }//menutup method

    public double getHargaJual() {//Membuat method
        return hargaJual;//Return hargaJual
    }//menutup method

    public void setHargaJual(double hargaJual) {//Membuat method
        this.hargaJual = hargaJual;//Mendeklarasikan hargaJual
    }//menutup method
    
    void infoBuku(){//Membuat method
        
        System.out.println("Nama Pengarang\t: " + getNamaPengarang());
        //Mencetak Nama Pengarang dan memanggil method
        System.out.println("Judul Buku\t: " + getJudulBuku());
        //Mencetak Judul Buku dan memanggil method
        System.out.println("Tahun Terbit\t: " + getTahunTerbit());
        //Mencetak Tahun Terbit dan memanggil method
        System.out.println("Cetakan Ke\t: " + getCetakanKe());
        //Mencetak Cetakan Ke dan memanggil method
        System.out.println("Harga Jual\t: " + getHargaJual());
        //Mencetak Harga Jual dan memanggil method
    }//menutup method
}//menutup method
