package practice_day04;

import java.util.Scanner;

public class P03_ifElseStatement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen kenarlari giriniz");
        System.out.print("kenar1 :");
        double kenar1 = scanner.nextDouble();
        System.out.print("kenar2 :");
        double kenar2 = scanner.nextDouble();
        System.out.print("kenar3 :");
        double kenar3 = scanner.nextDouble();

        if (kenar1 > 0 && kenar2 > 0 && kenar3 > 0) {
            if (kenar1 == kenar2 || kenar1 == kenar3 || kenar2 == kenar3) {
                System.out.println("Ikiz kenar ucgen");
            } else
                System.out.println(" ikiz kenar degil");

        } else
            System.out.println("Yanlis veri girisi");


    }
}
