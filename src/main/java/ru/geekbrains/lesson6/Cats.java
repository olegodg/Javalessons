package ru.geekbrains.lesson6;

public class Cats extends Pets {
    public static int catsCount;
    @Override
    public void swim(int distance) {
        System.out.println(kind + " " + name + " " + "can't swim!");
    }
    public Cats (String name){
        this.kind="Cat";
        this.name=name;
        this.swimDistance=0;
        this.runDistance=200;
        catsCount++;
    }
}
