/*
* Klavyeden girilen stringteki küçük "a" ve büyük "A" ların sayısını veren program
*/
package DailyDose;
import java.util.Scanner;
public class T8 {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        String cumle=k.nextLine();
        char harf='a', harf2='A';
        int sayaca=0, sayacA=0;
        for(int i = 0; i < cumle.length(); i++){
            if(cumle.charAt(i)==harf) sayaca++;
            else if (cumle.charAt(i)==harf2) sayacA++;
        }
        System.out.println("Girilen cümlede " + sayaca + " tane '" + harf + "' vardır");
        System.out.println("Girilen cümlede " + sayacA + " tane '" + harf2 + "' vardır");
    }
}
