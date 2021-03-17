package com.javarush.task.task04.task0443;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Как назвали, так назвали
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader cs = new BufferedReader(new InputStreamReader(System.in));
        String name = cs.readLine();
        int dd = Integer.parseInt(cs.readLine());
        int mm = Integer.parseInt(cs.readLine());
        int yyyy = Integer.parseInt(cs.readLine());
        System.out.println("Меня зовут "+name+'.');
        System.out.println("Я родился "+yyyy+"."+mm+"."+dd);//напишите тут ваш код

    }
}
