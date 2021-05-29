package ru.geekbrains.L2lesson1;

public class MainApp {
    public static void main(String[] args) {
        Obstacles[] obstacle ={new Wall(2), new Treadmill(100), new Wall(5)};
        Team [] team = {new Cat("Барсик",200,0), new Human("Боб", 210, 1), new Cat("Мурзик",150,10), new Robot("Федя",1000)};
        for (Obstacles o : obstacle){
            for (Team t : team){
                o.action(t);
            }
        }
    }
}
