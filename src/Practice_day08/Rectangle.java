package Practice_day08;

// Bir "Rectangle" sınıfı oluşturun ve bu sınıfın iki constructor'ı olsun.
// İlk constructor, uzun ve genişlik değerlerini alacak şekilde tasarlanmalıdır.
// İkinci constructor ise sadece bir boyut değeri alacak şekilde tasarlanmalıdır (kare).

// Aynı zamanda, bu constructorlarin içinden "display" adında bir metodu çağırarak boyutları ekrana yazdırın.

// Örnek çıktı:
// Uzunluk: 8, Genişlik: 6
// Kenar uzunluğu: 5 (Kare)


public class Rectangle {

    int uzunluk;
    int yukseklik;

    public Rectangle(int uzunluk, int yukseklik) {
        this.uzunluk = uzunluk;
        this.yukseklik = yukseklik;
        display();
    }

    public Rectangle(int uzunluk) {
        this.uzunluk = uzunluk;
        this.yukseklik = uzunluk;
        display();
    }

    public void display() {
        if (uzunluk == yukseklik) {
            System.out.println("kenar uzunlugu: " + yukseklik+" ( kare)");
        } else System.out.println("uzunluk: " + uzunluk + " yukseklik :" + yukseklik);
    }

    public static void main(String[] args) {
        Rectangle ornek=new Rectangle(33,25);
        Rectangle orn=new Rectangle(100);
        Rectangle orb=new Rectangle(44,44);
    }

}
