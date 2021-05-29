package ru.geekbrains.lesson6;

public abstract class Pets {
    public static int count;
    String name;
    String kind;
    int swimDistance;
    int runDistance;

    public Pets(String name) {
        this.name = name;
    }
    public Pets(){count++;}
    public void run(int distance) {
        if (distance <= runDistance) {
            System.out.println(kind + " " + name + " " + "ran the distance");
        } else {
            System.out.println(kind + " " + name + " " + "didn't run the distance");
        }
    }
    public abstract void swim ( int distance);
}
