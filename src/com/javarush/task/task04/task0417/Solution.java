package com.javarush.task.task04.task0417;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Существует ли пара?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader cs = new BufferedReader(new InputStreamReader(System.in));
        String A = cs.readLine();
        String B = cs.readLine();
        String C = cs.readLine();
        if(A.equals(B)&&B.equals(C))System.out.println(A+" "+B+" "+C);
        else if (A.equals(B)) System.out.println(A+" "+B);
        else if (B.equals(C))System.out.println(B+" "+C);
        else if (A.equals(C)) System.out.println(A+" "+C);//напишите тут ваш код

    }
}