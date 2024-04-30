package Eskrim;

import java.util.HashMap;
import java.util.Map;

public class transaksi_eskrim implements transaksi {
    private static Map<String, Integer> transaksi = new HashMap<>();

    @Override
    public void tambah_transaksi(String kode_eskrim, int jumlah) {
        if (transaksi.containsKey(kode_eskrim)) {
            int total = transaksi.get(kode_eskrim) + jumlah;
            transaksi.put(kode_eskrim, total);
        } else {
            transaksi.put(kode_eskrim, jumlah);
        }
        System.out.println("-> Transaksi Berhasil Terjadi!");
    }

    @Override
    public void lihat_transaksi() {
        if (transaksi.isEmpty()) {
            System.out.println("-> Belum Ada Transaksi Yang Dilakukan.");
        } else {
            System.out.println(" .  z  Daftar Transaksi: z  . ");
            for (Map.Entry<String, Integer> entry : transaksi.entrySet()) {
                System.out.println("Kode Es Krim: " + entry.getKey() + ", Jumlah: " + entry.getValue());
            }
        }
    }
}
