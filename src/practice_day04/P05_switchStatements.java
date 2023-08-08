package practice_day04;

import java.util.Scanner;

public class P05_switchStatements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen gun ismi giriniz");
        String gun = scanner.next().toLowerCase();

        switch (gun) {
            case "pazartesi":
                System.out.println("haftanin 1. gunu");
                break;
            case "sali":
                System.out.println("haftanin 2. gunu");
                break;
            case "carsamba":
                System.out.println("haftanin 3. gunu");
                break;
            case "persembe":
                System.out.println("haftanin 4. gunu");
                break;
            case "cuma":
                System.out.println("haftanin 5. gunu");
                break;
            case "cumartesi":
                System.out.println("haftanin 6. gunu");
                break;
            case "pazar":
                System.out.println("haftanin 7. gunu");
                break;
            default:
                System.out.println(gun+"  hatali giris");
        }



    }
}
