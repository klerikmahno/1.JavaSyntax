package com.javarush.task.task04.task0441;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Как-то средненько
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
        System.out.print(array[1]);
        //напишите тут ваш код

    }
}
