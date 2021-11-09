/*
* 3 basamaklı sayılar içerisinde 2 ve 3 ile bölünebilen sayıları ekrana yazan program. do while döngüsü ile .
*/
package DailyDose;
public class T1 {
    public static void main(String[] args) {
        int sayi=100;
        while (sayi<1000) {
         if(sayi%2==0 && sayi%3==0) System.out.println(sayi);
         sayi++;  
        }       
    }
}
