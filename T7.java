/*
* 50 tane öğrenicin vize ve finaline göre geçip kaldığını belirleyen program
*/
package DailyDose;
import java.util.Scanner;
public class T7 {
    public static void main(String[] args) {
        int not1,not2;
        double ort;
        Scanner k=new Scanner(System.in);
        for (int i=1; i<=50; i++) {
            System.out.println("### ÖĞRENCİ " + i + " ###");
            System.out.print("Vize notunu giriniz: ");
            not1=k.nextInt();
            System.out.print("Final notunu giriniz: ");
            not2=k.nextInt();
            ort=not1*0.4+not2*0.6;
            if (ort>=50) System.out.println("Dersten geçtiniz h.o.");
            else System.out.println("G.o. kaldın.");
            System.out.println(" ");
        }
        
        
    }

}
