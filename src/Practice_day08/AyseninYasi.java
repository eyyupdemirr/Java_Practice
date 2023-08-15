package Practice_day08;
// Belirli bir tarih girip o günden bugüne geçen zamanı gün saat dakika saniye olarak yazdırın

import java.time.Duration;
import java.time.LocalDateTime;

public class AyseninYasi {
    public static void main(String[] args) {


        LocalDateTime startTime=LocalDateTime.of(2023,01,20,14,31);
        LocalDateTime currentTime=LocalDateTime.now();

        Duration duration=Duration.between(startTime,currentTime);


        long day=duration.toDays();
        long hour=duration.toHoursPart();
        long minute=duration.toMinutesPart();
        long second=duration.toSecondsPart();
        System.out.println(currentTime);

        System.out.println("Aysenin yasi: "+day+".gün "+hour+".saat "+minute+".dakika "+second+".saniyedir dunyada ");



        System.out.println("*******************************************************");

        LocalDateTime startTime1=LocalDateTime.of(2016,8,27,16,37);

        LocalDateTime currentTime1=LocalDateTime.now();
        Duration duration1=Duration.between(startTime1,currentTime);
      //  System.out.println(duration1);
        long day1=duration1.toDays();
        long hour1=duration1.toHoursPart();
        long minute1=duration1.toMinutesPart();
        long second1=duration1.toSecondsPart();
        System.out.println(currentTime);


        System.out.println("Aykutun yasi: "+day1+".gün "+hour1+".saat "+minute1+".dakika "+second1+".saniyedir dunyada ");



    }
}
