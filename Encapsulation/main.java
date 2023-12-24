 class Enkapsulasi {
    private double alas;
    private double tinggi;
    private double luasSegitiga;

    public void setAlas(double alas) {
        if (alas < 0) {
            System.out.println("Nilai alas tidak boleh negatif");
        } else {
            this.alas = alas;
        }
    }

    public double getAlas() {
        return this.alas;
    }

    public void setTinggi(double tinggi) {
        if (tinggi < 0) {
            System.out.println("Nilai tinggi tidak boleh negatif");
        } else {
            this.tinggi = tinggi;
        }
    }

    public double getTinggi() {
        return this.tinggi;
    }

    public void hitungLuasSegitiga() {
        this.luasSegitiga = 0.5 * this.alas * this.tinggi;
    }

    public double getLuasSegitiga() {
        return this.luasSegitiga;
    }
}

public class main {
    public static void main(String[] args) {
        Enkapsulasi segitiga = new Enkapsulasi();

        segitiga.setAlas(5.0);
        segitiga.setTinggi(10.0);
        segitiga.hitungLuasSegitiga();

        System.out.println("Alas segitiga: " + segitiga.getAlas());
        System.out.println("Tinggi segitiga: " + segitiga.getTinggi());
        System.out.println("Luas segitiga: " + segitiga.getLuasSegitiga());
    }
}

