package Asistensi1;//Deklarasi nama package

public class TestMobil {//Deklarasi class TestMobil

    public static void main(String[] args) {//Deklarasi main class
       
        System.out.println("=====================\n"//Mencetak
                         + "       TUGAS 1\n"//Mencetak
                         + "=====================\n"//Mencetak
                + "Oleh: Intan Ayu Puspitasari\n"//Mencetak
                + "NRP : 06111740000021\n");//Mencetak
        
        mobil mobil1 = new mobil();//Membuat objek mobil
        System.out.println("Mobil Tipe 1");//Mencetak
        mobil1.setNama("Toyota");//memanggil method
        mobil1.getNama();//memanggil method
        mobil1.setWarna("Biru");//memanggil method
        mobil1.getWarna();//memanggil method
        mobil1.setJenis("Minibus");//memanggil method
        mobil1.getJenis();//memanggil method
        mobil1.setBerat(2000);//memanggil method
        mobil1.getBerat();//memanggil method
        mobil1.setPenumpang(7);//memanggil method
        mobil1.getPenumpang();//memanggil method
        mobil1.infoMobil();//memanggil method
        
        mobil mobil2 = new mobil();//Membuat objek mobil
        System.out.println("\nMobil Tipe 2");//Mencetak
        mobil2.setNama("Daihatsu");//memanggil method
        mobil2.getNama();//memanggil method
        mobil2.setWarna("Hitam");//memanggil method
        mobil2.getWarna();//memanggil method
        mobil2.setJenis("Pick Up");//memanggil method
        mobil2.getJenis();//memanggil method
        mobil2.setBerat(1500);//memanggil method
        mobil2.getBerat();//memanggil method
        mobil2.setPenumpang(5);//memanggil method
        mobil2.getPenumpang();//memanggil method
        mobil2.infoMobil();//memanggil method
        
        mobil mobil3 = new mobil();//Membuat objek mobil
        System.out.println("\nMobil Tipe 3");//Mencetak
        mobil3.setNama("Suzuki");//memanggil method
        mobil3.getNama();//memanggil method
        mobil3.setWarna("Silver");//memanggil method
        mobil3.getWarna();//memanggil method
        mobil3.setJenis("Suv");//memanggil method
        mobil3.getJenis();//memanggil method
        mobil3.setBerat(1800);//memanggil method
        mobil3.getBerat();//memanggil method
        mobil3.setPenumpang(2);//memanggil method
        mobil3.getPenumpang();//memanggil method
        mobil3.infoMobil();//memanggil method
        
        mobil mobil4 = new mobil();//Membuat objek mobil
        System.out.println("\nMobil Tipe 4");//Mencetak
        mobil4.setNama("Honda");//memanggil method
        mobil4.getNama();//memanggil method
        mobil4.setWarna("Merah");//memanggil method
        mobil4.getWarna();//memanggil method
        mobil4.setJenis("Sedan");//memanggil method
        mobil4.getJenis();//memanggil method
        mobil4.setBerat(1300);//memanggil method
        mobil4.getBerat();//memanggil method
        mobil4.setPenumpang(2);//memanggil method
        mobil4.getPenumpang();//memanggil method
        mobil4.infoMobil();//memanggil method
    }//menutup method
    
}
