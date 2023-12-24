class sepeda {
        String merk;
        int JumlahRoda;
        String warna;

        sepeda(String a, int b, String c){
            merk = a;
            JumlahRoda = b;
            warna = c;
            System.out.println("Sepeda merk " + merk + " Jumlah Roda " + JumlahRoda + " Berwarna " + warna);
        }
}

public class main {
    public static void main(String[] args){
        sepeda sepeda1 = new sepeda("Polygon", 2, "Merah");
        sepeda sepeda2 = new sepeda("Giganto", 3, "Putih");
    }
}