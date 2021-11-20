package com.bilgeadam.sayisalloto;

public class WhileOrnek {
    //for döndügüsünden farkı, sayidan çok duruma bağlı olmasıdır.

    //While döngüsü ile 1'den 10'a kadar merhaba yadıralım.



    public static void main(String[] args) {
        int sayac=1;
        while (sayac<=10){
            System.out.println(sayac+" MErhaba");

            //Genelde bu unutulur
            //Program sonsuz döngüye giriyor.
            sayac+=1;
        }




    }
}
