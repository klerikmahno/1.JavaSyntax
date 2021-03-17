package com.javarush.task.task03.task0304;

/* 
Задача на проценты
*/

public class Solution {
    public static double addTenPercent(int i) {
        double y = i;
        double x = i + (y/10);//напишите тут ваш код
        return x;
    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(9));
    }
}
