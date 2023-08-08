package day07temmuz;

import java.util.Scanner;

public class P01_Scaner {
    public static void main(String[] args) {
         /*
1- Kullanıcıdan ad/soyad/yas/mail adresi/şifre bilgileirini alıp
sisteme kaydedildiğini aşağıdaki formatta yazdırın.
 *****       KAYIT BAŞARILI      *****
Adınız: Tarık
Soyadınız: Yiğit
Yaşınız:42
Mail Adresiniz:tarik@yigit.com
Şifreniz: A2e365
şeklinde sistemimize kaydınız başarıyla tamamlanmıştır.
 */

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lutfen asagidaki bilgileri giriniz");
        String isim=scanner.nextLine();
        System.out.println("Adiniz :"+isim);

       // System.out.println("Lutfen soyadinizi giriniz");
        String soyisim=scanner.nextLine();
        System.out.println("Soyadiniz :"+soyisim);

       // System.out.println("Lutfen yasinizi giriniz");
        int yas=scanner.nextInt();
        System.out.println("Yasiniz :"+yas);
        scanner.nextLine();
      //  System.out.println("Lutfen mailinizi giriniz");
        String mail=scanner.nextLine();
        System.out.println("Mailiniz :"+mail);
        scanner.nextLine();

        //System.out.println("Lutfen sifrenizi giriniz");
        String sifre=scanner.nextLine();
        System.out.println("Sifreniz :"+sifre);
        System.out.println("şeklinde sistemimize kaydınız başarıyla tamamlanmıştır.");






    }
}
