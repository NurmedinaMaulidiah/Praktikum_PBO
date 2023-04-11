package posttest3_dina;

import java.util.Scanner;


public class tamuMewah extends Pemesan implements tamu {

    private int noKamar;
    private int lamaInap;
    private double totalHarga;
    private double hargaKamar;
    private String fasilitasTambahan;
    public final String reservasi = "Silahkan Pilih Fasilitas Tambahan yang Tersedia";
    private boolean isCheckIn = false;
    public tamuMewah(String nama, int noHp, int noKamar, int lamaInap, double hargaKamar, double totalHarga, String fasilitasTambahan) {
        super(nama, noHp);
        this.noKamar = noKamar;
        this.lamaInap = lamaInap;
        this.totalHarga = totalHarga;
        this.hargaKamar = hargaKamar;
        this.fasilitasTambahan = fasilitasTambahan;
    }
    public int getNoKamar() {
        return noKamar;
    }
    public void setNoKamar(int noKamar) {
        this.noKamar = noKamar;
    }
    public int getLamaInap() {
        return lamaInap;
    }
    public void setLamaInap(int lamaInap) {
        this.lamaInap = lamaInap;
    }
    public double getTotalHarga() {
        return totalHarga;
    }
    public void setTotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }
    public double getHargaKamar() {
        return hargaKamar;
    }

    public String getFasilitasTambahan() {
        return fasilitasTambahan;
    }
    
    public void setHargaKamar(double hargaKamar) {
        this.hargaKamar = hargaKamar;
    }

    public void setFasilitasTambahan(String fasilitasTambahan) {
        this.fasilitasTambahan = fasilitasTambahan;
    }
    
    //METHOD OVERLOADING
    //PENGGUNAAN KEYWORD STATIC
public static void tambahKamar(String Nama) {
        System.out.println("Nama Pemesan                              : " + Nama);
    }
public static void tambahKamar(String fasilitasTambahan, int noHp) {
    System.out.println("Fasilitas Tambahan                        : " + fasilitasTambahan+ "\n" + "Nomor HP                                  : " + noHp);
}
    
  
    @Override
    public void tambah(){
        System.out.println("--------------------------------------------------------");
        System.out.println("\t\tPemesan Kamar Mewah dengan");
        System.out.println("--------------------------------------------------------");
        // memanggil method overloading
        tambahKamar(this.nama);
        tambahKamar(this.fasilitasTambahan, this.noHp);
        System.out.println("Nomor Kamar                               : " + this.noKamar);
        System.out.println("Lama Inap                                 : " + this.lamaInap);
        System.out.println("Total Harga yang harus dibayar            : " + this.totalHarga);
        System.out.println("--------------------------------------------------------");
        System.out.println("\t\tBerhasil Ditambahkan");
        System.out.println("--------------------------------------------------------");

    }
    @Override
 public void tampil(){
      System.out.println("Nama Pemesan                                     :" + this.nama);
      System.out.println("No Hp Pemesan                                    :" + this.noHp);
      System.out.println("Nomor Kamar                                      :" + this.noKamar);
      System.out.println("Lama Inap                                        :" + this.lamaInap);
      System.out.println("Total Harga                                      :" + this.totalHarga);
      System.out.println("Fasilitas Tambahan                               :" + this.fasilitasTambahan);
      System.out.println("Keterangan                                       :" + this.reservasi);
 }
 
 //METHOD IMPLEMENTS INTERFACE
    @Override
    public void checkIn(String nama, int noHp, double totalHarga,String metodePembayaran, boolean isTunai){
      System.out.println("--------------------------------------------------------");
      System.out.println("\t\tPemesan Kamar Mewah dengan");
      System.out.println("--------------------------------------------------------");
      System.out.println("Nama Pemesan                                     : " + this.nama);
      System.out.println("No Hp Pemesan                                    : " + this.noHp);
      System.out.println("Total Harga                                      : " + this.totalHarga);
      System.out.println("Metode Pembayaran                                : " + metodePembayaran);
      System.out.println("--------------------------------------------------------");
        System.out.println("\t\tBerhasil Melakukan Check In");
        System.out.println("--------------------------------------------------------");

      
      
      
  }
//METHOD IMPLEMENTS INTERFACE
    @Override
    public void menu() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Apakah anda ingin melakukan check-in? Ya/Tidak");
    String jawaban = sc.next();
    if(jawaban.equalsIgnoreCase("Ya")) {
        if(isCheckIn) {
            System.out.println("Anda sudah melakukan check-in.");
        } else {
            System.out.println("Nama Pemesan                                     : " + this.nama);
            System.out.println("No Hp Pemesan                                    : " + this.noHp);
            System.out.println("Total Harga                                      : " + this.totalHarga);
            System.out.println("Pilih metode pembayaran\n - Tunai = 1\n - Non-tunai = 2\n");
            int metodePembayaran = sc.nextInt();
            boolean isTunai;
            isTunai = metodePembayaran == 1;
            checkIn(nama, noHp, totalHarga, isTunai ? "Tunai" : "Non-tunai", isTunai);
            isCheckIn = true;
        }
    } else {
        System.out.println("Anda tidak melakukan check-in.");
    }
}

}
