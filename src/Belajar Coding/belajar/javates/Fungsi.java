package belajar.javates;

public class Fungsi {
    public static void main(String[] args) {
        int peler = 5;
        arrayString(peler);
        int ler = 100;
        arrayString(ler);
    }

    private static void arrayString(int gantiData){
        gantiData += 10;
        System.out.println("array ini = " + gantiData);
    }
}
