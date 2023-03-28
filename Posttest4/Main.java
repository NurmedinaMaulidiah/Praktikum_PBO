package posttest3_dina;



import java.math.BigDecimal;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<tamuBiasa> tamubiasa = new ArrayList<tamuBiasa>();
    static ArrayList<tamuMewah> tamumewah = new ArrayList<tamuMewah>();
    
    public static void main (String[] args) throws IOException {
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
            }if (pilih == 2) {
                read();
            }if (pilih == 3) {
                update();
            }if (pilih == 4) {
                delete();
            }if (pilih == 5) {
                System.out.println("TERIMA KASIH TELAH MENGGUNAKAN SISTEM PENDATAAN PEMESANAN KAMAR HOTEL DEL LUNA!!!");
                System.exit(0);
            } else {
                System.out.println("");
            }
        }
    }
    public static void create() throws IOException {
            System.out.print("=============== PENDATAAN PEMESANAN KAMAR HOTEL DEL LUNA ===============\n");
            System.out.println("Tambah Data");
            System.out.println("1. Tamu Kamar Mewah ");
            System.out.println("2. Tamu Kamar Biasa");
            System.out.println("Masukkan Pilihan : ");
            int pilihan = Integer.parseInt(br.readLine());
            switch (pilihan) {
                case 1:
                    double hargaKamar = 2500000;
                    System.out.print("Masukkan Nama Pemesan Kamar         : ");
                    String addNama = br.readLine();
                    System.out.print("Masukkan No Hp Pemesan              : ");
                    int addNoHp = Integer.parseInt(br.readLine());
                    System.out.print("Masukkan Nomor Kamar                : ");
                    int addNoKamar = Integer.parseInt(br.readLine());
                    System.out.print("Masukkan Lama Inap                  : ");
                    int addLamaInap = Integer.parseInt(br.readLine());
                    double totalHarga = hargaKamar * addLamaInap ;
                    System.out.print("Masukkan Fasilitas Tambahan Kamar   : ");
                    String addFasilitas = br.readLine();
                    
                    tamuMewah tamuMewahBaru = new tamuMewah(addNama, addNoHp, addNoKamar, addLamaInap, hargaKamar, totalHarga, addFasilitas);
                    tamumewah.add(tamuMewahBaru);
                    tamuMewahBaru.tambah();

                    break;
                case 2 :
                    double hargaKamar1 = 1500000;
                    System.out.print("Masukkan Nama Pemesan Kamar   : ");
                    String addNama1 = br.readLine();
                    System.out.print("Masukkan No Hp Pemesan        : ");
                    int addNoHp1 = Integer.parseInt(br.readLine());
                    System.out.print("Masukkan Nomor Kamar          : ");
                    int addNoKamar1 = Integer.parseInt(br.readLine());
                    System.out.print("Masukkan Lama Inap            : ");
                    int addLamaInap1 = Integer.parseInt(br.readLine());
                    double totalHarga1 = hargaKamar1 * addLamaInap1 ;
                    tamuBiasa tamuBiasaBaru = new tamuBiasa(addNama1, addNoHp1, addNoKamar1, addLamaInap1, hargaKamar1, totalHarga1);
                    tamubiasa.add(tamuBiasaBaru);
                    tamuBiasaBaru.tambah();
                    
                    break;
                default :
                    System.out.println("Pilihan Tidak ada");
                    break;
            }
   
    }

    public static void read() throws IOException{
        System.out.println("Lihat Data");
            System.out.println("1. Tamu Kamar Mewah ");
            System.out.println("2. Tamu Kamar Biasa");
            System.out.println("Masukkan Pilihan : ");
            int pilihan = Integer.parseInt(br.readLine());
            switch (pilihan) {
                case 1 -> {
                    System.out.println("\n=============== DATA PEMESANAN KAMAR MEWAH HOTEL DEL LUNA ===============");
                    for (int i = 0; i < tamumewah.size(); i++){
                        System.out.println("\t\t\tPEMESAN KE-" + (i+1));
                        System.out.println(" Nama Pemesan             : " + tamumewah.get(i).getNama());
                        System.out.println(" No Hp Pemesan            : " + tamumewah.get(i).getNoHp());
                        System.out.println(" Nomor Kamar yang Dipesan : " + tamumewah.get(i).getNoKamar());
                        System.out.println(" Lama Inap                : " + tamumewah.get(i).getLamaInap());
                        System.out.println(" Total Harga              : " + tamumewah.get(i).getTotalHarga());
                        System.out.println(" Fasilitas Tambahan       : " + tamumewah.get(i).getFasilitasTambahan());
                        System.out.println("\n");
                    }
                    break;
            }
                case 2 -> {
                    System.out.println("\n=============== DATA PEMESANAN KAMAR BIASA HOTEL DEL LUNA ===============");
                    for (int i = 0; i < tamubiasa.size(); i++){
                        double total = tamubiasa.get(i).getTotalHarga();
                        System.out.println("\t\t\tPEMESAN KE-" + (i+1));
                        System.out.println(" Nama Pemesan             : " + tamubiasa.get(i).getNama());
                        System.out.println(" No Hp Pemesan            : " + tamubiasa.get(i).getNoHp());
                        System.out.println(" Nomor Kamar yang Dipesan : " + tamubiasa.get(i).getNoKamar());
                        System.out.println(" Lama Inap                : " + tamubiasa.get(i).getLamaInap());
                        System.out.println(" Total Harga              : " + BigDecimal.valueOf(total).toPlainString());
                        System.out.println("\n");
                    
                    }break;
            }
                default -> System.out.println("Pilihan Tidak Ada");
                }

        
    }

    public static void update() throws IOException{
        System.out.println("Update data");
        System.out.println("1. Tamu Kamar Mewah");
        System.out.println("2. Tamu Kamar Biasa");
        System.out.print("Masukan Pilihan : ");
        int pilihan = Integer.parseInt(br.readLine());
        switch (pilihan) {
        case 1 -> {
            System.out.print("=============== PENDATAAN PEMESANAN KAMAR HOTEL DEL LUNA ===============\n");
            System.out.print("Masukkan Data Pemesan Kamar Mewah Ke-        : ");
            int index = Integer.parseInt(br.readLine());
            index--;
            if(index <= tamumewah.size() || index > 0) {
                double hargaKamar = 2500000;
                System.out.print("Masukkan Nama Pemesan Kamar         : ");
                String addNama = br.readLine();
                tamumewah.get(index).setNama(addNama);
                System.out.print("Masukkan No Hp Pemesan              : ");
                int addNoHp = Integer.parseInt(br.readLine());
                tamumewah.get(index).setNoHp(addNoHp);
                System.out.print("Masukkan Nomor Kamar                : ");
                int addNoKamar = Integer.parseInt(br.readLine());
                tamumewah.get(index).setNoKamar(addNoKamar);
                System.out.print("Masukkan Lama Inap                  : ");
                int addLamaInap = Integer.parseInt(br.readLine());
                tamumewah.get(index).setLamaInap(addLamaInap);
                double totalHarga = hargaKamar * addLamaInap ;
                tamumewah.get(index).setTotalHarga(totalHarga);
                System.out.print("Masukkan Fasilitas Tambahan Kamar   : ");
                String addFasilitas = br.readLine();
                tamumewah.get(index).setFasilitasTambahan(addFasilitas);
                
                System.out.println("Data Berhasil Diedit");
                }else {
                System.out.println("Data Tidak ada");}
            break;
            }
            case 2 -> {
                System.out.print("=============== PENDATAAN PEMESANAN KAMAR HOTEL DEL LUNA ===============\n");
                System.out.print("Masukkan Data Pemesan Kamar Biasa Ke-        : ");
                int index1 = Integer.parseInt(br.readLine());
                index1--;
                if(index1 <= tamubiasa.size() || index1 > 0) {
                    double hargaKamar = 1500000;
                    System.out.print("Masukkan Nama Pemesan Kamar   : ");
                    String addNama = br.readLine();
                    tamubiasa.get(index1).setNama(addNama);
                    System.out.print("Masukkan No Hp Pemesan        : ");
                    int addNoHp = Integer.parseInt(br.readLine());
                    tamubiasa.get(index1).setNoHp(addNoHp);
                    System.out.print("Masukkan Nomor Kamar          : ");
                    int addNoKamar = Integer.parseInt(br.readLine());
                    tamubiasa.get(index1).setNoKamar(addNoKamar);
                    System.out.print("Masukkan Lama Inap            : ");
                    int addLamaInap = Integer.parseInt(br.readLine());
                    tamubiasa.get(index1).setLamaInap(addLamaInap);
                    double totalHarga = hargaKamar * addLamaInap ;
                    tamubiasa.get(index1).setTotalHarga(totalHarga);

                    System.out.println("Data Berhasil Diedit");
           
                }else {
                    System.out.println("Data Tidak ada");
                }
            break;
            }
                default -> {break;}
            }
  
    }
    public static void delete() throws IOException{
        System.out.println("Hapus data");
        System.out.println("1. Tamu Kamar Mewah");
        System.out.println("2. Tamu Kamar Biasa");
        System.out.print("Masukan Pilihan : ");
        int pilihan = Integer.parseInt(br.readLine());
        switch (pilihan) {
            case 1 -> {
                System.out.println("=============== DATA PEMESANAN KAMAR MEWAH HOTEL DEL LUNA ===============");
                System.out.print("          Masukan Data Pemesan ke- : ");
                int index = Integer.parseInt(br.readLine());
                
                if(index <= tamumewah.size() || index > 0){
                    tamumewah.remove(index-1);
                    System.out.println("Data Berhasil Dihapus");
                 
                    
                }else{
                    System.out.println("Data Tidak Ada");
                }
            }
            case 2 -> {
                System.out.println("=============== DATA PEMESANAN KAMAR BIASA HOTEL DEL LUNA ===============");
                System.out.print("          Masukan Data Pemesan ke- : ");
                int index1 = Integer.parseInt(br.readLine());
                
                if(index1 <= tamubiasa.size() || index1 > 0){
                    tamubiasa.remove(index1-1);
                    System.out.println("Data Berhasil Dihapus");
                }else{
                    System.out.println("Data Tidak Ada");
                }
            }
    }
}}
