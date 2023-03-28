package posttest3_dina;




public class tamuBiasa extends Pemesan{
    private int noKamar;
    private int lamaInap;
    private double totalHarga;
    private double hargaKamar1;
    private double harga;

    public tamuBiasa(String nama, int noHp, int noKamar, int lamaInap, double hargaKamar1, double totalHarga) {
        super(nama, noHp);
        this.noKamar = noKamar;
        this.lamaInap = lamaInap;
        this.totalHarga = totalHarga;
        this.hargaKamar1 = hargaKamar1;
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

    public double getHargaKamar1() {
        return hargaKamar1;
    }
    public void setHargaKamar1(double hargaKamar1) {
        this.hargaKamar1 = hargaKamar1;
    }
    
 //METHOD OVERLOADING
public void pesanKamar(String Nama) {
        System.out.println("Nama Pemesan                          : " + this.nama);
    }
public void pesanKamar(double totalHarga, int noHp) {
    System.out.println("Total Harga Kamar yang harus dibayar  : " + totalHarga+ "\n" + "Nomor HP                              : " + noHp);
}

    @Override
    public void tambah(){
         System.out.println("--------------------------------------------------------");
    System.out.println("\t\tPemesan Kamar Biasa dengan");
    System.out.println("--------------------------------------------------------");

    // memanggil method overloading
    pesanKamar(this.nama);
    pesanKamar(this.totalHarga, this.noHp);
    System.out.println("Nomor Kamar                           : "+ this.noKamar);
    System.out.println("Lama Inap                             : "+ this.lamaInap);
    System.out.println("--------------------------------------------------------");
    System.out.println("\t\tBerhasil Ditambahkan");
    System.out.println("--------------------------------------------------------");
}
    
}

