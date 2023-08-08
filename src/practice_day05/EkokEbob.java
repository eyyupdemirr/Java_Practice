package practice_day05;

import java.util.Scanner;

public class EkokEbob {
    public static void main(String[] args) {
        // Kullanıcıdan 2 tamsayı alın ve EBOB (En Büyük Ortak Bölen) ve
        // EKOK(En Küçük Ortak Kat) değerlerini bulun

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen iki sayigiriniz");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        int ebob = 0;
        int sayac = 0;
        int kucuksayi ;
        if (sayi1 < sayi2) {
            kucuksayi = sayi1;
        } else
        { kucuksayi = sayi2;}

        //System.out.println(kucuksayi);

        for (int i = kucuksayi; i >= 2; i--) {
            if (sayi1 %i == 0 && sayi2 % i == 0) {
                System.out.println("ebob.: "+i);
                sayac++;
                break;
            }

        }
        if (sayac == 0){
            System.out.println("ebob yok");}



        //System.out.println("ebob : " + ebob);

    }
}
