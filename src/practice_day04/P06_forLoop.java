package practice_day04;

import java.util.Scanner;

public class P06_forLoop {
    public static void main(String[] args) {

        Scanner  scanner=new Scanner(System.in);
        System.out.println("Lutfen sayi giriniz");
        int girilenSayi=scanner.nextInt();
        if (girilenSayi<=0){
            System.out.println("yanlis giris");
        }else {
            for (int i = 1; i <=girilenSayi ; i++) {
                if (i%4==0){
                    System.out.print(i+"-");
                }

            }

        }







    }
}
