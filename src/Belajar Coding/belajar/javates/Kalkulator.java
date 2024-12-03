package belajar.javates;

import  java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        
        Scanner inputKalkulator = new Scanner(System.in);

        System.out.print("Siapa Nama Anda = ");
        String nama = inputKalkulator.nextLine();
        System.out.println("Oke " + nama + " Selamat Datang");

        System.out.println("=========KALKULATOR SEDERHANA=========");

        System.out.print("Masukkan angka = ");
        int angka = inputKalkulator.nextInt();

        System.out.print("Pilih Operasi (+-*/) = " + angka + " " );
        String operasi = inputKalkulator.next();

        System.out.print("Masukkan angka = " + angka + " " + operasi + " ");
        int angka2 = inputKalkulator.nextInt();

        int hasil = 0;
        boolean valid = true;
        if (operasi.equals("+")) {
            hasil = angka + angka2;
        }else if (operasi.equals("-")){
            hasil = angka - angka2;
        }else if (operasi.equals("*")){
            hasil = angka * angka2;
        }else if (operasi.equals("/")){
            if (angka2 != 0) {
                hasil = angka / angka2;
            }else{
                System.out.println("Error, tidak boleh input 0");
                valid = false;
            }
        }else {
            System.out.println("operasi tidak valid");
            valid = false;
        }

        if(valid) {
            System.out.print("Hasilnya Adalah = " + hasil);
        }
    }
}