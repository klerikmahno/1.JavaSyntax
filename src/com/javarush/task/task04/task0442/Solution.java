package com.javarush.task.task04.task0442;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader cs = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while(true){
            int a = Integer.parseInt(cs.readLine());
            sum +=a;
            if(a == -1) {
                System.out.println(sum);
                break;
            }
        }
        //напишите тут ваш код

    }
}
