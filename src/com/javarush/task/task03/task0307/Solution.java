package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        Zerg ZergOne = new Zerg();
        ZergOne.name = "ZergOne";
        Zerg ZergTwo = new Zerg();
        ZergTwo.name = "ZergTwo";
        Zerg ZergThree  = new Zerg();
        ZergThree.name = "ZergThree";
        Zerg ZergFour  = new Zerg();
        ZergFour.name = "ZergFour";
        Zerg ZergFive = new Zerg();
        ZergFive.name = "ZergFive";
        Protoss ProtossOne = new Protoss();
        ProtossOne.name = "ProtossOne";
        Protoss ProtossTwo = new Protoss();
        ProtossTwo.name = "ProtossTwo";
        Protoss ProtossThree  = new Protoss();
        ProtossThree.name = "ProtossThree";
        Terran TerranOne = new Terran();
        TerranOne.name = "TerranOne";
        Terran TerranTwo = new Terran();
        TerranTwo.name = "TerranTwo";
        Terran TerranThree  = new Terran();
        TerranThree.name = "TerranThree";
        Terran TerranFour  = new Terran();
        TerranFour.name = "TerranFour";//напишите тут ваш код

    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
