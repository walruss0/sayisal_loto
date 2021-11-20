package com.bilgeadam.sayisalloto;

import java.time.temporal.Temporal;

public class ArrayOrnek {


    public static void main(String[] args) {
        //arraylerin tipi olmak zorunda
        int sayilar1[]= new int[6];
        String deneme[] = new String[3];
        //6'lı oluşturduysak, array indexleri 0 ile 5 arasındadır.

        sayilar1[0]= 11;
        sayilar1[1]= 15;
        sayilar1[2]= 1;
        sayilar1[3]= -33;
        sayilar1[4]= 500;
        sayilar1[5]= 0;
        deneme[0] = "dasda";
        deneme[1] = "A" ;
        deneme[2] = "das";
        int sayi1 = 1;


        //arraylari yazdıralım.
        for (int i=0;i<6;i++){
            System.out.println(sayilar1[i]);
           if (i<3) {
                System.out.println(deneme[i]);
            }
        }


    }
}
