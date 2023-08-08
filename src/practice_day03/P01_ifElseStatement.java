package practice_day03;

import java.util.Scanner;

public class P01_ifElseStatement {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen Km olarak giriniz");
        double girilenkm= scanner.nextDouble();

        System.out.print("Lutfen donusturulecek birimi seciniz");

        char birim=scanner.next().charAt(0);

        if (birim=='m'||birim=='M'){
            System.out.println("Girdiginiz birim olarak: "+girilenkm*1000+" "+birim+" eder");
        } else if (birim=='C'||birim=='c'||birim=='s'||birim=='S') {
            System.out.println("Girdiginiz birim olarak: "+girilenkm*100000+" "+birim+" eder");

        }else System.out.println("Hatali birim girdiniz");

    }
}
