package inheritance.subClass;

import inheritance.superClass.Lingkaran;

public class Bola extends Lingkaran {
    // method
    public double getLuasPermukaan() {
        return 4 * 3.14 * super.getJariJari();
    }

    public double getVolume() {
        return 4 / 3 * 3.14 * super.getJariJari() * super.getJariJari();
    }

    @Override
    public void getTitle() {
        System.out.println("=== BOLA ===");
    }
}
