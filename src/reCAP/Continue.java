package reCAP;

public class Continue {  /*
1'den 10'a kadar (10 Dahil Sayıları sırayla yazdırın. Fakat 5 olmasın)
     */
    public static void main(String[] args) {
        for (int i = 1; i <11 ; i++) {

            if (i==5)
                System.out.print("wise ");//  1 2 3 4 wise 6 7 8 9 10


            if (i==5){
                continue;
            }
            System.out.print(i+" ");
        }

    }
}
