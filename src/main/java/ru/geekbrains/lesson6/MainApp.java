package ru.geekbrains.lesson6;

public class MainApp {
    public static void main(String[] args) {
        Cats[] cat = {new Cats("Murka"), new Cats("Mark"), new Cats("Kolbas")};
        Dogs[] dog = {new Dogs("Bob"), new Dogs("Sharik"), new Dogs("Rex"), new Dogs("Rich")};
        for (int i=0;i<cat.length;i++){
            cat[i].run(100);
            cat[i].swim(0);
            }
        for (int i=0;i<dog.length;i++){
            dog[i].run(100);
            dog[i].swim(0);
        }
    }
}

