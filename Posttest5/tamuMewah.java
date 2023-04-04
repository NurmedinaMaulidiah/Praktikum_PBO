package posttest3_dina;


public abstract class tamuMewah extends Pemesan {


    private int noKamar;
    private int lamaInap;
    private double totalHarga;
    private double hargaKamar;
    private String fasilitasTambahan;
    public final String reservasi = "Silahkan Pilih Fasilitas Tambahan yang Tersedia";
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
public void tambahKamar(String Nama) {
        System.out.println("Nama Pemesan                              : " + this.nama);
    }
public void tambahKamar(String fasilitasTambahan, int noHp) {
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
 
  

}
