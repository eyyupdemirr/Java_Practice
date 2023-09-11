package practice_day07;

import java.util.ArrayList;

public class forEachLoop01 {

    /*
    // Bir ArrayList oluşturun ve içine 4 adet meyve ekleyin.
    // Daha sonra bu meyveleri büyük harflerle ekrana yazdırın. (forEachLoop kullanın)
    // Örnek çıktı:
    // Meyveler: ELMA ARMUT ÇİLEK
     */
    public static void main(String[] args) {
        ArrayList<String > meyveler=new ArrayList<>();
        meyveler.add("elma");
        meyveler.add("armut");
        meyveler.add("purtuKal");
        meyveler.add("mUZ");
        System.out.println(meyveler);

        for (int i = 0; i <meyveler.size() ; i++) {
            System.out.print(meyveler.get(i).toUpperCase()+" , ");

        }







      // for (  String istenen  :meyveler
      //      ) {
      //     ArrayList<String > meyveler1=new ArrayList<>();
      //     System.out.print(istenen.toUpperCase()+" ");
      // }






    }



}
