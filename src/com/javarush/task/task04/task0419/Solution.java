package com.javarush.task.task04.task0419;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Максимум четырех чисел
*/

public class Solution {
    public static int INT (String a){
        int aa = Integer.parseInt(a);
        return aa;
    }
    public static int max(int a,int b){
        if(a>b)return a;
        else return b;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader cs = new BufferedReader(new InputStreamReader(System.in));
        int a = INT(cs.readLine());
        int b = INT(cs.readLine());
        int c = INT(cs.readLine());
        int d = INT(cs.readLine());

        System.out.println(max(max(a,b),max(c,d)));

    }
}
