package belajar.javates;

import java.util.Scanner;

public class Kalkulator2 {
    public static void main(String[] args) {
        
        Scanner inputKalkulator = new Scanner(System.in);
        boolean operasiBerlanjut = true;

        System.out.print("Siapa Nama Anda = ");
        String nama = inputKalkulator.nextLine();
        System.out.println("Oke " + nama + " Selamat Datang");

        System.out.println("=========KALKULATOR SEDERHANA=========");
        
        while (operasiBerlanjut) {
            System.out.print("Masukkan angka = ");
            int angka = inputKalkulator.nextInt();

            System.out.print("Pilih Operasi (+-*/) = " + angka + " " );
            String operasi = inputKalkulator.next();

            System.out.print("Masukkan angka = " + angka + " " + operasi + " ");
            int angka2 = inputKalkulator.nextInt();

            int hasil = 0;
            boolean valid = true;
            switch (operasi) {
                case "+":
                    hasil = angka + angka2;
                    break;
                case "-":
                    hasil = angka - angka2;
                    break;
                case "*":
                    hasil = angka * angka2;
                    break;
                case "/":
                    if (angka2 != 0) {
                        hasil = angka / angka2; 
                    }else {
                        System.out.println("Error tidak boleh membagi dengan 0");
                        valid = false;
                    }
                    break;
                default:
                    System.out.println("operasi tidak valid");
                    break;
            }

            if(valid) {
                System.out.println("Hasilnya Adalah = " + hasil);
            }

            System.out.print("Apakah ingin melakukan operasi lain? (ya/tidak) = ");
            String jawab = inputKalkulator.next();
            
            if (!jawab.equalsIgnoreCase ("YA")) {
                operasiBerlanjut = false;
            }
        }
        System.out.println("Terimakasih telah menggunakan kalkulator");
    }
}

