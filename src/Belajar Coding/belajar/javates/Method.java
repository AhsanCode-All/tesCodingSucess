package belajar.javates;

public class Method {
    public static void main (String[] args){
        String nam = "ahsan";
        int umu = 18;
        float ber = 52.5f;
        double ting = 155.52d;

        System.out.println("hai nama saya " + nam);
        System.out.println("umur saya " + umu);
        System.out.println("berat saya yaitu " + ber + " kg");
        System.out.println("tinggi saya yaitu " + ting + " cm");
        int x,y;
        x = 12;
        y = fungsi(x);
        System.out.println("ketika nilai x nya " + x + ", maka nilai y nya adalah " + y);

        x = 25;
        y = fungsi(x);
        System.out.println("nilai yang kedua x nya adalah " + x + " Maka nilai y nya adalah " + y);

        int a,b;
        b = 25;
        a = zungsi(b);
        System.out.println("jadi ada fungsi kedua yaitu nilai a = " + a + " jika nilai b = " + b);

        haloSayang("Marina");

        // FUNGSIREKURSIF
        int parameter = 8;
        FunctionTestRekursif(parameter);

        // Overload Method/fungsi
        bilangan(10);
        bilangan(12.67f);
        bilangan("ganteng");

        int hasilJumlah;
        hasilJumlah = bilangan(125, 37);
        System.out.println("jadi hasil operasi dari angkapertama dan angka kedua = " + hasilJumlah);
    }

    private static int fungsi (int silang) {
        int hasil = (silang + 12 + silang) * silang;
        return hasil;
    }

    private static int zungsi (int kerucut) {
        int gasak = kerucut * kerucut * kerucut;
        return gasak;
    }

    private static void haloSayang(String namaAyang){
        System.out.println("halooo pacarkuuu " + namaAyang);
    }

    // FUNGSI REKURSIF
    private static int FunctionTestRekursif(int RekursifTest){
        if (RekursifTest == 23) {
            return RekursifTest;
        }
        System.out.println(RekursifTest);
        RekursifTest++;
        return FunctionTestRekursif(RekursifTest);
    }

    // OVERLOAD METHOD
    private static void bilangan (int angkaInt){
        System.out.println("ini adalah integer = " + angkaInt);
    }

    private static void bilangan (float angkaFloat){
        System.out.println("ini itu float dengan nilai = " + angkaFloat);
    }

    private static void bilangan (String hasilBacotan){
        System.out.println("maaf saya sedikit curhat saya itu adalah orang " + hasilBacotan);
    }

    private static int bilangan (int angkaPertama, int angkaKedua){
        return angkaPertama - angkaKedua;
    }
}
