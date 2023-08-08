package practice_day05;

import java.util.Scanner;

public class IstenenKadarYazdirma {
    public static void main(String[] args) {
        /*
         * Kullanicidan 3 harften uzun bir kelime ve 10'dan kucuk bir sayi alin,
         * Kelimenin son 2 harfini girilen sayi kadar yan yana yazdirin
​
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir kelime giriniz: ");
        String kelime = scan.next();
        System.out.print("Bir rakam giriniz: ");
        int rakam = scan.nextInt();
        String son2harf=kelime.substring(kelime.length()-2);

        for (int i = 0; i <=rakam ; i++) {
            System.out.print(son2harf+" ");

        }







    }
}
