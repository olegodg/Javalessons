package ru.geekbrains.lesson1;

public class HomeWorkApp {
    public static void main (String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("_Orange");
        System.out.println("_Banana");
        System.out.println("_Apple");
    }

    public static void checkSumSign() {
        int a, b;
        a=5;
        b=7;
        if (a+b>=0) {
            System.out.println("Сумма положительна");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value;
        value=120;
        if (value<=0) {
            System.out.println("Красный");
        }
        else {
            if (value >0 && value<=100){
                System.out.println("Желтый");
            }
            else {
                System.out.println("Зеленый");
            }
        }
    }

    public static void compareNumbers() {
        int a,b;
        a=4;
        b=7;
        if (a>=b) {
            System.out.println(a + ">=" + b);
        }
        else {
            System.out.println(a + "<" + b);
        }
    }

}

