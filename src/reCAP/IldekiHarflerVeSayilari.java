package reCAP;

import java.util.Arrays;

public class IldekiHarflerVeSayilari {
    public static void main(String[] args) {

       int sayac=0;
       int sayac1=0;
       int sayac2=0;
       int sayac3=0;


        String[] ilarr1= { "adana", "adiyaman", "afyonkarahisar", "agri", "aksaray",
                "amasya", "ankara", "antalya", "ardahan", "artvin", "aydin", "balikesir",
                "bartin", "batman", "bayburt", "bilecik", "bingol", "bitlis", "bolu", "burdur",
                "bursa", "canakkale", "cankiri", "corum", "denizli", "diyarbakir", "duzce",
                "edirne", "elazig", "erzincan", "erzurum", "eskisehir", "gaziantep", "giresun",
                "gumushane", "hakkari", "hatay", "igdir", "isparta", "istanbul", "izmir",
                "kahramanmaras", "karabuk", "karaman", "kars", "kastamonu", "kayseri", "kilis",
                "kirikkale", "kirklareli", "kirsehir", "kocaeli", "konya", "kutahya", "malatya",
                "manisa", "mardin", "mersin", "mugla", "mus", "nevsehir", "nigde", "ordu",
                "osmaniye", "rize", "sakarya", "samsun", "sanliurfa", "siirt",
                "sinop", "sivas", "sirnak", "tekirdag", "tokat", "trabzon",
                "tunceli", "usak", "van", "yalova", "yozgat", "zonguldak"};


        System.out.println(Arrays.toString(ilarr1));


        for (int i = 0; i < ilarr1.length ; i++) {

            if (ilarr1[i].contains("a"))
                sayac++;

            if (ilarr1[i].contains("g"))
                sayac1++;

            if (ilarr1[i].contains("s"))
                sayac2++;

            if (ilarr1[i].contains("h"))
                sayac3++;
        }


        System.out.println(sayac) ;
        System.out.println(sayac1);
        System.out.println(sayac2);
        System.out.println(sayac3);




    }
}
