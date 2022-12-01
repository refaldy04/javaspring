package inheritance.superClass;

public class Persegi {
    // atribut
    private int sisi;

    // method
    public void getTitle() {
        System.out.println("=== PERSEGI ===");
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int getSisi() {
        return this.sisi;
    }

    public int getKeliling() {
        return 4 * this.sisi;
    }

    // overload method: multi method atau constructor dalam satu class yang sama
    // paramaeternya harus beda
    public int getLuas() {
        return this.sisi * this.sisi;
    }

    public int getLuas(int sisi) {
        return sisi * sisi;
    }
}
