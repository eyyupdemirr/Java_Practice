package practice_day07;

import java.util.ArrayList;
import java.util.Scanner;

public class forEachLoop02 {
    public static void main(String[] args) {
         /*
// Bir ArrayList oluşturun ve içine çeşitli ürün fiyatları ekleyin.
// Bu fiyatların toplamını hesaplayarak ekrana yazdırın.
// Örnek çıktı:
// Toplam fiyat: 236.5
*/


        ArrayList<Double> fiyatlar = new ArrayList<>();
        Scanner scan = new Scanner(System.in);


        System.out.print("1. ürün satış fiyatını giriniz: ");
        double urun1 = scan.nextDouble();
        System.out.print("2. ürün satış fiyatını giriniz: ");
        double urun2 = scan.nextDouble();
        System.out.print("3. ürün satış fiyatını giriniz: ");
        double urun3 = scan.nextDouble();
        System.out.print("4. ürün satış fiyatını giriniz: ");
        double urun4 = scan.nextDouble();

        fiyatlar.add(urun1);
        fiyatlar.add(urun2);
        fiyatlar.add(urun3);
        fiyatlar.add(urun4);
        System.out.println(fiyatlar);//fiyatlar listi

        double toplam = 0;

        for (double istenen : fiyatlar
        ) {
            toplam += istenen;
        }
        System.out.println("bugunku satis: " + toplam);


    }
}
