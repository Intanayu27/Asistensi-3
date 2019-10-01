package Asistensi2.Tugas;//Deklarasi nama package

public class TestPelajar {//Deklarasi class

    public static void main(String[] args) {//Deklarasi main class
        
        System.out.println("=====================\n"//Mencetak
                         + "       TUGAS 2\n"//Mencetak
                         + "=====================\n"//Mencetak
                + "Oleh: Intan Ayu Puspitasari\n"//Mencetak
                + "NRP : 06111740000021\n");//Mencetak
        
        pelajar hasilKu = new pelajar();//Membuat pelajar
        pelajar hasilMu = new pelajar();//Membuat pelajar
        
        hasilKu.setNIP("06111740000021");//memanggil method
        hasilKu.setNama("Intan Ayu Puspitasari");//memanggil method
        hasilKu.setnilaiUjian1(80);//memanggil method
        hasilKu.setnilaiUjian2(80);//memanggil method
        hasilKu.setnilaiTugas(80);//memanggil method
        hasilKu.infoPelajar();//memanggil method
        
        System.out.println("\n=========================================\n");
        //Mencetak
        
        hasilMu.setNIP("01211740000042");//memanggil method
        hasilMu.setNama("Rahmat Hidayat Mustika");//memanggil method
        hasilMu.setnilaiUjian1(50);//memanggil method
        hasilMu.setnilaiUjian2(50);//memanggil method
        hasilMu.setnilaiTugas(50);//memanggil method
        hasilMu.infoPelajar();//memanggil method
    }//Menutup method
}//Menutup method
