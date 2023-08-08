package practice_day07;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Scanner;

public class forEachLoop03 {
    public static void main(String[] args) {

        // Kullanıcıdan 5 adet not alarak bir ArrayList oluşturun.
        // Bu notların ortalamasını hesaplayarak ekrana yazdırın.
        // Örnek çıktı:
        // Notların ortalaması: 78.5

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen not");
        AbstractList<Double> notlar = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + ". not");
            double not = scan.nextDouble();
            notlar.add(not);

        }
        double ort = 0;
        System.out.println(notlar);
        for (double istenen : notlar
        ) {
            ort += istenen / notlar.size();

        }
        System.out.println(" Ortalama not: " + ort);


    }
}
