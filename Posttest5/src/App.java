import Eskrim.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

// Nama : Dea Putri Anthoni
// NIM : 2209106091
// Kelas : B2'22
// Judul : Sistem Pendataan Es Krim di Icecreamdey Shop

public final class App {
    public static void main(String[] args) throws IOException {
        String kode_eskrim, rasa, topping, tempat_eskrim, jenis_susu;
        int stok, harga, pilihan;

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        ArrayList<eskrimcoklat> eskrCok = new ArrayList<>();
        ArrayList<eskrimstoberi> eskrStob = new ArrayList<>();
        ArrayList<eskrimvanilla> eskrVan = new ArrayList<>();
        menu menu = new menu(br);

        while (true) {
            pilihan = menu.Menu();

            switch (pilihan) {
                case 1:
                    System.out.println("============================");
                    System.out.println("*** || Tambah Es Krim || ***");
                    System.out.println("============================");
                    System.out.println(">>>> 1. Es Krim Coklat  <<<<");
                    System.out.println(">>>> 2. Es Krim Stoberi <<<<");
                    System.out.println(">>>> 3. Es Krim Vanilla <<<<");
                    System.out.print("Pilih Es Krim Yang Ingin Anda Tambah : ");
                    Integer pilihTambah = Integer.parseInt(br.readLine());

                    if (pilihTambah == 1) {
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
                        System.out.print("|| Tempat Es Krim (Cup/Cone) : ");
                        tempat_eskrim = br.readLine();
                        System.out.print("|| Jenis Susu Es Krim (Almond Milk/Soy Milk) : ");
                        jenis_susu = br.readLine();

                        eskrimcoklat data_eskrim = new eskrimcoklat(kode_eskrim, rasa, topping, stok, harga, tempat_eskrim, jenis_susu);
                        eskrCok.add(data_eskrim);
                        System.out.println("Data Es Krim Berhasil Ditambahkan!\n");
                        break;
                    } else if (pilihTambah == 2) {
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
                        System.out.print("|| Tempat Es Krim (Cup/Cone) : ");
                        tempat_eskrim = br.readLine();
                        System.out.print("|| Jenis Susu Es Krim (Almond Milk/Soy Milk) : ");
                        jenis_susu = br.readLine();

                        eskrimstoberi data_eskrim = new eskrimstoberi(kode_eskrim, rasa, topping, stok, harga, tempat_eskrim, jenis_susu);
                        eskrStob.add(data_eskrim);
                        System.out.println("Data Es Krim Berhasil Ditambahkan!\n");
                        break;
                    } else if (pilihTambah == 3) {
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
                        System.out.print("|| Tempat Es Krim (Cup/Cone) : ");
                        tempat_eskrim = br.readLine();
                        System.out.print("|| Jenis Susu Es Krim (Almond Milk/Soy Milk) : ");
                        jenis_susu = br.readLine();

                        eskrimvanilla data_eskrim = new eskrimvanilla(kode_eskrim, rasa, topping, stok, harga, tempat_eskrim, jenis_susu);
                        eskrVan.add(data_eskrim);
                        System.out.println("Data Es Krim Berhasil Ditambahkan!\n");
                        break;
                    }

                case 2:
                    System.out.println("============================");
                    System.out.println("*** || Lihat Es Krim  || ***");
                    System.out.println("============================");
                    System.out.println(">>>> 1. Es Krim Coklat  <<<<");
                    System.out.println(">>>> 2. Es Krim Stoberi <<<<");
                    System.out.println(">>>> 3. Es Krim Vanilla <<<<");
                    System.out.print("Pilih Es Krim Yang Ingin Anda Lihat : ");
                    Integer pilihLihat = Integer.parseInt(br.readLine());

                    if (pilihLihat == 1 && eskrCok.isEmpty()) {
                        System.out.println("Masukkan Data Es Krim Coklat Terlebih Dahulu\n");
                    } else if (pilihLihat == 2 && eskrStob.isEmpty()) {
                        System.out.println("Masukkan Data Es Krim Stoberi Terlebih Dahulu\n");
                    } else if (pilihLihat == 3 && eskrVan.isEmpty()) {
                        System.out.println("Masukkan Data Es Krim Vanilla Terlebih Dahulu\n");
                    } else {

                        if (pilihLihat == 1) {
                            for (int i = 0; i < eskrCok.size(); i += 1) {
                                System.out.println("=========================================================");
                                System.out.println("|| Kode Es Krim : " + eskrCok.get(i).getkode_eskrim());
                                System.out.println("|| Rasa Es krim : " + eskrCok.get(i).getRasa());
                                System.out.println("|| Topping Es Krim : " + eskrCok.get(i).getTopping());
                                System.out.println("|| Stok Es Krim : " + eskrCok.get(i).getStok());
                                System.out.println("|| Harga Es Krim : " + eskrCok.get(i).getHarga());
                                System.out.println("|| Tempat Es Krim : " + eskrCok.get(i).getTempat_eskrim());
                                System.out.println("|| Susu Es Krim : " + eskrCok.get(i).getJenis_susu());
                                System.out.println("=========================================================");
                            }
                        } else if (pilihLihat == 2) {
                            for (int i = 0; i < eskrStob.size(); i += 1) {
                                System.out.println("=========================================================");
                                System.out.println("|| Kode Es Krim : " + eskrStob.get(i).getkode_eskrim());
                                System.out.println("|| Rasa Es krim : " + eskrStob.get(i).getRasa());
                                System.out.println("|| Topping Es Krim : " + eskrStob.get(i).getTopping());
                                System.out.println("|| Stok Es Krim : " + eskrStob.get(i).getStok());
                                System.out.println("|| Harga Es Krim : " + eskrStob.get(i).getHarga());
                                System.out.println("|| Tempat Es Krim : " + eskrStob.get(i).getTempat_eskrim());
                                System.out.println("|| Susu Es Krim : " + eskrStob.get(i).getJenis_susu());
                                System.out.println("=========================================================");
                            }
                        } else if (pilihLihat == 3) {
                            for (int i = 0; i < eskrVan.size(); i += 1) {
                                System.out.println("=========================================================");
                                System.out.println("|| Kode Es Krim : " + eskrVan.get(i).getkode_eskrim());
                                System.out.println("|| Rasa Es krim : " + eskrVan.get(i).getRasa());
                                System.out.println("|| Topping Es Krim : " + eskrVan.get(i).getTopping());
                                System.out.println("|| Stok Es Krim : " + eskrVan.get(i).getStok());
                                System.out.println("|| Harga Es Krim : " + eskrVan.get(i).getHarga());
                                System.out.println("|| Tempat Es Krim : " + eskrVan.get(i).getTempat_eskrim());
                                System.out.println("|| Susu Es Krim : " + eskrVan.get(i).getJenis_susu());
                                System.out.println("=========================================================");
                            }
                        }
                    }
                    break;

                case 3:
                    System.out.println("============================");
                    System.out.println("*** ||  Ubah Es Krim  || ***");
                    System.out.println("============================");
                    System.out.println(">>>> 1. Es Krim Coklat  <<<<");
                    System.out.println(">>>> 2. Es Krim Stoberi <<<<");
                    System.out.println(">>>> 3. Es Krim Vanilla <<<<");
                    System.out.print("Pilih Es Krim Yang Ingin Anda Ubah : ");
                    Integer pilihUbah = Integer.parseInt(br.readLine());

                    if (pilihUbah == 1 && eskrCok.isEmpty()) {
                        System.out.println("Masukkan Data Es Krim Coklat Terlebih Dahulu\n");
                    } else if (pilihUbah == 2 && eskrStob.isEmpty()) {
                        System.out.println("Masukkan Data Es Krim Stoberi Terlebih Dahulu\n");
                    } else if (pilihUbah == 3 && eskrVan.isEmpty()) {
                        System.out.println("Masukkan Data Es Krim Vanilla Terlebih Dahulu\n");
                    } else {

                        if (pilihUbah == 1) {
                            System.out.print("Masukkan Kode Es Krim Yang Ingin Di Ubah : ");
                            String kode_eskrim2 = br.readLine();
                            for (eskrimcoklat cok : eskrCok) {
                                if (cok.getkode_eskrim().equals(kode_eskrim2)) {
                                    System.out.print("|| Rasa Es Krim : ");
                                    cok.setRasa(br.readLine());
                                    System.out.print("|| Topping Es Krim : ");
                                    cok.setTopping(br.readLine());
                                    System.out.print("|| Stok : ");
                                    cok.setStok(Integer.parseInt(br.readLine()));
                                    System.out.print("|| Harga Es Krim : Rp. ");
                                    cok.setHarga(Integer.parseInt(br.readLine()));
                                    System.out.print("|| Tempat Es Krim (Cup/Cone) : ");
                                    cok.setTempat_eskrim(br.readLine());
                                    System.out.print("|| Jenis Susu Es Krim (Almond Milk/Soy Milk) : ");
                                    cok.setJenis_susu(br.readLine());
                                    System.out.println("Data Es Krim Berhasil Diubah!\n");
                                }
                            }
                        } else if (pilihUbah == 2) {
                            System.out.print("Masukkan Kode Es Krim Yang Ingin Di Ubah : ");
                            String kode_eskrim2 = br.readLine();
                            for (eskrimstoberi stob : eskrStob) {
                                if (stob.getkode_eskrim().equals(kode_eskrim2)) {
                                    System.out.print("|| Rasa Es Krim : ");
                                    stob.setRasa(br.readLine());
                                    System.out.print("|| Topping Es Krim : ");
                                    stob.setTopping(br.readLine());
                                    System.out.print("|| Stok : ");
                                    stob.setStok(Integer.parseInt(br.readLine()));
                                    System.out.print("|| Harga Es Krim : Rp. ");
                                    stob.setHarga(Integer.parseInt(br.readLine()));
                                    System.out.print("|| Tempat Es Krim (Cup/Cone) : ");
                                    stob.setTempat_eskrim(br.readLine());
                                    System.out.print("|| Jenis Susu Es Krim (Almond Milk/Soy Milk) : ");
                                    stob.setJenis_susu(br.readLine());
                                    System.out.println("Data Es Krim Berhasil Diubah!\n");
                                }
                            }
                        } else if (pilihUbah == 3) {
                            System.out.print("Masukkan Kode Es Krim Yang Ingin Di Ubah : ");
                            String kode_eskrim2 = br.readLine();
                            for (eskrimvanilla van : eskrVan) {
                                if (van.getkode_eskrim().equals(kode_eskrim2)) {
                                    System.out.print("|| Rasa Es Krim : ");
                                    van.setRasa(br.readLine());
                                    System.out.print("|| Topping Es Krim : ");
                                    van.setTopping(br.readLine());
                                    System.out.print("|| Stok : ");
                                    van.setStok(Integer.parseInt(br.readLine()));
                                    System.out.print("|| Harga Es Krim : Rp. ");
                                    van.setHarga(Integer.parseInt(br.readLine()));
                                    System.out.print("|| Tempat Es Krim (Cup/Cone) : ");
                                    van.setTempat_eskrim(br.readLine());
                                    System.out.print("|| Jenis Susu Es Krim (Almond Milk/Soy Milk) : ");
                                    van.setJenis_susu(br.readLine());
                                    System.out.println("Data Es Krim Berhasil Diubah!\n");
                                }
                            }
                        }
                    }
                    break;

                case 4:
                    System.out.println("============================");
                    System.out.println("*** ||  Hapus Es Krim || ***");
                    System.out.println("============================");
                    System.out.println(">>>> 1. Es Krim Coklat  <<<<");
                    System.out.println(">>>> 2. Es Krim Stoberi <<<<");
                    System.out.println(">>>> 3. Es Krim Vanilla <<<<");
                    System.out.print("Pilih Es Krim Yang Ingin Anda Hapus : ");
                    Integer pilihHapus = Integer.parseInt(br.readLine());

                    if (pilihHapus == 1 && eskrCok.isEmpty()) {
                        System.out.println("Masukkan Data Es Krim Coklat Terlebih Dahulu\n");
                    } else if (pilihHapus == 2 && eskrStob.isEmpty()) {
                        System.out.println("Masukkan Data Es Krim Stoberi Terlebih Dahulu\n");
                    } else if (pilihHapus == 3 && eskrVan.isEmpty()) {
                        System.out.println("Masukkan Data Es Krim Vanilla Terlebih Dahulu\n");
                    } else {

                        if (pilihHapus == 1) {
                            System.out.print("Masukkan Kode Es Krim Yang Ingin Di Hapus : ");
                            String kode_eskrim2 = br.readLine();
                            for (int i = 0; i < eskrCok.size(); i++) {
                                if (eskrCok.get(i).getkode_eskrim().equals(kode_eskrim2)) {
                                    eskrCok.remove(i);
                                    System.out.println("Data Es Krim Berhasil Dihapus!\n");
                                }
                            }
                        } else if (pilihHapus == 2) {
                            System.out.print("Masukkan Kode Es Krim Yang Ingin Di Hapus : ");
                            String kode_eskrim2 = br.readLine();
                            for (int i = 0; i < eskrStob.size(); i++) {
                                if (eskrStob.get(i).getkode_eskrim().equals(kode_eskrim2)) {
                                    eskrStob.remove(i);
                                    System.out.println("Data Es Krim Berhasil Dihapus!\n");
                                }
                            }
                        } else if (pilihHapus == 3) {
                            System.out.print("Masukkan Kode Es Krim Yang Ingin Di Hapus : ");
                            String kode_eskrim2 = br.readLine();
                            for (int i = 0; i < eskrVan.size(); i++) {
                                if (eskrVan.get(i).getkode_eskrim().equals(kode_eskrim2)) {
                                    eskrVan.remove(i);
                                    System.out.println("Data Es Krim Berhasil Dihapus!\n");
                                }
                            }
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
