package com.javarush.task.task04.task0428;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader cs = new BufferedReader((new InputStreamReader(System.in)));
        int[] arr = new int[3];
        for(int i =0 ;i<3;i++){
            arr[i] = Integer.parseInt(cs.readLine());//напишите тут ваш код
        }
        int count1 = 0;
        for(int i= 0; i<3;i++){
            if(arr[i]>0) count1++;
        }

        System.out.println(count1);
        //напишите тут ваш код

    }
}
