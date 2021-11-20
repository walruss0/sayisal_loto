///* package com.bilgeadam.sayisalloto;
//
//import java.util.Arrays;
//import java.util.Random;
//
//public class SayisalLoto {
//   public int sayiGetir( int maxSayi){
//        Random rnd = new Random();
//        return rnd.nextInt(maxSayi+1);
//    }
//
//    public int sayiGetir(int maxSayi){
//        Random rnd = new Random();
//        return rnd.nextInt(maxSayi)+1;
//    }
//
//    public static void main(String[] args) {
//         SayisalLoto loto = new SayisalLoto();
//          int sayilar[] = new int[6];
//          int temp_sayi=0;
//         for (int i=0;i<6;i++){
//
//             while (sonuc==0){
//                 temp_sayi = sayilar[i] = loto.sayiGetir(49);
//
//                 //arrayi sıralayalım
//                 Arrays.sort(sayilar);
//                 //binarrySearch kullanmanın şartı, arrayın sıralı olmasıdır.
//                 int sonuc = Arrays.binarySearch(sayilar,temp_sayi);
//             }
//         }
//        for (int i=0;i<6;i++){
//            System.out.println(sayilar[i]);
//        }
//
//
//
//
//
//          for (int i=1;i<=10;i++) {
//            System.out.println(loto.sayiGetir(49));
//        }
//
//
//    }
//}
//*/