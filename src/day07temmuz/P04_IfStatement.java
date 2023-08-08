package day07temmuz;

import java.util.Scanner;

public class P04_IfStatement {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen gun giriniz");
        String gunadi=scanner.next().toLowerCase();

        if (gunadi.equals("pazertesi")||gunadi.equals("sali")||gunadi.equals("carsamba")||gunadi.equals("persembe")||gunadi.equals("cuma")){
            System.out.println("Bu gunu "+gunadi+" olarak girdiniz");
            System.out.println("bu gun haftaici: yasasin okul var");}

        if (gunadi.equals("cumartesi")||gunadi.equals("pazar")){
            System.out.println("Bu gunu "+gunadi+" olarak girdiniz");

            System.out.println("bugun haftasonu: okul yok");}

        if (!(gunadi.equals("pazertesi")||gunadi.equals("sali")||gunadi.equals("carsamba")||gunadi.equals("persembe")||gunadi.equals("cuma")||gunadi.equals("cumartesi")||gunadi.equals("pazar")))
        System.out.println("yanlis gun girisi");





    }
}
