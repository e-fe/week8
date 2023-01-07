package week8;

import java.util.Scanner;

public class brothersformulu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("KAÇ TERİMLİ OLSUN");
        int n = input.nextInt();
        int t = 0;
        int f ;
        for (int i = 1; i < n; i++) {
            f=2*i+1;
            f=f*i;
            t=t+(2*i+2)/f;
            System.out.println(t);
            
        }

    }

}
