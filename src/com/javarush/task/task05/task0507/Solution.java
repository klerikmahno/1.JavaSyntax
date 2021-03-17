package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader cs = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0;
        double count = 0;
        double x = 0;
        while (true){
            int a = Integer.parseInt(cs.readLine());
            if(a == -1 && count!=0) {
                x = sum / count;
                System.out.println(x);
                break;
            }else if(a == -1 && count==0){
                System.out.println(0);
                break;
            }else{
                sum += a;
                count++;
            }

        }

    }
}

