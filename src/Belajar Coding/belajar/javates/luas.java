package belajar.javates;

public class luas {
    public static void main(String[] args) {
        luasPersegi(10, 25);
    }
    private static void luasPersegi(int panjang, int lebar) {
        int luas = panjang * lebar;
        System.out.println(luas);
    }
}
