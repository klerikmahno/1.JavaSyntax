package com.javarush.task.task04.task0425;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Цель установлена!
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader cs = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(cs.readLine());
        int b = Integer.parseInt(cs.readLine());
        if( a>0 && b>0)System.out.println("1");
        else if( a<0 && b>0)System.out.println("2");
        else if( a<0 && b<0)System.out.println("3");
        else if( a>0 && b<0)System.out.println("4");
//напишите тут ваш код

    }
}
