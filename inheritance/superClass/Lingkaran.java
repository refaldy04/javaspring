package inheritance.superClass;

public class Lingkaran {
    // atribut
    private int jariJari;

    // method
    public void getTitle() {
        System.out.println("=== LINGKARAN ===");

    }

    public void setJariJari(int jariJari) {
        this.jariJari = jariJari;
    }

    public int getJariJari() {
        return this.jariJari;
    }

    public double getKeliling() {
        return 2 * 3.14 * jariJari;
    }

    public double getLuas() {
        return 3.14 * jariJari * jariJari;
    }
}
