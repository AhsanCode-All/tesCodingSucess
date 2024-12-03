package belajar.javates;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int c = -2;
        System.out.println(-c);

        // postfix prefix
        int aPrefix = 10;
        System.out.println(++aPrefix);

        int bPostfix = 10;
        System.out.println(bPostfix--);
        System.out.println(bPostfix);
        
        // operator boolean
        int aSame,bSame;
        aSame = 10;
        bSame = 12;
        System.out.println(aSame == bSame);
        System.out.println(aSame != bSame);
        System.out.println(aSame < bSame);
        System.out.println(aSame > bSame);

        // println agar baris baru, print untuk bukan baris baru
        System.out.println("Aku ingin tidur");
        System.out.print("karna itu ");
        System.out.println("adalah hobiku");

        var x = 5;
        var p = 90;
        var z = x * p;

        System.out.println(z);

        // int untuk hanya bilangan bulat, var bisa untuk berbagai hal(bulat,desimal,string)
        int a = 5;
        double b = 2.59876543;
        double cDouble = a * b;
        var imut = "aku adalah";

        System.out.println(imut);
        System.out.println(c);

        int peler;
        peler = 20;
        System.out.println(peler);

        float s = 2.56f;
        double m = 2.56;
        System.out.println(s + m);

        int q = 3;
        int w = 10;
        int l;
        // -- artinya dikurang 1
        w -= 6;
        q += 18;
        l = w * q;

        System.out.println(l);

        String nama = "Ahsan";
        String namaLengkap = " Nurfauzi";
        // untuk teks dan cara menggabungkannya
        System.out.println(nama + namaLengkap);

        // boolean itu hanya false dan true
        boolean tampan = true;
        boolean jelek = false;
        
        if (jelek) {
            System.out.println("dia jelek sekali");
        }
        else if (tampan) {
            System.out.println("dia tampan rupawan");
        }
        else {
            System.out.println("Dia tidak bisa dideskripsikan");
        }

        // operasi logika &&(dan) ||(atau) ^(XOR berbeda = true) !(negasi/not)
        if (1<10 ^ !true) {
            System.out.println("sangat bagus");
        }else{
            System.out.println("bodohhhh");
        }

        // switch mirip dengan if else tapi untuk membungkus mudah
        int D = 90;
        switch (D) {
            case 98:
                System.out.println("D bernilai 98");
                break;
        
            case 96:
                System.out.println("D bernilai 96");
                break;

            case 97:
                System.out.println("D bernilai 97");
                break;

            default:
                System.out.println("salah semua");
                break;
        }

    // SISTEM LOOPING
        // for
        for(int u=5; u>0; u--){
            System.out.println(u);
        }
        // while
        int u = 10;
        while (u<13) {
            System.out.println("hasil dari operasi tersebut " + u);
            u++;
        }
        // do while perbedannya mau false dia tetap berjalan minimal sekali
        int t = 8;
        do {
            System.out.println("aku tau jawabannya adalah " + t);
            t--;
        }while(t>3);

        // pemakaian break dan continue
        for(int e=6; e>5; e++){
            // continue memulai kembali dari awal
            if (e==68) {
                continue;
            }
            // break itu memaksa keluar
            else if (e==70) {
                break;
            }
            System.out.println("ini variabel sampai " + e);
        }

    // SISTEM ARRAY
        // cara kompleks
        int[] engineer = new int[6];
        engineer[0]=10;engineer[1]=20;engineer[2]=30;engineer[3]=40;engineer[4]=50;engineer[5]=60;
        for(int h=0;h<6;h++){
            System.out.println("nilai ANAK TEKNIK INI " + engineer[h]);
        }
        // cara simple
        int[] engineerMuda = {1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000, 10000};
        for(int j=0;j<10;j++){
            System.out.println("inilah jumlah anak teknik di universitas bengkulu " + engineerMuda[j]);
        }

    // membuat objek
    // namaKelas nama = new namaKelas();

        // void
        Main ahsan = new Main();
        // metode itu harus diluar print args
        ahsan.makan("enak sekali ", 20);
       
        // return
        Main kembali = new Main();
        String hasil = kembali.kalikan();
        System.out.println("Hasil: " + hasil);

        // set
        Main marina = new Main();
        marina.setKulit("putih cantik");
        System.out.println(marina.werno);

        // get
        Main nurfauzi = new Main();
        System.out.println(nurfauzi.getMuka());

        // OOP (Class name = new Class();)
        Scanner jaguar = new Scanner(System.in);

        System.out.print("Panjang Balok = ");
        int panjangBalok = jaguar.nextInt();
        System.out.print("Lebar Balok = ");
        int lebarBalok = jaguar.nextInt();
        System.out.print("Tinggi Balok = ");
        int tinggiBalok = jaguar.nextInt();

        int luasBalok = panjangBalok * lebarBalok * tinggiBalok;
        System.out.println("luas balok = " + luasBalok);

        System.out.println("///////INI COBAAN///////");

        int tebakanKamu;
        boolean nilaiBenar;

        System.out.print("Masukkan tebakan anda = ");
        tebakanKamu = jaguar.nextInt();
        System.out.println("Nilai tebakan = " + tebakanKamu);
        nilaiBenar = (tebakanKamu >=5) && (tebakanKamu <=9);
        System.out.println("Tebakan anda " + nilaiBenar);

        System.out.println("////////////");

        // TENARY OPERATOR(IF ELSE YG LEBBIH SINGKAt)
        int input, zTenary;
        Scanner tenary = new Scanner(System.in);
        System.out.print("masukkan nilai : ");
        input = tenary.nextInt();

        zTenary = (input == 8) ? (input*15) : (input/2);
        System.out.println("hasilnya adalah : " + zTenary);

        int xFungsi,yFungsi;
        xFungsi = 12;
        yFungsi = fungsi(xFungsi);
        System.out.println("ketika nilai x nya " + xFungsi + ", maka nilai y nya adalah " + yFungsi);

        xFungsi = 25;
        yFungsi = fungsi(xFungsi);
        System.out.println("nilai yang kedua x nya adalah " + xFungsi + " Maka nilai y nya adalah " + yFungsi);

        int aZungsi,bZungsi;
        bZungsi = 25;
        aZungsi = zungsi(bZungsi);
        System.out.println("jadi ada fungsi kedua yaitu nilai a = " + aZungsi + " jika nilai b = " + bZungsi);
    } 

    // metode void
    // parameter
    void makan(String puas, int porsi){
        System.out.println("Nyam nyam " + puas + porsi + " mangkok");
    }
    // metode return
    String hitam = "aku";
    String kalikan() {
        hitam = "enak";
        return hitam;
        }
    // metode set dan get
    // set untuk void, get untuk return
    // set
    String werno = "putih";
    void setKulit(String warnaKulit){
        werno = warnaKulit;
    }
    // get
    String muka = "pink";
    String getMuka(){
        return muka;
    }

    private static int fungsi (int silang) {
        int hasil = (silang + 12 + silang) * silang;
        return hasil;
    }

    private static int zungsi (int kerucut) {
        int gasak = kerucut * kerucut * kerucut;
        return gasak;
    }
}