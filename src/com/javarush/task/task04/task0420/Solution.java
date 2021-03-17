package com.javarush.task.task04.task0420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Сортировка трех чисел
*/

public class Solution {



    public static void main(String[] args) throws Exception {
        BufferedReader cs = new BufferedReader(new InputStreamReader(System.in));
        int array[] = new int[3];
        for(int i=0;i<array.length;i++) {
            array[i] = Integer.parseInt(cs.readLine());
        }

        for(int i = 0;i<array.length-1;i++){
            for(int ii = 0;ii<array.length-1;ii++){
                if(array[ii]>array[ii+1]){
                    int a = array[ii];
                    array[ii] = array[ii+1];
                    array[ii+1] = a;
                }
            }
        }

        for (int i = array.length-1;i>=0;i--){
            System.out.print(array[i]+" ");
        }

    }
}
