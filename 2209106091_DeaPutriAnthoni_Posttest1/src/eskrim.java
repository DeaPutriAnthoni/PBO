public class eskrim{    
    String kode_eskrim, rasa_eskrim, topping_eskrim;
    int stok_eskrim, harga_eskrim  ;

    public eskrim(String kode_eskrim, String rasa, String topping, int stok, int harga){
        this.kode_eskrim = kode_eskrim;
        this.rasa_eskrim = rasa;
        this.topping_eskrim = topping;
        this.stok_eskrim = stok;
        this.harga_eskrim = harga;
    }

    void display(){
        System.out.println("=========================================================");
        System.out.println("|| Kode Es Krim : " + this.kode_eskrim);
        System.out.println("|| Rasa Es krim : " + this.rasa_eskrim);
        System.out.println("|| Topping Es Krim : " + this.topping_eskrim);
        System.out.println("|| Stok Es Krim : " + this.stok_eskrim);
        System.out.println("|| Harga Es Krim : " + this.harga_eskrim);
        System.out.println("=========================================================");
    }

    public void setRasa(String rasa_eskrim2){
        this.rasa_eskrim = rasa_eskrim2;
    }

    public void setTopping(String topping_eskrim2){
        this.topping_eskrim = topping_eskrim2;
    }

    public void setStok(Integer stok_eskrim2){
        this.stok_eskrim = stok_eskrim2;
    }

    public void setHarga(Integer harga_eskrim2){
        this.harga_eskrim = harga_eskrim2;
    }
}