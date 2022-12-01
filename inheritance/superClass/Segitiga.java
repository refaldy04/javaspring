package inheritance.superClass;

public class Segitiga {
    // atribut
    private int sisi;
    private int tinggi;

    // constructor
    public Segitiga(){

    }

    public Segitiga(int sisi, int tinggi) {
        this.sisi = sisi;
        this.tinggi = tinggi;
    }

    //method getter
    public void getTitle(){
        System.out.println("=== SEGITIGA ===");
    }

    public int getSisi(){
        return sisi;
    }

    public int getTinggi(){
        return tinggi;
    }

    public int getKeliling(){
        return sisi + sisi + sisi;
    }

    public int getLuas(){
        return sisi * tinggi / 2;
    }
}
