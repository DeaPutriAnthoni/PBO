import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

// Nama : Dea Putri Anthoni
// NIM : 2209106091
// Kelas : B2'22
// Judul : Sistem Pendataan Es Krim di Icecreamdey Shop

public class App{
    public static void main(String[] args) throws IOException{
        String kode_eskrim, rasa, topping;
        int stok, harga, pilihan;

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        ArrayList<eskrim> eskr = new ArrayList<>();
        menu menu = new menu(br);

        while (true){
            pilihan = menu.Menu();

            switch (pilihan) {
                case 1:
                    System.out.println("============================");
                    System.out.println("*** || Tambah Es Krim || ***");
                    System.out.println("============================");
                    System.out.print("|| Kode Es Krim : ");
                    kode_eskrim = br.readLine();
                    System.out.print("|| Rasa Es Krim : ");
                    rasa = br.readLine();
                    System.out.print("|| Topping Es Krim : ");
                    topping = br.readLine();
                    System.out.print("|| Stok : ");
                    stok = Integer.parseInt(br.readLine());
                    System.out.print("|| Harga Es Krim : Rp. ");
                    harga = Integer.parseInt(br.readLine());

                    eskrim data_eskrim = new eskrim(kode_eskrim, rasa, topping, stok, harga);
                    eskr.add(data_eskrim);
                    System.out.println("Data Es Krim Berhasil Ditambahkan!\n");
                    break;

                case 2:
                    System.out.println("============================");
                    System.out.println("*** || Lihat Es Krim || ****");
                    System.out.println("============================");
                    if (eskr.isEmpty()){
                        System.out.println("Masukkan Data Es Krim Terlebih Dahulu\n");

                    } else {
                        for (int i = 0; i < eskr.size(); i += 1){
                            eskr.get(i).display();
                        }
                    }
                    break;

                case 3:
                    System.out.println("==========================");
                    System.out.println("*** || Ubah Es Krim || ***");
                    System.out.println("==========================");
                    System.out.print("Masukkan Kode Es Krim Yang Ingin Diubah : ");
                    String kode_eskrim2 = br.readLine();
                    boolean data_cocok = false;
                    for (eskrim eskrim : eskr){
                        if (eskrim.getkode_eskrim().equals(kode_eskrim2)){
                            System.out.print("|| Rasa Es Krim :  ");
                            eskrim.setRasa(br.readLine());
                            System.out.print("|| Topping Es Krim :  ");
                            eskrim.setTopping(br.readLine());
                            System.out.print("|| Stok Es Krim :  ");
                            eskrim.setStok(Integer.parseInt(br.readLine()));
                            System.out.print("|| Harga Es Krim : Rp. ");
                            eskrim.setHarga(Integer.parseInt(br.readLine()));
                            data_cocok = true;
                            break;
                        }
                    }
                    if (data_cocok){
                        System.out.println("Data Es Krim Berhasil Diubah!\n");
                    }
                    break;

                case 4:
                    System.out.println("===========================");
                    System.out.println("*** || Hapus Es Krim || ***");
                    System.out.println("===========================");
                    System.out.print("Masukkan Kode Es Krim Yang Ingin Dihapus : ");
                    String kode_eskrim3 = br.readLine();
                    boolean data_cocok2 = false;
                    for (int i = 0; i < eskr.size(); i++){
                        if (eskr.get(i).getkode_eskrim().equals(kode_eskrim3)){
                            eskr.remove(i);
                            data_cocok2 = true;
                            System.out.println("Data Es Krim Berhasil Dihapus!\n");
                        }
                    }
                    break;

                case 5:
                    System.out.println("==========================================");
                    System.out.println("Terima Kasih dan Sampai Jumpa Kembali!!!");
                    System.out.println("==========================================");
                    System.exit(0);
                    break;
            }
        }
    }
}