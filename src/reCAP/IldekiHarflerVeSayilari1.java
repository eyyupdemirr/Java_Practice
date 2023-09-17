package reCAP;

import java.util.ArrayList;

public class IldekiHarflerVeSayilari1 {
    public static void main(String[] args) {


        System.out.println("****************\n1 Milyon degerinde ki sorumuz geliyor\n****************");
        System.out.println(" Türkiye'deki 81 ilin adinda bu dört harften hangisi diger ücünden daha az bulunur?\n" +
                "    A) Ş\n" +
                "    B) V\n" +
                "    C) G\n" +
                "    D) H");
        //Once tüm sehirleri bir liste icerisine alalim...
        ArrayList<String> sehirler = new ArrayList<>();
        sehirler.add("Adana"); sehirler.add("Adıyaman"); sehirler.add("Afyonkarahisar"); sehirler.add("Ağrı");
        sehirler.add("Aksaray"); sehirler.add("Amasya"); sehirler.add("Ankara"); sehirler.add("Antalya");
        sehirler.add("Ardahan"); sehirler.add("Artvin"); sehirler.add("Aydın"); sehirler.add("Balıkesir");
        sehirler.add("Bartın"); sehirler.add("Batman"); sehirler.add("Bayburt"); sehirler.add("Bilecik");
        sehirler.add("Bingöl"); sehirler.add("Bitlis"); sehirler.add("Bolu"); sehirler.add("Burdur");
        sehirler.add("Bursa"); sehirler.add("Çanakkale"); sehirler.add("Çankırı"); sehirler.add("Çorum");
        sehirler.add("Denizli"); sehirler.add("Diyarbakır"); sehirler.add("Düzce"); sehirler.add("Edirne");
        sehirler.add("Elazığ"); sehirler.add("Erzincan"); sehirler.add("Erzurum"); sehirler.add("Eskişehir");
        sehirler.add("Gaziantep"); sehirler.add("Giresun"); sehirler.add("Gümüşhane"); sehirler.add("Hakkâri");
        sehirler.add("Hatay"); sehirler.add("Iğdır"); sehirler.add("Isparta"); sehirler.add("İstanbul");
        sehirler.add("İzmir"); sehirler.add("Kahramanmaraş"); sehirler.add("Karabük"); sehirler.add("Karaman");
        sehirler.add("Kars"); sehirler.add("Kastamonu"); sehirler.add("Kayseri"); sehirler.add("Kilis");
        sehirler.add("Kırıkkale"); sehirler.add("Kırklareli"); sehirler.add("Kırşehir"); sehirler.add("Kocaeli");
        sehirler.add("Konya"); sehirler.add("Kütahya"); sehirler.add("Malatya"); sehirler.add("Manisa");
        sehirler.add("Mardin"); sehirler.add("Mersin"); sehirler.add("Muğla"); sehirler.add("Muş");
        sehirler.add("Nevşehir"); sehirler.add("Niğde"); sehirler.add("Ordu"); sehirler.add("Osmaniye");
        sehirler.add("Rize"); sehirler.add("Sakarya"); sehirler.add("Samsun"); sehirler.add("Şanlıurfa");
        sehirler.add("Siirt"); sehirler.add("Sinop"); sehirler.add("Sivas"); sehirler.add("Şırnak");
        sehirler.add("Tekirdağ"); sehirler.add("Tokat"); sehirler.add("Trabzon"); sehirler.add("Tunceli");
        sehirler.add("Uşak"); sehirler.add("Van"); sehirler.add("Yalova"); sehirler.add("Yozgat");
        sehirler.add("Zonguldak");


        int a_toplam = 0; // Ş harfi icin
        int b_toplam = 0; // V harfi icin
        int c_toplam = 0; // G harfi icin
        int d_toplam = 0; // H harfi icin


        /*
        for (int i = 0; i < sehirler.size(); i++) {
            char[] karakterArr = sehirler.get(i).toUpperCase().toCharArray();
            for (int j = 0; j < karakterArr.length; j++) {
                if (karakterArr[j] == ('Ş'))
                    a_toplam++;
                if (karakterArr[j] == ('V'))
                    b_toplam++;
                if (karakterArr[j] == ('G'))
                    c_toplam++;
                if (karakterArr[j] == ('D'))
                    d_toplam++;
            }}

            */

        for (int i = 0; i < sehirler.size(); i++) {

            if (sehirler.get(i).contains("v")||sehirler.get(i).contains("V"))
            a_toplam++;
        }


        System.out.println("v harfi "+a_toplam);







}}
