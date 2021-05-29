package ru.geekbrains.L2lesson1;

public class Treadmill implements Obstacles {
    private static int len;

    public Treadmill(int len) {
        this.len = len;
    }

    public static int getLen() {
        return len;
    }

    @Override
    public void action(Team team) {
        team.run();
    }
}
