/*
* İki stringten büyük olanı ekrana yazan program.(ASCII)
*/
package DailyDose;
import java.util.Scanner;
public class T4 {
    public static void main(String[] args) {
        int u,u2,top=0,top2=0;
        Scanner k=new Scanner(System.in);
        
        System.out.println("1. Kelimeyi giriniz: ");
        String a=k.next();
        u=a.length();
        for(int i=0;i<u ;i++){
        char kelime = a.charAt(i);
        int ascii = (int)kelime;
        top+=ascii;}
        
        System.out.println("2. Kelimeyi giriniz: ");
        String b=k.next();
        u2=b.length();
        for(int j=0;j<u2 ;j++) {
        char kelime2=a.charAt(j);
        int ascii2 = (int)kelime2;
        top2+=ascii2;}
        System.out.println(top);
        System.out.println(top2);
    }

}
