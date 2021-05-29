package ru.geekbrains.L2lesson1;

public class Robot implements Team{
    private String name;
    private int distance;
    private boolean suc=true;

    public Robot(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    @Override
    public void run() {
        if (suc) {
            if (distance >= Treadmill.getLen()) {
                System.out.println(name + " пробежал беговую дорожку");
            } else {
                System.out.println(name + " не пробежал беговую дорожку");
                suc=false;
            }
        }
    }

    @Override
    public void jump() {
        if (suc) {
            System.out.println(name + " не умею прыгать");
            suc = false;
        }
    }
}
