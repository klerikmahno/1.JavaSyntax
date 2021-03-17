package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {

    String name;
    int age=5;
    int weight=4;
    String address;
    String color = "Неизвестный природе цвет";

    public Cat( String name){
        this.name = name;
    }
    public Cat( String name,int weight,int age){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public Cat( String name,int age){
        this.name = name;
        this.age = age;

    }
    public Cat( int weight, String color) {
        this.weight = weight;
        this.color = color;
    }
    public Cat( int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

   /*  public void printCat(){
         System.out.print(this.name+" ");
         System.out.print(this.age+" ");
         System.out.print(this.weight+" ");
         System.out.print(this.color+" ");
         System.out.print(this.address+" ");
         System.out.println();

     }*/
    public static void main(String[] args) {
 /*   Cat cat1 = new Cat("CAT1");
    cat1.printCat();
    Cat cat2 = new Cat("CAT2",8);
    cat2.printCat();
    Cat cat3 = new Cat("CAT3",7,5);
    cat3.printCat();
    Cat cat4 = new Cat(3,"Рыжий");
    cat4.printCat();
    Cat cat5 = new Cat(7,"Чёрный","Москва, кремль,дом 1");
    cat5.printCat();
*/
    } //напишите тут ваш код

}
