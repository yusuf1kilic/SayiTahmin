package com.company;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random rand=new Random();
        int number=rand.nextInt(100);

        Scanner input=new Scanner(System.in);
        int right=0;
        int selected;
        int[] wrong=new int[5];
        boolean isWin=false;
        boolean isWorng=false;

        while (right<5){
            System.out.print("Lütfen tahmininizi giriniz : ");
            selected= input.nextInt();
            if (selected<0 || selected>99){
                System.out.println("lütfen 0-100 arasında bir değer giriniz");
                if (!isWorng){
                    isWorng=true;
                    System.out.println("bir daha yanlış hata hakınızdan düşürecektir");
                }else{
                    right++;
                    System.out.println("çok fazla hata yaptınız. kalan hakkınız :"+ (5-right));
                }
                continue;
            }

            if (selected==number){
                System.out.println("Tebrikler doğru tahmin : " + number);
                isWin=true;
                break;
            }else{


                System.out.println("Hatalı bir sayı girdiniz");
                if (selected>number){
                    System.out.println(selected +" sayısı, gizli sayıdan büyüktür");
                }else {
                    System.out.println(selected+" sayısı, gizli sayıdan küçüktür");
                }

                System.out.println("Kalan hakkı : "+(5-right));
            }
            wrong[right++]=selected;



        }
        if (!isWin){
            System.out.println("Kaybettiniz");
            System.out.println("Tahminleriniz : "+ Arrays.toString(wrong));
        }


    }
}
