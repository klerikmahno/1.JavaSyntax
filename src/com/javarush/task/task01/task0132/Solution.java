package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) throws Exception {
        int a = 0;
        while(number > 10){
            a += number % 10;
            number = number / 10;

        }
        a += number;
        return a;
    }
}