package week8;
import java.util.Scanner;
public class kok2denklemi {
     public static void main(String[] args){
     Scanner input = new Scanner(System.in);
         System.out.println("bölüm sayısı");
         int n = input.nextInt();
         int t = 1;
         for (int i = 1; i <n; i++) {
             t=2+1/t;
             //System.out.println(1+1/t);
         }
         for (int i = 1; i < 10; i++) {
             int j = 1;
             j = j +i;
             System.out.println(j);
             
         }

    }

}
