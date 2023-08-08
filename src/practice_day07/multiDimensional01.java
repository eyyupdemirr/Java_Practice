package practice_day07;

import java.util.Arrays;

public class multiDimensional01 {
    /*
    Bir okulun öğrencilerinin matematik sınav notlarını saklamak için
    bir program yapmanız gerekmektedir. Her öğrenci için
    iki dönemlik (örneğin, ilk ve ikinci dönem) sınav notlarını saklamak için
    kullanmanız gerekmektedir. öğrencilere ait notları ve yıl ortalamasını hesaplayan
    Java programını yazınız:
     */
    public static void main(String[] args) {

        int[][] donemnotlari={{60,70},{40,90},{70,85},{45,47},{50,51}};

        for (int i = 0; i <donemnotlari.length ; i++) {
            int ilkdonem=donemnotlari[i][0];
            int ikincidonem=donemnotlari[i][1];
            System.out.println(i+1+". ogrencinin notlari");
            System.out.println("ilk donem: "+ilkdonem);
            System.out.println("ikinci donem: "+ikincidonem);
            double ortalama=(ilkdonem+ikincidonem)/2;
            System.out.println("ortalama not: "+ortalama);
            System.out.println("   ****************************");



        }






    }
}
