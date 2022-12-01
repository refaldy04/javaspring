package inheritance.subClass;

import inheritance.superClass.Segitiga;

public class PrismaSegitiga extends Segitiga {
    // atribut
    private int tinggiPrisma;

    // contructor
    public PrismaSegitiga(int sisi, int tinggiAlas, int tinggiPrisma) {
        super(sisi, tinggiAlas);
        this.tinggiPrisma = tinggiPrisma;
    }

    public PrismaSegitiga() {

    }

    // method
    public int getVolume() {
        // luas alas * tinggi prisma
        return super.getLuas() * tinggiPrisma;
    }

    @Override
    public void getTitle() {
        System.out.println("=== PRISMA SEGITIGA ===");
    }

    public int getTinggiPrisma() {
        return tinggiPrisma;
    }
}
