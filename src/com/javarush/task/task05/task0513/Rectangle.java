package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    int top;
    int left;
    int width;
    int height;
    public void initialize(int top, int left, int width,int height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }
    public void initialize(int top, int left){
        this.top = top;
        this.left = left;
        this.width = 0;
        this.height = 0;
    }
    public void initialize(int top, int left, int height){
        this.top = top;
        this.left = left;
        this.height = height;
        this.width = height;
    }
    public void initialize(Rectangle rectangle){
        this.top = rectangle.top;
        this.left = rectangle.left;
        this.width = rectangle.width;
        this.height = rectangle.height;
    }
   /* public void printKV(){
        System.out.print(this.top+" ");
        System.out.print(this.left+" ");
        System.out.print(this.width+" ");
        System.out.print(this.height+" ");
        System.out.println();

    }//напишите тут ваш код */

    public static void main(String[] args) {
/*        Rectangle r1 = new Rectangle();
        r1.initialize(3,4,7);
        r1.printKV();
        Rectangle r2 = new Rectangle();
        r2.initialize(3,4,7,6);
        r2.printKV();
        Rectangle r3 = new Rectangle();
        r3.initialize(3,4);
        r3.printKV();
        Rectangle r4 = new Rectangle();
        r4.initialize(r1);
        r4.printKV(); */
    }
}
