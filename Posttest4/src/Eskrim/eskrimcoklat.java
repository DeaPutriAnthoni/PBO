package Eskrim;

public class eskrimcoklat extends eskrim{
    protected String tempat_eskrim;
    protected String jenis_susu;

    public eskrimcoklat(String kode_eskrim, String rasa, String topping, int stok, int harga, String tempat_eskrim, String jenis_susu){
        super(kode_eskrim, rasa, topping, stok, harga);
        this.tempat_eskrim = tempat_eskrim;
        this.jenis_susu = jenis_susu;
    }

    public String getTempat_eskrim(){
        return tempat_eskrim;
    }

    public void setTempat_eskrim(String tempat_eskrim){
        this.tempat_eskrim = tempat_eskrim; 
    }

    public String getJenis_susu(){
        return jenis_susu;
    }

    public void setJenis_susu(String jenis_susu){
        this.jenis_susu = jenis_susu;
    }

    @Override
    public void display(){
        super.display(); 
        System.out.println("|| Tempat Es Krim : " + this.tempat_eskrim);
        System.out.println("|| Susu Es Krim : " + this.jenis_susu);
        System.out.println("=========================================================");
    }
}

