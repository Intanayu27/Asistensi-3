package Asistensi2.Tugas;//Deklarasi nama package

public class pelajar {//Deklarasi class
    
    private String nama, nip;
    //Deklarasi nama, nip dengan tipe String yg bersifat private
    private double nilaiUjian1, nilaiUjian2, nilaiTugas;
    //Deklarasi nilaiUjian1, nilaiUjian2, nilaiTugas dengan tipe Double yg bersifat private
    private double nilaiAkhir;
    //Deklarasi nilaiAkhir dengan tipe Double yg bersifat private
    private boolean lulus;
    //Deklarasi lulus dengan tipe Boolean yg bersifat private
    
    private String getNama() {//Membuat method
        return nama;//return nama
    }//menutup method
    
    public void setNama(String nama) {//Membuat method
        this.nama = nama;//Mendeklarasikan nama
    }//menutup method
    
    private String getNIP() {//Membuat method
        return nip;//return nip
    }//menutup method
    
    public void setNIP(String NIP) {//Membuat method
        this.nip = NIP;//Mendeklarasikan NIP
    }//menutup method
    
    private double getnilaiUjian1() {//Membuat method
        return nilaiUjian1;//return nilaiUjian1
    }//menutup method
    
    public void setnilaiUjian1(double nilaiUjian1) {//Membuat method
        this.nilaiUjian1 = nilaiUjian1;//Mendeklarasikan nilaiUjian1
    }//menutup method
    
    private double getnilaiUjian2() {//Membuat method
        return nilaiUjian2;//return nilaiUjian2
    }//menutup method
    
    public void setnilaiUjian2 (double nilaiUjian2) {//Membuat method
        this.nilaiUjian2 = nilaiUjian2;//Mendeklarasikan nilaiUjian2
    }//menutup method
    
    private double getnilaiTugas() {//Membuat method
        return nilaiTugas;//return nilaiTugas
    }//menutup method
    
    public void setnilaiTugas (double nilaiTugas) {//Membuat method
        this.nilaiTugas = nilaiTugas;//Mendeklarasikan nilaiTugas
    }//menutup method
    
    public double nilaiAkhir() {//Membuat method
        this.nilaiAkhir = (getnilaiUjian1()+getnilaiUjian2()+getnilaiTugas())/3;
        //Mendeklarasikan nilaiAkhir
        return nilaiAkhir;//return nilaiAkhir
    }//menutup method
    
    public boolean isLulus() {//Membuat method
        if(nilaiAkhir >= 60) {//Jika nilaiAkhir lebih dari sama dengan 60
            lulus = true;//Mendeklarasikan lulus
        }//menutup if
        
        else {//Pengecualian jika nilaiAkhir kurang dari 60
            lulus = false;//Mendeklarasikan lulus
        }//menutup else
        
        return lulus;
    }//menutup method
    
    public void infoPelajar() {//Membuat method
        
        System.out.println("NIP           : "+getNIP());
        //Mencetak NIP dan memanggil method
        System.out.println("Nama          : "+getNama());
        //Mencetak Nama dan memanggil method
        System.out.println("Nilai Ujian 1 : "+getnilaiUjian1());
        //Mencetak Nilai Ujian 1 dan memanggil method
        System.out.println("Nilai Ujian 2 : "+getnilaiUjian2());
        //Mencetak Nilai Ujian 2 dan memanggil method
        System.out.println("Nilai Tugas   : "+getnilaiTugas());
        //Mencetak Nilai Tugas dan memanggil method
        System.out.println("Nilai Akhir   : "+nilaiAkhir());
        //Mencetak Nilai Akhir dan memanggil method
  
        if(isLulus() == true) {//Jika nilaiAkhir lulus
            System.out.println("Status        : LULUS");//Mencetak
        }//menutup if
        
        else {//Jika nilaiAKhir tidak lulus
            System.out.println("Status        : TIDAK LULUS");//Mencetak
        }//menutup else
    }//menutup method
}//menutup method
