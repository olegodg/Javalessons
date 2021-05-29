package ru.geekbrains.lesson9;

    public class Wall implements Obstacles {
        private static int hieght;

        public Wall(int hieght) {
            this.hieght=hieght;
        }

        public static int getHieght() {
            return hieght;
        }

        @Override
        public void action(Team team) {
            team.jump();
        }
    }
