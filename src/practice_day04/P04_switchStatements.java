package practice_day04;

import java.util.Scanner;

public class P04_switchStatements {
    public static void main(String[] args) {

        System.out.println("Lutfen ay  bumarasini giriniz");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        switch (month) {
            case 1:
                System.out.println("Ocak");
                break;
            case 2:
                System.out.println("subat");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("nisan");
                break;
            case 5:
                System.out.println("mayis");
                break;
            case 6:
                System.out.println("haziran");
                break;
            case 7:
                System.out.println("temmuz");
                break;
            case 8:
                System.out.println("agustos");
                break;
            case 9:
                System.out.println("eylul");
                break;
            case 10:
                System.out.println("ekim");
                break;
            case 11:
                System.out.println("kasim");
                break;
            case 12:
                System.out.println("aralik");
                break;
            default:
                System.out.println(month + " olarak bir ay yok.Hatali giris");
        }

    }
}
