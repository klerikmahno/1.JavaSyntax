package com.javarush.task.task04.task0415;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Правило треугольника
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader cs = new BufferedReader(new InputStreamReader(System.in));
        String A = cs.readLine();
        int a = Integer.parseInt(A);
        String B = cs.readLine();
        int b = Integer.parseInt(B);
        String C = cs.readLine();
        int c = Integer.parseInt(C);
        if ((a+b)>c && (b+c)>a && (a+c)>b) System.out.println("Треугольник существует.");
        else System.out.println("Треугольник не существует.");//напишите тут ваш код

    }
}