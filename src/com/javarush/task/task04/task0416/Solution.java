package com.javarush.task.task04.task0416;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переходим дорогу вслепую
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader cs = new BufferedReader(new InputStreamReader(System.in));
        String A = cs.readLine();
        double t = Double.parseDouble(A);
        double x = t%5;
        if(x<3) System.out.println("зелёный");
        else if(x>2 && x<4) System.out.println("жёлтый");
        else System.out.println("красный");//напишите тут ваш код

    }
}