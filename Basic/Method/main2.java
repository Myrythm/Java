
public class main2 {
    public static int faktorial(int x) {
        int hasil = 1;
        for (int i = x ; i >= 1 ; i--) {
            hasil *= i;
        }
        return hasil; // nilai yang dikembalikan
    }
    
    public static void main(String[] args){
        System.out.println(faktorial(10)); 
    }
}
