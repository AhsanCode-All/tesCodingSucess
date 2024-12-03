package belajar.javates;
import java.util.*;

public class warna {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("masukkan rentang warna");
        double rentangWarna = scan.nextDouble();

        if (rentangWarna >= 50 && rentangWarna < 100) {
            System.out.println("warnanya hijau");
        } else if (rentangWarna >= 120 && rentangWarna < 200) {
            System.out.println("warnanya pelangi");
        } else {System.out.println("alfoters bingung");}
    }
}