package belajar.javates;
import java.util.*;

public class latihanJava {
    public static void main(String[] args) {
        
        String y = "ini program awal";
        String z = "ini program akhir";
        System.out.println(y);

        int a = 5;
        int b = 10;
        int c = 76;
        
        if (a == 5) {
            if (b == 10){
                System.out.println("");
                if (c == 76){
                    System.out.println("ini a true, b true, c true");
                } else {
                    System.out.println("a true, b true, c false");
                }
            } else {
                System.out.println("ini a true, b false, c false");
            }

        } else if (b == 10) {
            if (c == 76) {
                if (a == 5) {
                    System.out.println("b true, c true, a true");
                } else {
                    System.out.println("b true, c true, a false");
                }
            } else {
                System.out.println("b true, c true, a false");
            }

        } else {
            System.out.println("semuanya false");
        }

        System.out.println(z);

        // latihan looping
        int awal, akhir;
        
        Scanner isian = new Scanner(System.in);
        System.out.print("nilai awal ");
        awal = isian.nextInt();
        System.out.print("nilai akhir ");
        akhir = isian.nextInt();

        int total = 0;
        while (awal <= akhir) {
            total = total + awal;
            System.out.println("ini nilai ke- " + total);
            awal++;
        }

        System.out.println("------DO WHILE------");
        int doAwal, doAkhir;
        doAwal = isian.nextInt();
        doAkhir = isian.nextInt();
        int hasil = 0;
        do {
            hasil = hasil + doAwal;
            System.out.println("nilai do while ke-" + hasil);
            doAwal++;
        } while (doAwal <= doAkhir);

        System.out.println("//////FOR\\\\\\");
        System.out.print("masukkan nilai aw = ");
        int forAw = isian.nextInt();
        System.out.print("masukkan nilai ak = ");
        int forAk = isian.nextInt();
        int hasilFor = 0;

        for (; forAw <= forAk; forAw++) {
            hasilFor = hasilFor + forAw;
            System.out.println("for nya adalah = " + hasilFor);
        }
        
        System.out.println("///////////");
        // fibonacci (x = x-2 + x-1)
        int fiboAw, fiboAwbe1, fiboAwbe2, fibo;
        System.out.print("Masukkan fibo = ");
        fibo = isian.nextInt();
        fiboAw = 1;
        fiboAwbe1 = 1;
        fiboAwbe2 = 0;
        int i = 1;
        
        while (i <= fibo) {
            
            fiboAw = fiboAwbe1 + fiboAwbe2;
            fiboAwbe2 = fiboAwbe1;
            fiboAwbe1 = fiboAw;
            System.out.println("ini nilai fibo ke - " + i + " adalah = " + fiboAw);
            i++;
        }
        
        int vBreak = 0;
        while (true) {
            vBreak++;
           
            if (vBreak == 15) {
                break;
            } else if (vBreak == 10) {
                continue;
            }
            System.out.println("ini adalah kode ke - " + vBreak);
        }

        for (int aFor = 0; aFor < 5; aFor++) {
            for (int bFor = 0; bFor < 5; bFor++) {
                System.out.print("*");
                if (aFor == bFor) {
                    break;
                }
            }
            System.out.print("\n");
        }

        

        }
    }
