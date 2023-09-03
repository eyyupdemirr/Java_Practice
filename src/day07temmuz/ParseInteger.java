package day07temmuz;

public class ParseInteger {
    public static void main(String[] args) {

        String str ="126";
        int sayi;
        byte sayi1=Byte.parseByte(str);


        sayi=Integer.parseInt(str);
        System.out.println("donusen sayi "+(sayi)+"  "+(2*sayi));

        System.out.println(sayi1+" "+sayi1*9);








    }
}
