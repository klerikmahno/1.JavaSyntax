package com.javarush.task.task04.task0427;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Описываем числа
*/

public class Solution {

    public static String che (int a) {
        String A;
        if (a % 2 == 0) A = "четное ";
        else A = "нечетное ";
        return A;
    }
    public static String zn(int a){
        int count = 1;

        while(a/10>0){
            count++;
            a = a/10;
        }
        String AA;
        if(count == 1) AA = "однозначное ";
        else if  (count == 2)AA = "двузначное ";
        else if (count == 3)AA = "трехзначное ";
        else AA="Странный";
        return AA;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader cs = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(cs.readLine());
        if(x>0&&x<1000){
            String A = che(x);
            String B = zn(x);
            System.out.println(A+B+"число");//напишите тут ваш код
        }

    }
}
