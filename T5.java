/*
* Bir pozitif tam sayının bölenlerini ekrana yazan program
*/
package DailyDose;
import java.util.Scanner;
public class T5 {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.print("Lütfen sayıyı giriniz: ");
        int sayi=k.nextInt();
        if (sayi<=0) System.out.println("Lütfen pozitif bir sayı giriniz.");
        for (int i=1; i<sayi; i++) {
            if (sayi%i==0) System.out.println(i);
    }
    }
}
