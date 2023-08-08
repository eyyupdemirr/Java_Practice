package practice_day07;

import java.util.ArrayList;

public class ArrayList01 {

    // Bir ArrayList oluşturun ve içine 5 adet isim ekleyin.
// Daha sonra bu isimleri sondan başlayarak ekrana yazdırın.
// Örnek çıktı:
// Son isim: Ahmet
// Son ikinci isim: Mehmet
// ...
    public static void main(String[] args) {
        ArrayList<String> isimler=new ArrayList<>();

        isimler.add("ali");
        isimler.add("dayi");
        isimler.add("birgecede");
        isimler.add("yedin");
        isimler.add("tarlayi");

        for (int i =isimler.size()-1; i >=0 ; i--) {

            System.out.println("sondan "+( isimler.size()-i)+" isim "+isimler.get(i));

        }









    }


}
