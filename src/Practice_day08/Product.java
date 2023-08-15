package Practice_day08;

// Bir "Product" sınıfı oluşturun ve bu sınıfın bir constructor'ı olsun.
// Bu constructor, ürün adını, fiyatını ve stok adedini alacak şekilde tasarlanmalıdır.
// Aynı zamanda, bu constructor içinden "display" adında bir metodu çağırarak ürün bilgilerini ekrana yazdırın.
// Örnek çıktı:
// Ürün Adı: Laptop, Fiyat: 4000.0 TL, Stok: 15 adet

public class Product {
    String urunadi;
    double fiyat;
    int stok;


    public Product(String urunadi,double fiyat, int stok){
        this.fiyat=fiyat;
        this.stok=stok;
        this.urunadi=urunadi;
        display();

    }

    public void display() {
        System.out.println("Ürün Adı: "+urunadi+" Fiyat: "+fiyat+" TL"+" Stok: "+stok);

    }

    public static void main(String[] args) {
        Product ornek=new Product("Dell",1240,73);
        Product ornek1=new Product("Acer",1250.,1253);
    }


}
