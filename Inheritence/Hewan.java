package Inheritence;

class Animal{
    
    public void eat(String jenis, String warna, String makanan){
        System.out.println(jenis + " Yang Berwarna " + warna + " Sedang Makan " + makanan);
    }
}

public class Hewan {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal2 = new Animal();
        animal.eat("Elang", "Coklat", "Ikan");
        animal.eat("Ular", "Coklat", "Ayam");
    }
}
