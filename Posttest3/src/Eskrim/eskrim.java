package Eskrim;

public class eskrim{
    protected String kode_eskrim, rasa_eskrim, topping_eskrim;
    protected int stok_eskrim, harga_eskrim; 

    public eskrim(String kode_eskrim, String rasa, String topping, int stok, int harga){
        this.kode_eskrim = kode_eskrim;
        this.rasa_eskrim = rasa;
        this.topping_eskrim = topping;
        this.stok_eskrim = stok;
        this.harga_eskrim = harga;
    }

    public String getRasa(){
        return rasa_eskrim;
    }

    public void setRasa(String rasa_eskrim){
        this.rasa_eskrim = rasa_eskrim;
    }

    public String getTopping(){
        return topping_eskrim;
    }

    public void setTopping(String topping_eskrim){
        this.topping_eskrim = topping_eskrim;
    }

    public int getStok(){
        return stok_eskrim;
    }

    public void setStok(int stok_eskrim){
        this.stok_eskrim = stok_eskrim;
    }

    public int getHarga(){
        return harga_eskrim;
    }

    public void setHarga(int harga_eskrim){
        this.harga_eskrim = harga_eskrim;
    }

    public String getkode_eskrim(){
        return this.kode_eskrim;
    }

    public void Setkode_eskrim(String kode_eskrim){
        this.kode_eskrim = kode_eskrim;
    }

    public void display(){
        System.out.println("=========================================================");
        System.out.println("|| Kode Es Krim : " + this.kode_eskrim);
        System.out.println("|| Rasa Es krim : " + this.rasa_eskrim);
        System.out.println("|| Topping Es Krim : " + this.topping_eskrim);
        System.out.println("|| Stok Es Krim : " + this.stok_eskrim);
        System.out.println("|| Harga Es Krim : " + this.harga_eskrim);
        System.out.println("=========================================================");
    }
}