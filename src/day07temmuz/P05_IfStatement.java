package day07temmuz;

import java.util.Scanner;

public class P05_IfStatement {
    public static void main(String[] args) {
       // v2- Kullanıcıdan İki adet vize notu ve bir adet final notu girmesini isteyin
       // Yıl sonu notunu vizeler %40 final % 60 olacak şekilde hesaplayıp
       // Ders durumuna bu not 50'den büyük ise Geçtiniz Tebrikler!
       // 50'den küçükse Maalesef Kaldınız olarak aşağıdaki formatta yazdırınız
       // Ad:
       // Soyad:
       // 1.Vize:
       // 2. Vize:
       // Final :
       // Yıl Sonu Notu:
       // Ders Durumu :/*


        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen adinizi giriniz");
        String name=scanner.nextLine();
        System.out.print("Lutfen soyadinizi giriniz");
        String surname=scanner.nextLine();
        System.out.println("Lutfen vize ve finalnotunugiriniz");
        System.out.print("1.Vize: ");
        double vize1=scanner.nextDouble();
        System.out.print("2.Vize: ");
        double vize2=scanner.nextDouble();
        System.out.print("Final: ");
        double finalnotu=scanner.nextDouble();

        double yilsonunotu=((vize1+vize2)/2)*(40/100)+finalnotu*(60/100);
      //  System.out.println("yil sonu"+yilsonunotu);
        //double yilsonunotu=((((vize1+vize2)/2)*40/100)+(finalnotu*60/100));
      //  System.out.println("yil sonu notu 1: ");

        System.out.println("adiniz: "+name);
        System.out.println("soyadiniz: "+surname);
        System.out.println("Vize 1: "+vize1);
        System.out.println("Vize 2: "+vize2);
        System.out.println("Finalnotu: "+finalnotu);
        System.out.println("Yilsonu notu: "+yilsonunotu);

        if (yilsonunotu>50){
            System.out.println("gectiniz");
        }if (yilsonunotu<50){
            System.out.println("Maalesef kaldiniz");
        }















      //ystem.out.print("Lütfen Adınızı Giriniz: ");
      //String name1= scanner.nextLine();
      //System.out.print("LÜtfen Soyadınızı Giriniz: ");
      //String surname1= scanner.nextLine();
      //System.out.println("Lütfen vize ve final notlarınızı sırasıyla giriniz");
      //System.out.print("1.Vize: ");
      //double vize11= scanner.nextDouble();
      //System.out.print("2. Vize: ");
      //double vize22= scanner.nextDouble();
      //System.out.print("Final Notu: ");
      //double finalNotu= scanner.nextDouble();
      //double yilsonunotu1=((((vize1+vize2)/2)*40/100)+(finalNotu*60/100));
      //System.out.println("Adınız: "+name);
      //System.out.println("Soyadınız: "+                                                surname);
      //System.out.println("1. Vize Notu: "+vize1);
      //System.out.println("2. Vize Notu: "+vize2);
      //System.out.println("Final Notu: "+finalNotu);
      //System.out.println("Yıl Sonu Notu = " + yilSonuNotu);
      //if (yilSonuNotu>=50){
      //    System.out.println("Ders Durumu: Geçtiniz Tebrikler");
      //}
      //if (yilSonuNotu<50){
      //    System.out.println("Ders Durumu : Maalesef Kaldınız");






    }

}