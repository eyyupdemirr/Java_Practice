package reCAP;


import java.util.ArrayList;
import java.util.List;

public class ArraysListe3 {

    /*
        Verilen bir array içinde tekrar eden elementleri bulup mükerrer olanı silip
        her bir elemandan sadece 1 tane içeren(unique) bir array
        oluşturup bize döndüren method oluşturunuz
        arr={3,1,2,4,1,2,3,4,5,10,2,7}
         */
    public static void main(String[] args) {        
    
       int[] arr={3,1,2,4,1,2,3,4,5,10,2,7,23,12,25,32,23,25,12,11,1,9,1,1,1,2,};
       //arrayOlustur(arr);
        System.out.println(arrayOlustur(arr));
       



}

    private static List<Integer> arrayOlustur(int[] arr) {
        ArrayList<Integer> tekrarsizList=new ArrayList<>();         //kaydedililecek array
        for (int i = 0; i <arr.length ; i++) {
            if (!(tekrarsizList.contains(arr[i]))){
            tekrarsizList.add(arr[i]);}                             //arr[i] demek lazimcunkuisadece 0,1,2,... gibi indexleri temsil ediyor
        }

        return tekrarsizList;
    }
}



//public static List<Integer> tekrarlariSil(int[] arr)  System.out.println("Tekrarsız array: "+tekrarlariSil(arr));