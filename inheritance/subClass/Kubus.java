package inheritance.subClass;

import inheritance.superClass.Persegi;

public class Kubus extends Persegi {
    // method
    public int getVolume() {
        return super.getSisi() * super.getSisi() * super.getSisi();
    }

    @Override
    public void getTitle() {
        System.out.println("=== KUBUS ===");
    }
}
