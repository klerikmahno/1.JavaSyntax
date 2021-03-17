package com.javarush.task.task04.task0413;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
День недели
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        if(a.equals("1") )System.out.println("понедельник");
        else if(a.equals("2") )System.out.println("вторник");
        else if(a.equals("3") )System.out.println("среда");
        else if(a.equals("4") )System.out.println("четверг");
        else if(a.equals("5") )System.out.println("пятница");
        else if(a.equals("6") )System.out.println("суббота");
        else if(a.equals("7") )System.out.println("воскресенье");
        else System.out.println("такого дня недели не существует");//напишите тут ваш код

    }
}