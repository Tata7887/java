package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args){

        int i = new Random().nextInt(200);
        System.out.println(i);

        int n = Integer.toBinaryString(i).length()-1;
        System.out.println(n);
        int cnt1 = 0;
        for(int f = i; f <= Short.MAX_VALUE; f++) {
            if ( f % n == 0){
                cnt1++;
            }
        }
            int [] m1 = new int[cnt1];
            cnt1 = 0;

        for(int f = i; f <= Short.MAX_VALUE; f++) {
            if (f % n == 0) {
                m1[cnt1++] = f;
            }
        }



        int cnt2 = 0;


            for (int j = Short.MIN_VALUE; j <= i; j++) {
                if (j % n != 0){
                    cnt2++;
                }
        }
            int [] m2 = new int[cnt2];

            cnt2 =0;

        for (int j = Short.MIN_VALUE; j <= i; j++) {
            if (j % n != 0) {
                m2[cnt2++] = j;
            }
        }


    }
}