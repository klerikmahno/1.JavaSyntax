package com.javarush.task.task04.task0432;

import java.awt.datatransfer.StringSelection;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Хорошего много не бывает
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader cs = new BufferedReader(new InputStreamReader(System.in));
        String a = cs.readLine();
        int b = Integer.parseInt(cs.readLine());
        while (b>0){
            System.out.println(a);
            b--;//напишите тут ваш код
        }

    }
}
