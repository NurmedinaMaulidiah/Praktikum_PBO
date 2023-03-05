package posttest1;
public class Pemesan {
    // property
    String nama;
    int noHp;
    String jenisKamar;
    double hargaKamar;
    int lamaInap;
    double totalHarga;
    
    public Pemesan(String nama, int noHp, String jenisKamar, double hargaKamar, int lamaInap, double totalHarga){
        this.nama = nama;
        this.noHp = noHp;
        this.jenisKamar = jenisKamar;
        this.hargaKamar = hargaKamar;
        this.lamaInap = lamaInap;
        this.totalHarga = totalHarga;
    }

    public void registrasi(){
        System.out.println("=============== DATA PEMESANAN KAMAR HOTEL DEL LUNA ===============");
        System.out.println("Nama Pemesan" + this.nama);
        System.out.println("No Hp Pemesan" + this.noHp);
        System.out.println("Jenis Kamar" + this.jenisKamar);
        System.out.println("hargaKamar " + this.hargaKamar);
        System.out.println("Lama Inap " + this.lamaInap);
        System.out.println("Total Harga" + this.totalHarga);
        System.out.println("TELAH BERHASSIL MELAKUKAN PEMESANAN KAMAR");

    }
    public void terupdate(){
        System.out.println("\t=============== DATA PEMESANAN KAMAR HOTEL DEL LUNA ===============");
        System.out.println("Nama Pemesan           : " + this.nama);
        System.out.println("No Hp Pemesan          : " + this.noHp);
        System.out.println("Jenis Kamar            : " + this.jenisKamar);
        System.out.println("hargaKamar             : " + this.hargaKamar);
        System.out.println("Lama Inap              : " + this.lamaInap);
        System.out.println("Total Harga            : "+ this.totalHarga);
        System.out.println("TELAH BERHASIL DI UPDATE PADA SISTEM PENDATAAN PEMESANAN KAMAR HOTEL DEL LUNA");
    }
}