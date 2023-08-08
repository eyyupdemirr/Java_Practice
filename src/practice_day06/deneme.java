package practice_day06;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {

         /*
    Kullanicidan main method icinde ayri ayri isim ve soyismini alin
    Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
    isim bosluk soyisim seklinde bize donduren bir method olusturun

     */

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen adınızı giriniz: ");
        String name= scan.nextLine();  //next yazılırsa ilk boşluğua kadar alı. nextLine yazılırsa satırı alır.
        System.out.print("Lütfen Soyadınızı giriniz: ");
        String surname= scan.nextLine();
        System.out.println(isimSoyisimYazdir(name,surname));

    }

    private static String isimSoyisimYazdir(String name, String surname) {
        int bosluk=name.indexOf(" ");
        name=name.toUpperCase().charAt(0)+name.substring(1,bosluk).toLowerCase()+" "+name.toUpperCase().charAt(bosluk+1)+name.substring(bosluk+2).toLowerCase();
        //dun yaptigimiz ornekte ikiisim olursa nasilikinciismibuyukharflebaslatiriz denmisti, "indexOf " ile yaptik
        surname=surname.toUpperCase().charAt(0)+surname.substring(1).toLowerCase();
        String duzenliIsim=name+" "+surname;
        return duzenliIsim;





    }
}
