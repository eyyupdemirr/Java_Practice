package practice_day07;

import javax.swing.*;

public class Book {

    // Bir "Book" sınıfı oluşturun ve bu sınıfın bir constructor'ı olsun.
    // Bu constructor, kitap adını, yazarını ve yayın yılını alacak şekilde tasarlanmalıdır.
    // Örnek çıktı:
    // Book nesnesi oluşturuldu: "Java Programlama" - Ahmet Bulutluöz (2021)
    String title;
    String yazar;
    int yayinYili;

    public Book(String title, String yazar,int yayinYili){
        this.title=title;
        this.yazar=yazar;
       this.yayinYili=yayinYili;

    }

    public static void main(String[] args) {

        Book kitap=new Book("Java Programlama","Ahmet",2008);
        Book kitap2=new Book("ali dayi","Turgut",2018);
        System.out.println("Eklemnen kitap\n  Romanlar\n"+kitap.title+" "+kitap.yazar+" "+kitap2.yayinYili);


    }

}
