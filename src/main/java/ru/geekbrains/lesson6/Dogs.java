package ru.geekbrains.lesson6;

public class Dogs extends Pets {
    public static int dogsCount;
    @Override
    public void swim(int distance) {
        if (distance<=swimDistance){
            System.out.println(kind + " " + name + " " + "swim the distance");
        }
        else {
            System.out.println(kind + " " + name + " " + "didn't swim the distance");
        }
    }
    public Dogs (String name){
        this.kind="Dog";
        this.name=name;
        this.swimDistance=10;
        this.runDistance=500;
        dogsCount++;
        System.out.println(dogsCount);
    }
}
