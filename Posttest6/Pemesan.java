package posttest3_dina;
public abstract class Pemesan {
    // property
    protected String nama;
    protected int noHp;
    
 // constructor 
 public Pemesan(String nama, int noHp){
    this.nama = nama;
    this.noHp = noHp;
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

public void tambah(){
    System.out.println("Pemesan Kamar dengan Nama " + this.nama);
    System.out.println(" dan Nomor HP " + this.noHp);
    System.out.println("Berhasil Ditambahkan");
}

    /**
     *
     */
 public abstract void tampil();
}

