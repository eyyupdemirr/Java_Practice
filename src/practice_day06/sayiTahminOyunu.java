package practice_day06;

import java.util.Random;
import java.util.Scanner;

public class sayiTahminOyunu {
    public static void main(String[] args) {

        Random random=new Random();
        int sayi= random.nextInt(100);

        System.out.println("Aklimdan sayi tuttum tahmin et");
        Scanner scanner = new Scanner(System.in);
        boolean dogrumu = true;

        while (dogrumu) {
            int tahmin = scanner.nextInt();
            if (tahmin > sayi) {
                System.out.println("Cok soyledin Düsür.");
            } else if (tahmin < sayi) {
                System.out.println("Az soyledin.Arttir");

            } else if (tahmin == sayi) {
                System.out.println("tebrikler");
                dogrumu = false;
            } else
                dogrumu = true;


        }
    }

}
