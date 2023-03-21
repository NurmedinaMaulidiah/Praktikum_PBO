package posttest3_dina;

import java.util.*;
import java.io.*;
import java.util.ArrayList;



public class tamuBiasa extends Pemesan{
    private int noKamar;
    private int lamaInap;
    private double totalHarga;
    private double hargaKamar1;

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
}
