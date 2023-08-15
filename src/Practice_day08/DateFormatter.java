package Practice_day08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// Soru: Java'da tarih ve saat bilgisini belirli bir formatta nasıl biçimlendirirsiniz?
// Verilen bir örnekle tarih ve saati farklı biçimlerde nasıl gösterebileceğinizi açıklayınız.
public class DateFormatter {
    public static void main(String[] args) {

        LocalDateTime currentTime=LocalDateTime.now();
        System.out.println("standart gorunum  :"+currentTime);
        DateTimeFormatter istenen=DateTimeFormatter.ofPattern("dd/MM/yyyy HH.mm.ss");
        String sonHali=currentTime.format(istenen);
        System.out.println("istenen gorunum  :"+sonHali);








    }

}
