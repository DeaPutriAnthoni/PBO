import java.io.BufferedReader;
import java.io.IOException;

public class menu{
    private BufferedReader br;

    public menu(BufferedReader br){
        this.br = br;
    }

    public int Menu() throws IOException{
        System.out.println("=======================================");
        System.out.println(">>>>   WELCOME TO ICECREAMDEY!!!   <<<<");
        System.out.println(">>>> ||      HAPPY SHOPPING     || <<<<");
        System.out.println("=======================================");
        System.out.println("**** ||    1. Tambah Es Krim    || ****");
        System.out.println("**** ||    2. Lihat Es Krim     || ****");
        System.out.println("**** ||    3. Ubah Es Krim      || ****");
        System.out.println("**** ||    4. Hapus Es Krim     || ****");
        System.out.println("**** ||    5. Keluar?           || ****");
        System.out.println("=======================================");
        System.out.print("|| Ingin Pilih Nomor Berapa? : ");
        return Integer.parseInt(br.readLine());
    }

    public String getInput(String message) throws IOException{
        System.out.print(message + ": ");
        return br.readLine();
    }

    public int getIntInput(String message) throws IOException{
        System.out.print(message + ": ");
        return Integer.parseInt(br.readLine());
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}