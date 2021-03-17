package com.javarush.task.task05.task0505;

/* 
Кошачья бойня
*/

public class Solution {

    public static void main(String[] args) {
        Cat fox = new Cat("Фокс",8,5,5);
        Cat shuba = new Cat("Шуберт",9,6,8);
        Cat baks = new Cat("Бакс",3,4,6);
        System.out.println(fox.fight(shuba));
        System.out.println(fox.fight(baks));
        System.out.println(shuba.fight(baks));//напишите тут ваш код//напишите тут ваш код
    }

    public static class Cat {

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageScore = Integer.compare(this.age, anotherCat.age);
            int weightScore = Integer.compare(this.weight, anotherCat.weight);
            int strengthScore = Integer.compare(this.strength, anotherCat.strength);

            int score = ageScore + weightScore + strengthScore;
            return score > 0; // return score > 0 ? true : false;
        }
    }
}
