/*
* Klavyeden girilen pozitif bir tam sayının basamaklarındaki sayıların toplamını veren program.
*/
package DailyDose;
import java.util.Scanner;
public class T2 {
    public static void main(String[] args) {
        int sayi,sayac=0,toplam=0;
        Scanner k=new Scanner(System.in);
        sayi=k.nextInt();
        while(sayi>0 ){
           toplam=(sayi%10)+toplam;
           sayi /= 10;
            ++sayac;}
        System.out.println("Basamakların toplamı: " + toplam);
    }
}
