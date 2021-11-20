package com.bilgeadam.sayisalloto;

public class CokluSartOrnek {
    public static void main(String[] args) {
        int sayi1= 23;
        int sayi2= 35;

        int sayi3= 22;

        //veya(or) operatörü = ||
        //ve(end) operatörü = &&
        if (sayi3==sayi1 || sayi3==sayi2){
            System.out.println("Tekrarlanan sayi var!");
        }
        else{
            System.out.println("Tekrarlanan sayi yok!");
        }

    }
}
