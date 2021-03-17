package com.javarush.task.task04.task0418;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Минимум двух чисел Ӏ Java Syntax: 4 уровень, 6 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader cs = new BufferedReader(new InputStreamReader(System.in));
        String a = cs.readLine();
        int aa = Integer.parseInt(a);
        String b = cs.readLine();
        int bb = Integer.parseInt(b);
        if(aa>bb)System.out.println(bb);
        else System.out.println(aa);//напишите тут ваш код

    }
}