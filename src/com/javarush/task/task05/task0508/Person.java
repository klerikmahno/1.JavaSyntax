package com.javarush.task.task05.task0508;

/* 
Геттеры и сеттеры для класса Person
*/

public class Person {
    String name;
    int age;
    char sex;
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }//напишите тут ваш код
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public char getSex(){ return this.sex;}
    public void setSex(char sex){ this.sex = sex;}//напишите тут ваш код

    public static void main(String[] args) {

    }
}
