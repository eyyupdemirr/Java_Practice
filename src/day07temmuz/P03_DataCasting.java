package day07temmuz;

public class P03_DataCasting {
    public static void main(String[] args) {

        double a = 119.1, b = 29.9, c = 9;
        double toplam = a + b + c;
        System.out.println((double) toplam);
        System.out.println((short) toplam);
        System.out.println((float) toplam);
        double sonuc = (a / b);
        System.out.println((int) (a / b));
        System.out.println("sonuc   " + sonuc);
    }
}
