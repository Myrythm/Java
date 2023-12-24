class tambah {
    public static double tambah(double x, double y){
        return x + y;
    }
}

class bagi {
    public static double bagi(double x, double y){
        return x / y;
    }
}

class kali {
    public static double kali(double x, double y){
        return x * y;
    }
}

class kurang {
    public static double kurang(double x, double y){
        return x - y;
    }
}

public class Calculator {
    public static void main(String[] args) {
        double x = 12.5;
        double y = 2.5;
        tambah plus = new tambah();
        kurang min = new kurang();
        bagi div = new bagi();
        kali mul = new kali();

        System.out.println("Hasil dari " + x + " + " + y + " adalah " + plus.tambah(10, 5));
        System.out.println("Hasil dari " + x + " - " + y + " adalah " + min.kurang(10, 5));
        System.out.println("Hasil dari " + x + " * " + y + " adalah " + mul.kali(10, 5));
        System.out.println("Hasil dari " + x + " / " + y + " adalah " + div.bagi(10, 5));
    }
}