package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    public static int countAll = 0;
    public static int count = 0;
    String name;
 //   String name = "Бездомный кот № ";
    int age=5;
    int weight=4;
    String address;
    String color = "Неизвестный природе цвет";
 //   int A = 5;// TO DO средний цвет
//    int W = 4;// TO DO средний цвет


    public void initialize( String name){
        countAll++;
        this.name = name;
  //      this.age = A;
  //      this.weight = W;
    }
    public void initialize( String name,int age){
        countAll++;
        this.name = name;
        this.age = age;
   //     this.weight = W;
    }
    public void initialize( String name,int weight,int age){
        countAll++;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public void initialize( int weight, String color) {
        countAll++;
        count++;
  //      this.name = this.name + count;
  //      this.age = A;
        this.weight = weight;
        this.color = color;
    }
    public void initialize( int weight, String color, String address) {
        countAll++;
   //     this.age = A;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

   /* public void printCat(){
        System.out.print(this.name+" ");
        System.out.print(this.age+" ");
        System.out.print(this.weight+" ");
        System.out.print(this.color+" ");
        System.out.print(this.address+" ");

    }*/
    public static void main(String[] args) {
/*    Cat cat1 = new Cat();
    cat1.initialize("CAT1");
    cat1.printCat();
    Cat cat2 = new Cat();
    cat2.initialize("CAT2",8);
    cat2.printCat();
    Cat cat3 = new Cat();
    cat3.initialize("CAT3",7,5);
    cat3.printCat();
    Cat cat4 = new Cat();
    cat4.initialize(3,"Рыжий");
    cat4.printCat();
    Cat cat5 = new Cat();
    cat5.initialize(7,"Чёрный","Москва, кремль,дом 1");
    cat5.printCat();
*/
    }//напишите тут ваш код
}
