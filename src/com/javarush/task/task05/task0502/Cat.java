package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {

      /*  boolean age = this.age > anotherCat.age;
        boolean weight = this.weight > anotherCat.weight;
        boolean strength = this.strength > anotherCat.strength;
        if((age&&weight)||(age&&strength)||(weight&&strength)) return true;
        else if (this.age == anotherCat.age &&
        this.weight >= anotherCat.weight&&
        this.strength >= anotherCat.strength) return  false;
        else return false;//напишите тут ваш код */

      int thisCount = 0;
      int anotherCatCount = 0;
      if(this.age>anotherCat.age) thisCount+=1;
      else if(this.age==anotherCat.age) { thisCount++;anotherCatCount++;}
      else anotherCatCount++;
      if(this.weight>anotherCat.weight) thisCount++;
      else if(this.weight==anotherCat.weight){ thisCount++;anotherCatCount++;}
      else anotherCatCount++;
      if(this.strength>anotherCat.strength) thisCount++;
      else if(this.strength==anotherCat.strength){ thisCount++;anotherCatCount++;}
      else anotherCatCount++;
      return thisCount>anotherCatCount;
    }

    public static void main(String[] args) {
        Cat fox = new Cat();
        Cat masay = new Cat();
        fox.strength = 8;
        fox.weight = 5;
        fox.age = 8;
        masay.strength = 8;
        masay.weight = 4;
        masay.age = 8;
        System.out.println(fox.fight(masay));
    }
}
