package week8;

import java.util.Scanner;

public class ornek69 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("acıyı girin");
        double aci = input.nextDouble();
        System.out.println("eleman sayısı girin");
        int eleman = input.nextInt();
        double T = 1;
        int isaret = 1;
        for (int i = 1; i < eleman-1; i++) {
            double F = 1;
            for (int j = 0; j < 2*i; j++) {
                F=F*j;
                
                
            }
            T += (double)Math.pow(aci,2*i) * (int)Math.pow(-1,i)/F ;
        }
        System.out.println(T);
    }

}
