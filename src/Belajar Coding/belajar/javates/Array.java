package belajar.javates;
import java.util.ArrayList;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // array assignment
        int[] nilaiMTK = {80,85,90,95,100};
        int a = 0;

        while (a<5) {
            System.out.println(nilaiMTK[a]);
            a++;
        }

        // deklarasi array

        int[] tinggiBadan = new int[5];
        tinggiBadan[0] = 160; 
        tinggiBadan[1] = 165;
        tinggiBadan[2] = 170;
        tinggiBadan[3] = 175;
        tinggiBadan[4] = 180;

        int x = 0;
        do {
            System.out.println(tinggiBadan[x]);
            x++;
        } while (x<5);

        double asu = 11.5f;
        System.out.println(asu);

        // dengan mensummon import java.util.Arrays kita dapat memanggil
        // aray secara langsung
        System.out.println(Arrays.toString(nilaiMTK));

        // Looping dgn properti length
        for (int i = 0; i < tinggiBadan.length; i++) {
            System.out.println(tinggiBadan[i]);
        }

        // loopping for each
        for (int jumlahNilaiMTK : nilaiMTK) {
            System.out.println(jumlahNilaiMTK);
        }

        // dua array atau lebih bisa punya 1 array yg sama (tanpa copy)
        int[] arrayKe1 = {1,2,3,4,5};
        int[] arrayKe2 = new int[5];
        int[] arrayKe3 = new int[5];

        System.out.println(arrayKe1);
        System.out.println(arrayKe2);
        System.out.println(arrayKe3);

        System.out.println(Arrays.toString(arrayKe1));
        System.out.println(Arrays.toString(arrayKe3));
        System.out.println(Arrays.toString(arrayKe3));

        arrayKe3 = arrayKe2 = arrayKe1;
        
        System.out.println(arrayKe1);
        System.out.println(arrayKe2);
        System.out.println(arrayKe3);

        arrayKe2[3] = 40;
        System.out.println(Arrays.toString(arrayKe1));
        System.out.println(Arrays.toString(arrayKe3));
        System.out.println(Arrays.toString(arrayKe3));

        // method yg argumennya pass by reference (ngikut)
        fungsiArray(arrayKe3);
        System.out.println(Arrays.toString(arrayKe1));
        System.out.println(Arrays.toString(arrayKe3));
        System.out.println(Arrays.toString(arrayKe3));

        // operasi Array
        // =================
        // operasi pertama : mengcopy array (bukan address/pass by reference)
        // 1. mengcopy dengan loop
        int[] arrayFirst = {6, 7, 8, 9, 10};
        int[] arraySecond = new int[5];
        arrayString(arrayFirst);
        arrayString(arraySecond);

        for (int iCopy = 0; iCopy < arrayFirst.length; iCopy++) {
            arraySecond[iCopy] = arrayFirst[iCopy];
        }

        arrayString(arrayFirst);
        arrayString(arraySecond);
        // pembuktian bahwa addressnya beda
        System.out.println(arrayFirst);
        System.out.println(arraySecond);

        // 2. mengcopy dengan copyOf
        int[] arrayThird = Arrays.copyOf(arrayFirst, 3);
        arrayString(arrayFirst);
        arrayString(arrayThird);

        // 3. mengcopy dengan copyOfRange (indeks awal termasuk, akhir tidak)
        int[] arrayFourth = Arrays.copyOfRange(arrayFirst, 1, 4);
        arrayString(arrayFourth);



        // operasi kedua : fill array (mengisi nilai array dgn nilai sama)
        int[] arrayFill1 = new int[5];
        Arrays.fill(arrayFill1, 13);
        arrayString(arrayFill1);


        // operasi ketiga : komparasi array (membandingkan antara 2 array)
        // 1. cek dua array sama atau tidak menggunakan Arrays.equals
        int[] arrayKomparasi1 = {1,2,3,4,5};
        int[] arrayKomparasi2 = {1,2,7,4,5};

        System.out.println(Arrays.equals(arrayKomparasi1, arrayKomparasi2));

        if (Arrays.equals(arrayKomparasi1, arrayKomparasi2)){
            System.out.println("kedua array ini sama");
        } else {
            System.out.println("kedua array ini berbeda");
        }

        // 2. cek mana array lebih besar (1 jika array awal lebih besar, 0 jika kedua array sama
        // dan -1 jika array kedua lebih besar)
        System.out.println("cek kedua array ini lebih besar = " + Arrays.compare(arrayKomparasi1, arrayKomparasi2));

        // 3. cek mana index yang berbeda (jika sama semua, output -1)
        System.out.println("index mana yang berbeda = " + Arrays.mismatch(arrayKomparasi1, arrayKomparasi2));


        // operasi keempat : search array (mencari array di indek brp)
        // sort array dulu sblm search (urutkan)
        arrayString(arrayKomparasi2);
        Arrays.sort(arrayKomparasi2);
        arrayString(arrayKomparasi2);
        // baru kita search
        System.out.println("nilai 5 berada di index = " + Arrays.binarySearch(arrayKomparasi2, 5));
        System.out.println("nilai 7 berada di index = " + Arrays.binarySearch(arrayKomparasi2, 7));


        // tugas baru, 
        // 1. sort array tpi terbalik gunakan loop 
        // 2. operasi tambah menggunakan function dan copyOf

        // ================================================
        System.out.println("tugas 1 : menambahkan 2 buah array");
        int[] arrayJumlah1 = {2,6,4,3,2,6,8,9,6,5};
        arrayString(arrayJumlah1);
        int[] arrayJumlah2 = {5,6,7,8,2,4,4,5,6,7};
        arrayString(arrayJumlah2);

        int[] hasil = new int[10];
        for (int iPlus = 0; iPlus < arrayJumlah2.length; iPlus++) {
            hasil[iPlus] = arrayJumlah1[iPlus] + arrayJumlah2[iPlus];
        }
        
        System.out.println("kita jumlahkan menjadi dibawah ini :");
        arrayString(hasil);
        System.out.println("inilah ketika diurutkan");
        Arrays.sort(hasil);
        arrayString(hasil);


        // ================================================
        System.out.println("===============");
        System.out.println("tugas 1 sort array terbalik");
        System.out.println("jawab :");
        int[] arrayTugas1 = {1, 6, 3, 7, 5};
        System.out.println("senelum diurutkan(sort)");
        arrayString(arrayTugas1);

        Arrays.sort(arrayTugas1);
        System.out.println("setelah diurutkan");
        arrayString(arrayTugas1);

        for (int iSort = 4; iSort >=0; iSort--){
            System.out.print(arrayTugas1[iSort] + " ");
        }
        arrayString(arrayTugas1);

        // Array Multi Dimensi
        // array 2 dimensi assignment mode
        System.out.println("ini metode array 2D assignment");
        int[][] assignment2D = {
            {1, 2, 3, 4, 5}, 
            {6, 7, 8, 9, 10}
        };
        printArray2D(assignment2D);

        // array 2 dimensi deklarasi mode
        System.out.println("ini metode array 2D deklarasi");
        int [][] deklarasi2D = new int [5][3];
        printArray2D(deklarasi2D);
        
        // Looping lengkap secraa manual
        // catatan for di dalam akan kembali ke semula disaat sudah ga mengeksekusi apapun
        for (int iLoop = 0; iLoop < deklarasi2D.length; iLoop++) {
            System.out.print("[");
            for (int jLoop = 0; jLoop < deklarasi2D[iLoop].length; jLoop++) {
                System.out.print(deklarasi2D[iLoop][jLoop] + ",");
            }
            System.out.print("] \n");
        }

        for (int star = 0; star < 5; star++){
            for (int jStar = 0; jStar < star; jStar++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }

        // Looping foreach
        for (int[] baris : deklarasi2D) {
            System.out.print("[");
            for (int angka : baris) {
                System.out.print(angka + ",");
            }
            System.out.print("] \n");
        }

        System.out.println("-------------------");
        System.out.println("baris baru wle");
        System.out.println("saya mendapatkan metode ArrayList dari instagram");

        ArrayList<Integer> number = new ArrayList<>(10);
        number.add(0, 1);
        number.add(1, 2);
        System.out.println(number);
        number.set(0, 100);
        System.out.println(number);
           }

    

    // fungsi untuk array multi dimensi
    private  static void printArray2D(int[][] array2D) {
        System.out.println("{");
        for (int[] baris : array2D) {
            System.out.print("{");
            for (int angka : baris) {
                System.out.print(angka + ",");
            }
            System.out.print("} \n");
        }
        System.out.print("} \n");
    }

    // biar cepat tidak perlu arrays.tostring
    private static void arrayString(int[] gantiData){
        System.out.println("array ini = " + Arrays.toString(gantiData));
    }

    // method yg argumennya pass by reference (ngikut)
    private static void fungsiArray(int[] dataFungsi){
        dataFungsi[2] = 3500;
    }
}
