/*
* klavyeden girilen stringteki kelimeleri yazan program
*/
package DailyDose;
import java.util.Scanner;
public class T3 {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        String cumle = k.nextLine();
        String split[] = cumle.split(" ", 0);
        for (String s: split){
            System.out.println(s);}
    }
}