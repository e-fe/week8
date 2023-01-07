package week8;
import java.util.Scanner;
public class altınoranucgen {
     public static void main(String[] args){
     Scanner input = new Scanner(System.in);
         System.out.println("ÜÇGENİN kısa KENARINI GİRİNİZ");
         int n=input.nextInt();
         double ao = 1.618 ;
         double b = n*ao;
         System.out.println("uzun kenarlar : "+b);
         System.out.println("kısa kenar : "+n);
         
         

    }

}
