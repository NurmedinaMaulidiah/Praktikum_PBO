package posttest1;
import java.util.*;
import java.io.*;
import java.util.ArrayList;

public class bismillah {
    
    
    static ArrayList<Pemesan> pemesan = new ArrayList<>();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        while (true) {
            System.out.println("=============== DATA PEMESANAN KAMAR HOTEL DEL LUNA ===============\n");
            System.out.println(" \t     | 1. Create Data Pemesanan Kamar |");
            System.out.println(" \t     | 2. Read Data Pemesanan Kamar   |");
            System.out.println(" \t     | 3. Update Data Pemesanan Kamar |");
            System.out.println(" \t     | 4. Delete Data Pemesanan Kamar |");
            System.out.println(" \t     | 5. Exit                        |\n");
            System.out.print("Masukan Pilihan Menu Anda : ");
            int pilih = Integer.parseInt(br.readLine());
            if (pilih == 1) {
                create();
            } else if (pilih == 2) {
                read();
            } else if (pilih == 3) {
                update();
            } else if (pilih == 4) {
                delete();
            } else if (pilih == 5) {
                System.out.println("TERIMA KASIH TELAH MENGGUNAKAN SISTEM PENDATAAN PEMESANAN KAMAR HOTEL DEL LUNA!!!");
                System.exit(0);
            } else {
                System.out.println("Pilihan Tidak Tersedia");
            }
        }
    }

    public static void create() throws IOException {
            System.out.print("=============== PENDATAAN PEMESANAN KAMAR HOTEL DEL LUNA ===============\n");
            System.out.print("Masukkan Nama Pemesan Kamar  : ");
            String addNama = br.readLine();
            System.out.print("Masukkan No Hp Pemesan       : ");
            int addNoHp = Integer.parseInt(br.readLine());
            System.out.print("Masukkan Jenis Kamar Pilihan Pemesan\n \t1. Kamar Mewah\n \t2. Kamar Biasa\n  ");
            int pilihKamar = Integer.parseInt(br.readLine());
            String jenisKamar;
            double hargaKamar;
            switch (pilihKamar) {
                case 1:
                    jenisKamar = "Kamar Mewah";
                    hargaKamar = 2500000;
                    break;
                case 2:
                    jenisKamar = "Kamar Biasa";
                    hargaKamar = 1500000;
                    break;
                default:
                jenisKamar = "Tidak Ada";
                hargaKamar = 0;
            }
            // System.out.print("Masukkan No Kamar yang di Pesan : ");
            // int addNoKamar = Integer.parseInt(br.readLine());
            System.out.print("Masukkan Lama Inap Pemesan      : ");
            int addLamaInap = Integer.parseInt(br.readLine());
            System.out.print("Masukkan Total Harga            :");
            double totalHarga = hargaKamar * addLamaInap ;
            Pemesan pemesanBaru = new Pemesan(addNama, addNoHp, jenisKamar, hargaKamar, addLamaInap, totalHarga);
            // add == menambahkan data ke array list
            pemesan.add(pemesanBaru);
            //pemanggilan method registrasi
            pemesanBaru.registrasi();
            
            

    }

    public static void read() throws IOException{
        System.out.println("=============== DATA PEMESANAN KAMAR HOTEL DEL LUNA ===============");
        /// I itu permisalan untuk index karena array list = array :v
        /// size == ukuran / panjang array list
        for (int i = 0; i < pemesan.size(); i++){
            System.out.println("\t\t\tPEMESAN KE-" + (i+1));
            //karena index itu 0 maka ditambah 1
            // get == mengambil data dari array list
            System.out.println(" Nama Pemesan             : " + pemesan.get(i).nama);
            System.out.println(" No Hp Pemesan            : " + pemesan.get(i).noHp);
            System.out.println(" Jenis Kamar yang dipesan : " + pemesan.get(i).jenisKamar);
            System.out.println(" Harga Kamar yang dipesam : " + pemesan.get(i).hargaKamar);
            System.out.println(" Lama Inap                : " + pemesan.get(i).lamaInap);
            System.out.println(" Total Harga              : " + pemesan.get(i).totalHarga);
            System.out.println("\n");
        
        }
    }

    public static void update() throws IOException{
        read();

        System.out.print("=============== PENDATAAN PEMESANAN KAMAR HOTEL DEL LUNA ===============\n");
        System.out.print("Masukkan Data Pemesan Ke-        : ");
        int index = Integer.parseInt(br.readLine());
        System.out.print("Masukkan Nama Pemesan Kamar      : ");
        String setNama = br.readLine();
        System.out.print("Masukkan No Hp Pemesan           : ");
        int setNoHp = Integer.parseInt(br.readLine());
        System.out.println("Masukkan Jenis Kamar Pilihan Pemesan\n \t1. Kamar Mewah\n \t2. Kamar Biasa\n");
        int setPilihKamar = Integer.parseInt(br.readLine());
            String setJenisKamar;
            double setHargaKamar;
            switch (setPilihKamar) {
                case 1:
                    setJenisKamar = "Kamar Mewah";
                    setHargaKamar = 2500000;
                    break;
                case 2:
                    setJenisKamar = "Kamar biasa";
                    setHargaKamar = 1500000;
                    break;
                default:
                setJenisKamar = "Tidak Ada";
                setHargaKamar = 0;
            }
        // System.out.println("Masukkan No Kamar yang di Pesan : ");
        // int setAddNoKamar = Integer.parseInt(br.readLine());
        System.out.println("Masukkan Lama Inap Pemesan      : ");
        int setAddLamaInap = Integer.parseInt(br.readLine());
        System.out.println("Masukkan Total Harga            : ");
        double setTotalHarga = setAddLamaInap * setHargaKamar;

        // memasukan data yang baru ke array list (menggantikannya)
        pemesan.get(index-1).nama = setNama;
        pemesan.get(index-1).noHp = setNoHp;
        pemesan.get(index-1).jenisKamar = setJenisKamar;
        pemesan.get(index-1).hargaKamar = setHargaKamar;
        pemesan.get(index-1).lamaInap = setAddLamaInap;
        pemesan.get(index-1).totalHarga = setTotalHarga;

        ///pemanggilan method terupdate
        pemesan.get(index-1).terupdate();        
    


    }
    public static void delete() throws IOException{
        read();
        System.out.println("=============== DATA PEMESANAN KAMAR HOTEL DEL LUNA ===============");
        // System.out.println("        Delete Data Pemesan Ke-  :          ");
        System.out.print("          Masukan Data Pemesan ke- : ");
        int index = Integer.parseInt(br.readLine());
        // remove == menghapus data dari array list
        pemesan.remove(index-1);
    }


}
