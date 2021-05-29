package ru.geekbrains.lesson10;

public class MyArrayDataExeption extends Exception{
    int i;
    int j;

    public MyArrayDataExeption(int i, int j) {
        this.i = i;
        this.j = j;
    }
}
