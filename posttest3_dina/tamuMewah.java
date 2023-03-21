package posttest3_dina;
import java.util.*;
import java.io.*;
import java.util.ArrayList;

public class tamuMewah extends Pemesan {
    private int noKamar;
    private int lamaInap;
    private double totalHarga;
    private double hargaKamar;
    private String fasilitasTambahan;
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
    
  
    
    
}
