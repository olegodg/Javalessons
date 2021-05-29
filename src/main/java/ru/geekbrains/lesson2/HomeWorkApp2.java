package ru.geekbrains.lesson2;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        System.out.println(checkingTheSumOfTwoNumbers(2,10));
        checkingANumberForASign(5);
        System.out.println(checkingANumberSign(-12));
        printAStringMultipleTimes("world",5);//почему-то если в методе задал переменную times тип данных byte, он не хотел работать
        System.out.println(leapYear(2000));
    }

    public static boolean checkingTheSumOfTwoNumbers(int number1, int number2) {
        if (number1+number2>10 && number1+number2<=20) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void checkingANumberForASign(int num) {
        if (num>=0) {
            System.out.println(num+" is positive");
        }
        else {
            System.out.println(num+" is negative");
        }
    }
    public static boolean checkingANumberSign(int number1) {
        if (number1>=0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void printAStringMultipleTimes(String something,int times) {
        for (byte i=0; i<times;i++){
            System.out.println(something);
        }
    }

    public static boolean leapYear(int year) {
        if (year % 400 ==0 || year % 4==0 && year % 100!=0){
            return true;
        }
        else {
            return false;
        }
    }
}
