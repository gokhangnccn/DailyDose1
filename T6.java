/*
* Pozitif tam sayının asal sayı olup olmadığını ekran yazan program
*/
package DailyDose;
import java.util.Scanner;
public class T6 {
    public static void main(String[] args) {
        int i,sayac=0;
        Scanner k=new Scanner(System.in);
        int sayi=k.nextInt();
        for(i=1; i<=sayi; i++) {
        if(sayi%i==0) sayac++; }
        if(sayac==2) System.out.println(sayi+" sayısı asal sayıdır.");
        else System.out.println(sayi+" sayısı asal değildir.");
    }
}