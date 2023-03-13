package Posttest2;
public class Pemesan {
    // property
    private String nama;
    private int noHp;
    private String jenisKamar;
    private double hargaKamar;
    private int lamaInap;
    
 // constructor 
 public Pemesan(String nama, int noHp, String jenisKamar, double hargaKamar, int lamaInap, double totalHarga){
    this.nama = nama;
    this.noHp = noHp;
    this.jenisKamar = jenisKamar;
    this.hargaKamar = hargaKamar;
    this.lamaInap = lamaInap;
    this.totalHarga = totalHarga;
}

    // setter and getter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNoHp() {
        return noHp;
    }

    public void setNoHp(int noHp) {
        this.noHp = noHp;
    }

    public String getJenisKamar() {
        return jenisKamar;
    }

    public void setJenisKamar(String jenisKamar) {
        this.jenisKamar = jenisKamar;
    }

    public double getHargaKamar() {
        return hargaKamar;
    }

    public void setHargaKamar(double hargaKamar) {
        this.hargaKamar = hargaKamar;
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
    private double totalHarga;
    
   
//method
    public void registrasi(){
        System.out.println("=============== DATA PEMESANAN KAMAR HOTEL DEL LUNA ===============");
        System.out.println("Nama Pemesan   :"  + this.nama);
        System.out.println("No Hp Pemesan  :"  + this.noHp);
        System.out.println("Jenis Kamar    :"  + this.jenisKamar);
        System.out.println("hargaKamar     :"  + this.hargaKamar);
        System.out.println("Lama Inap      :"  + this.lamaInap);
        System.out.println("Total Harga    :"  + this.totalHarga);
        System.out.println("TELAH BERHASSIL MELAKUKAN PEMESANAN KAMAR");

    }
    public void terupdate(){
        System.out.println("\t=============== DATA PEMESANAN KAMAR HOTEL DEL LUNA ===============");
        System.out.println("Nama Pemesan           : " + this.nama);
        System.out.println("No Hp Pemesan          : " + this.noHp);
        System.out.println("Jenis Kamar            : " + this.jenisKamar);
        System.out.println("hargaKamar             : " + this.hargaKamar);
        System.out.println("Lama Inap              : " + this.lamaInap);
        System.out.println("Total Harga            : " + this.totalHarga);
        System.out.println("TELAH BERHASIL DI UPDATE PADA SISTEM PENDATAAN PEMESANAN KAMAR HOTEL DEL LUNA");
    }
}