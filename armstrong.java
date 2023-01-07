package week8;

import java.util.Scanner;

public class armstrong {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("LÜTFEN SAYIYI GİRİNİZ");
        int x = input.nextInt();
        int y;
        int t;
        int z ;
        int sayac = 1 ;
        while (x > 0) {
            /*if(x<10){
                 System.out.println(x);
                 break;
             }*/

            y = x % 10;
            //System.out.println(y);
            t = (int) Math.pow(y, 3);
            System.out.println("t:"+t);
            x = x / 10;
            System.out.println("x:"+x);
            sayac++;
            z=sayac;
            System.out.println("t üzeri sayac ="+(int)Math.pow(t,z));
            
        }

    }

}
