package Asistensi2.Latihan;//Deklarasi nama package

public class TestBuku {//Deklarasi class

    public static void main(String[] args) {//Deklarasi main class
        System.out.println("=====================\n"//Mencetak
                         + "       TUGAS 2\n"//Mencetak
                         + "=====================\n"//Mencetak
                + "Oleh: Intan Ayu Puspitasari\n"//Mencetak
                + "NRP : 06111740000021\n");//Mencetak
        
        buku buku1 = new buku();//Membuat objek buku
        buku buku2 = new buku();//Membuat objek buku
        
        buku1.setNamaPengarang("Andrea Hirata");//memanggil method
        buku1.setJudulBuku("Laskar Pelangi");//memanggil method
        buku1.setTahunTerbit(2005);//memanggil method
        buku1.setCetakanKe(1);//memanggil method
        buku1.setHargaJual(23000);//memanggil method
        buku1.infoBuku();//memanggil method
        
        System.out.println("\n=========================================\n");
        //Mencetak
        
        buku2.setNamaPengarang("Andrea Hirata");//memanggil method
        buku2.setJudulBuku("Sang Pemimpi");//memanggil method
        buku2.setTahunTerbit(2011);//memanggil method
        buku2.setCetakanKe(1);//memanggil method
        buku2.setHargaJual(69000);//memanggil method
        buku2.infoBuku();//memanggil method
    }//Menutup method
}//Menutup method
