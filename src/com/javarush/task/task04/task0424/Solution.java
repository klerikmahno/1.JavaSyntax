package com.javarush.task.task04.task0424;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader cs = new BufferedReader(new InputStreamReader(System.in));
        int array[] = new int[3];
        for(int i=0;i<array.length;i++) {
            array[i] = Integer.parseInt(cs.readLine());
        }

        if(array[0]!=array[1] && array[1]==array[2])System.out.println("1");
        else if(array[1]!=array[0]&&array[0]==array[2])System.out.println("2");//напишите тут ваш код
        else if(array[2]!=array[0]&&array[0]==array[1])System.out.println("3");
    }
}
