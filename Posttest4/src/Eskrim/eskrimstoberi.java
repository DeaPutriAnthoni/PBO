package Eskrim;

public class eskrimstoberi extends eskrim{
    protected String tempat_eskrim2;
    protected String jenis_susu2;

    public eskrimstoberi(String kode_eskrim, String rasa, String topping, int stok, int harga, String tempat_eskrim, String jenis_susu){
        super(kode_eskrim, rasa, topping, stok, harga);
        this.tempat_eskrim2 = tempat_eskrim;
        this.jenis_susu2 = jenis_susu;
    }

    public String getTempat_eskrim(){
        return tempat_eskrim2;
    }

    public void setTempat_eskrim(String tempat_eskrim){
        this.tempat_eskrim2 = tempat_eskrim; 
    }

    public String getJenis_susu(){
        return jenis_susu2;
    }

    public void setJenis_susu(String jenis_susu){
        this.jenis_susu2 = jenis_susu;
    }

    @Override
    public void display(){
        super.display(); 
        System.out.println("|| Tempat Es Krim : " + this.tempat_eskrim2);
        System.out.println("|| Susu Es Krim : " + this.jenis_susu2);
        System.out.println("=========================================================");
    }
}
