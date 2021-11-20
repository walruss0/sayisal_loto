package com.bilgeadam.sayisalloto;

import java.util.Random;

public class SayisalLoto {
   /* public int sayiGetir( int maxSayi){
        Random rnd = new Random();
        return rnd.nextInt(maxSayi+1);
    }*/

    public int sayiGetir(int maxSayi){
        Random rnd = new Random();
        return rnd.nextInt(maxSayi)+1;
    }

    public static void main(String[] args) {
         SayisalLoto loto = new SayisalLoto();
         int sayilar[] = new int[6];
         for (int i=0;i<6;i++){
             sayilar[i] = loto.sayiGetir(49);
         }
        for (int i=0;i<6;i++){
            System.out.println(sayilar[i]);
        }





        /*  for (int i=1;i<=10;i++) {
            System.out.println(loto.sayiGetir(49));
        }*/


    }
}
