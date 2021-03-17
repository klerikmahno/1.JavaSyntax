package com.javarush.task.task04.task0429;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительные и отрицательные числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader cs = new BufferedReader((new InputStreamReader(System.in)));
        int[] arr = new int[3];
        for(int i =0 ;i<3;i++){
            arr[i] = Integer.parseInt(cs.readLine());//напишите тут ваш код
        }
        int count1 = 0;
        int count2 = 0;
        for(int i= 0; i<3;i++){
            if(arr[i]>0) count1++;
            else if (arr[i]<0) count2++;
        }
        System.out.println("количество отрицательных чисел: "+count2+", количество положительных чисел: "+count1);
    }
}
