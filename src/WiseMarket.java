import java.time.LocalDateTime;
import java.util.Scanner;

public class WiseMarket {


    /*
 Bir market yazılımı yazdığınızı düşünerek aşşağıdaki menü ile giriş yapıp, ilgili bölüme yönlendiren
 alışveriş yaptıran ve sepet tutarını hesaplayarak hafızada tutan, kasaya gidince fiş yazdıran bir program
 hazırlayın
  ==================== WISE MARKET KASA PROGRAMI ===================================
ilk programa girildiginde bizi bir menu karsilasin bu secenekler
  1 ŞARKÜTERİ ÜRÜNLERİ
  2 MANAV ÜRÜNLERİ
  3 MARKET ÜRÜNLERİ
  secime gore ,
  4-urunleri listele ve
  5-fiyatlari gelsin

  Variable'ları belirleyelim
  urunAdi, urunFiyatı, urunMiktari, urunKodu, sepet, toplam

*/
    static Scanner scan = new Scanner(System.in);
    static String urunAdi;
    static double urunFiati;
    static double urunMiktari;
    static int urunKodu;
    static String sepet = "";
    static double toplam;
    static boolean ekUrun = false;
    static double odeme;
    static String odemeIstegi;


    public static void main(String[] args) {

        girisEkrani();
        {
        }


    }

    public static void girisEkrani() {
        System.out.println("===================== T120 - WISE MARKET==============");
        System.out.println("=====================  HOSGELDINIZ   ==============");
        System.out.println("===================== MENU  ==============");
        System.out.println("Lutfen alisveris yapmak istediginiz reyonu seciniz");
        System.out.println("1 -SARKÜTERİ ÜRÜNLERİ\n2 -MANAV ÜRÜNLERİ\n3 -MARKET ÜRÜNLERİ\n4 -FIS YAZDIRMA\n5 -CIKIS");

        int secim = scan.nextInt();

        if (secim < 1 || secim > 5) {
            System.out.println("Uyari: Gecersiz bir tusa bastiniz.Yeniden deneyin");
            girisEkrani();
        } else {
            switch (secim) {
                case 1:
                    sarkuteri();
                    break;
                case 2:
                    manav();
                    break;
                case 3:
                    market();
                    break;
                case 4:
                    fisYazdir();
                    break;
                case 5:
                    cikis();
                    break;
                default:
            }

        }


    }

    public static void sarkuteri() {
        System.out.println("Sarkuteri Reyonuna Hosgeldiniz");
        System.out.println("Lutfen almak istediginiz urun numarasini giriniz." +
                "\n61-Kasar peyniri 130 $\n62-Zeytin 120$\n63-Sucuk 200 $\n64-Kiyma 350$"
        );
        while (!ekUrun) {
            urunKodu = scan.nextInt();
            if (urunKodu >= 31 && urunKodu <= 64) {
                System.out.println("Kac kilo alacaksiniz?");
                urunMiktari = scan.nextInt();
                switch (urunKodu) {
                    case 61:
                        urunAdi = "Kasar Peyniri";
                        urunFiati = 130;
                        System.out.println(urunMiktari + " kg " + urunAdi + ": " + (urunFiati * urunMiktari) + " $ ");
                        break;
                    case 62:
                        urunAdi = "Zeytin";
                        urunFiati = 120;
                        System.out.println(urunMiktari + " kg " + urunAdi + ": " + (urunFiati * urunMiktari) + " $ ");
                        break;
                    case 63:
                        urunAdi = "Sucuk";
                        urunFiati = 200;
                        System.out.println(urunMiktari + " kg " + urunAdi + ": " + (urunFiati * urunMiktari) + " $ ");
                        break;
                    case 64:
                        urunAdi = "kiyma";
                        urunFiati = 350;
                        System.out.println(urunMiktari + " kg " + urunAdi + ": " + (urunFiati * urunMiktari) + " $ ");
                        break;
                }
                urunFiati = urunFiati * urunMiktari;
                toplam = toplam + urunFiati;  //toplam+=urunFiati;
                System.out.println("Olusan Sepet Tutari: " + toplam);
                sepet += urunAdi + ": " + urunFiati + " $\n";
                System.out.println("Baska bir urun eklemek isterseniz urun kodunu giriniz\nAna menuye donmek icin 0 tusuna basiniz");

            } else if (urunKodu == 0) {
                girisEkrani();

            }
        }

    }

    public static void manav() {
        System.out.println("Manav Reyonuna Hosgeldiniz");
        System.out.println("Lutfen almak istediginiz urun numarasini giriniz:\n 71-Muz  - 60$\n72-Patates   - 25$\n73-Elma  - 49$\n74-Sogan  - 20$\n75-Domates  - 39$\n76-Ananas  - 59$");
        while (!ekUrun) {
            urunKodu = scan.nextInt();
            if (urunKodu >= 71 && urunKodu <= 76) {
                System.out.println("Kac kilo alacaksiniz?");
                urunMiktari = scan.nextInt();
                switch (urunKodu) {
                    case 71:
                        urunAdi = "Muz";
                        urunFiati = 60;
                        System.out.println(urunMiktari + " kg " + urunAdi + ": " + (urunFiati * urunMiktari) + " $ ");
                        break;
                    case 72:
                        urunAdi = "Patetes";
                        urunFiati = 25;
                        System.out.println(urunMiktari + " kg " + urunAdi + ": " + (urunFiati * urunMiktari) + " $ ");
                        break;
                    case 73:
                        urunAdi = "Elma";
                        urunFiati = 49;
                        System.out.println(urunMiktari + " kg " + urunAdi + ": " + (urunFiati * urunMiktari) + " $ ");
                        break;
                    case 74:
                        urunAdi = "Sogan";
                        urunFiati = 20;
                        System.out.println(urunMiktari + " kg " + urunAdi + ": " + (urunFiati * urunMiktari) + " $ ");
                        break;
                    case 75:
                        urunAdi = "Domates";
                        urunFiati = 39;
                        System.out.println(urunMiktari + " kg " + urunAdi + ": " + (urunFiati * urunMiktari) + " $ ");
                        break;
                    case 76:
                        urunAdi = "Ananas";
                        urunFiati = 59;
                        System.out.println(urunMiktari + " kg " + urunAdi + ": " + (urunFiati * urunMiktari) + " $ ");
                        break;
                }
                urunFiati = urunFiati * urunMiktari;
                toplam += urunFiati;
                System.out.println("Olusan Sepet Tutari :" + toplam);
                sepet += urunAdi + " : " + urunFiati + " $\n";
                System.out.println("Baska urun almak isterseniz kodunu giriniz.\nAna menuye donmek icin 0 tusuna basiniz ");

            } else if (urunKodu == 0) {
                girisEkrani();

            }

        }

    }

    public static void market() {
        System.out.println("Market Reyonuna Hosgeldiniz");
        System.out.println("Lutfen satin almak istediginiz urun numarasini giriniz :" +
                "\n81 - Nutella - 103$\n82 - Ekmek -8$\n83 - Yumurta - 76$\n84 - Yogurt - 45$");
        while (!ekUrun) {
            urunKodu = scan.nextInt();
            if (urunKodu >= 81 && urunKodu <= 84) {
                System.out.println("Kac kg/paket alacaksiniz?");
                urunMiktari = scan.nextInt();
                switch (urunKodu) {
                    case 81:
                        urunAdi = "Nutella";
                        urunFiati = 103;
                        System.out.println(urunMiktari + " kg " + urunAdi + ": " + (urunFiati * urunMiktari) + " $ ");
                        break;
                    case 82:
                        urunAdi = "Ekmek";
                        urunFiati = 8;
                        System.out.println(urunMiktari + " kg " + urunAdi + ": " + (urunFiati * urunMiktari) + " $ ");
                        break;
                    case 83:
                        urunAdi = "Yumurta";
                        urunFiati = 76;
                        System.out.println(urunMiktari + " kg " + urunAdi + ": " + (urunFiati * urunMiktari) + " $ ");
                        break;
                    case 84:
                        urunAdi = "Yogurt";
                        urunFiati = 45;
                        System.out.println(urunMiktari + " kg " + urunAdi + ": " + (urunFiati * urunMiktari) + " $ ");
                        break;

                }
                urunFiati = urunFiati * urunMiktari;
                toplam += urunFiati;
                System.out.println("Olusan sepet tutari : " + toplam);
                sepet += urunAdi + " : " + urunFiati + " $\n";
                System.out.println("Baska urun almak isterseniz kodunu giriniz.\nAna menuye donmek icin 0 tusuna basiniz ");
            } else if (urunKodu == 0) {
                girisEkrani();
            }
        }

    }

    public static void fisYazdir() {
        System.out.println("===================== T120 - WISE MARKET==============");
        System.out.println("=====================  Bizi Tercih Ettiginiz Icin Tesekkur Ederiz   ==============");
        System.out.println("===================== Alisveris Bilgileri  ==============");
        System.out.println("\n\n\n");
        System.out.println("Alisveris Listeniz\n" + sepet);
        System.out.println("\n\n");
        System.out.println("Toplam tutar. " + toplam);
        System.out.println("\n\n");

        System.out.println("Odeme yapmak istiyorsaniz"+" Evet= `E` "+" yaziniz");
        odemeIstegi=scan.next();
       // if (odemeIstegi.equalsIgnore.startsWith("e"));

        odeme=scan.nextDouble();

        System.out.println("===================== Iyi Gunler Dileriz.  ==============");
        LocalDateTime saat = LocalDateTime.now();
        System.out.println(saat);
        System.out.println("Ana menuye donmek icin 0 tusuna basiniz.\nCikis yapmak icin 5 tusuna basiniz.");
        if (urunKodu == 0) {

        } else if (urunKodu == 5) {
            cikis();
        }
    }

    public static void cikis() {
        // scan.close();
        System.exit(0);

    }


}
