package practice_day04;

import java.util.Scanner;

public class P01_ifElseStatemnet {
    public static void main(String[] args) {


        Scanner scaner=new Scanner(System.in);
        System.out.print("lutfen kenar1 uzunlugunu giriniz  ");
      int a= scaner.nextInt();
        System.out.print("lutfen kenar2 uzunlugunu giriniz  ");
        int b= scaner.nextInt();
        System.out.print("lutfen kenar3 uzunlugunu giriniz  ");
        int c= scaner.nextInt();
        if ((a*a)+(b*b)==(c*c)){
            System.out.println("dik   ucen1");

        }
        else if ((a*a)==(b*b)+(c*c)){
            System.out.println("dik   ucgen2");

        }
        else if ((b*b)==(a*a)+(c*c)){
            System.out.println("dik   ucgen3");

        }else
            System.out.println(" dik ucgen degil" );

        System.out.println("=========================================================");

        if ((a*a)+(b*b)==(c*c)|| (a*a)+(c*c)==(b*b)||(b*b)+(c*c)==(a*a)){
            System.out.println(" dik ucgen4");

        }else
            System.out.println("dik ucgen degildir");







    }
}
