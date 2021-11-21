package com.bilgeadam.sayisalloto;

import java.util.Arrays;
import java.util.Random;

public class SayisalLoto_v2_Array {
    //static değişkene obje oluşturmadan class_adı.değişken diye ulaşabiliyoruz.
    private static final int MAX_SAYİ = 90;
    private static final int KAC_SAYİ = 6;
    Random rnd = new Random();
    public int sayiGetir()
    {
        return rnd.nextInt(MAX_SAYİ)+1;
    }

    public boolean arraydeVarmi(int[] sayilar, int sayi)
    {
        //binarySearch ile arayacağız.
        //binerSearch kullanım sartı, arrayin sırali olması

        //gelen Array'i sıralıyoruz.
        Arrays.sort(sayilar);
        int sonuc = Arrays.binarySearch(sayilar,sayi);
        if (sonuc>=0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void  testArraydevarmi()
    {
        int sayilar[]= {13,45,67, -4, 41, 70};
        int sayi = 67;
        boolean sonuc = arraydeVarmi(sayilar,sayi);
        if (sonuc==true) System.out.println("Arrey'de var!");
        else System.out.println("Array'de yok!");

    }
    public static void main(String[] args) {
        SayisalLoto_v2_Array loto = new SayisalLoto_v2_Array();
        //Yeni Çılgın SAyısal Loto'ya uygun.
        //90 sayıdan 6 tane seçilecek.

        //SAyiları tutacağımız bir array tanımlıyoruz.
        int sayilar[] = new int[KAC_SAYİ];

        //Döngüyle array'e rastgele sayilar atalım.
        for(int i=0;i<= sayilar.length;i++)
        {
            int rastgelesayi =  loto.sayiGetir();
            //rastgele sayi arrayde varsa döngüyle tekrar sayi alıcanak.
            //arrayde olmayan sayi bulana kadar döngüden çıkamaz.
            boolean sonuc = loto.arraydeVarmi(sayilar, rastgelesayi);
            while (sonuc == true)
            {
                rastgelesayi = loto.sayiGetir();
                sonuc = loto.arraydeVarmi(sayilar,rastgelesayi);
            }
            //hep arrayin ilk elemanına yazalım rasgele sayiyi
            //çünkü sıralanınca sayi sonlara gidiyor.
            sayilar[0] = rastgelesayi;

            //6. sayiyi sıfır indekse yazınca, tekrar sıralanması için bunu ekledik.
            Arrays.sort(sayilar);
        }

    for (int i = 0;i < sayilar.length;i++)
    {
        if (i != (sayilar.length-1))
        {
            System.out.print(sayilar[i] + "-");
        }
        else
        {
            System.out.print(sayilar[i]);
        }
    }
        //loto.testArraydevarmi();

    }
}
