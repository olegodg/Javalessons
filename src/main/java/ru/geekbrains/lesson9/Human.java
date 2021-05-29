package ru.geekbrains.lesson9;

public class Human implements Team {
    private String name;
    private int distance;
    private int height;
    private boolean suc = true;

    public Human(String name, int distance, int height) {
        this.name = name;
        this.distance = distance;
        this.height = height;
    }

    @Override
    public void run() {
        if (suc) {
            if (distance >= Treadmill.getLen()) {
                System.out.println(name + " пробежал беговую дорожку");
            } else {
                System.out.println(name + " не пробежал беговую дорожку");
                suc = false;
            }
        }
    }

    @Override
    public void jump(){
        if (suc) {
            if (height >= Wall.getHieght()) {
                System.out.println(name + " перепрыгнул через стену");
            } else {
                System.out.println(name + " не перепрыгнул через стену");
                suc=false;
            }
        }
    }
}
