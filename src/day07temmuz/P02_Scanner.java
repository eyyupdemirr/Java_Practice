package day07temmuz;

import java.util.Scanner;

public class P02_Scanner {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
       //System.out.println("Lutfen asagidaki bilgileri giriniz");
       //System.out.print("Adiniz:  ");
       //String name=scanner.nextLine();
       //System.out.println("");
       //System.out.print("Soyadiniz:  ");
       //String surname=scanner.nextLine();
       //System.out.println("");
       //System.out.print("Yasiniz.  ");
       //int age=scanner.nextInt();
       //System.out.println();
       //System.out.print("Mail adresiniz:  ");
       //String mail=scanner.next();
       //System.out.println();
       //System.out.print("Sifreniz: ");
       //String pass=scanner.next();
       //System.out.println();
       //System.out.println("======Kayitbasarili======");
       //System.out.println("Adiniz: "+name);
       //System.out.println("Soyadiniz: "+surname);
       //System.out.println("yasiniz: "+age);
       //System.out.println("Mail adresiniz: "+mail);
       //System.out.println("Sifreniz: "+pass);
       //System.out.println("kaydiniz basari ile tamamlanmistir");

        System.out.println("lutfen iki adet sayi giriniz");
        double sayi1=scanner.nextDouble();
        double sayi2=scanner.nextDouble();

        sayi1=sayi1+sayi2;
        sayi2=sayi1-sayi2;
        sayi1=sayi1-sayi2;
        System.out.println("sayiilk   "+sayi1);
        System.out.println(sayi2);

    }
}
