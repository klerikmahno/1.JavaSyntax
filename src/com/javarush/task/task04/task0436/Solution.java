package com.javarush.task.task04.task0436;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Рисуем прямоугольник
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader cs = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(cs.readLine());
        int b = Integer.parseInt(cs.readLine());
        for(int i = 0;i < a;i++){
            for(int ii =0;ii<b;ii++){
                System.out.print(8);//напишите тут ваш код
            }
            System.out.println();
        }

    }
}
