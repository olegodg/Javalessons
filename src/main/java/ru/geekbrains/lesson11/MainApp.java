package ru.geekbrains.lesson11;
import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        PhoneDirectory phoneDirectory = new PhoneDirectory();
        phoneDirectory.add("Петров", "+7(926)085-13-52");
        phoneDirectory.add("Иванов", "+7(926)452-55-08");
        phoneDirectory.add("Сидоров", "+7(926)570-03-14");
        phoneDirectory.add("Жучков", "+7(926)258-88-32");
        phoneDirectory.add("Мурзикова", "+7(926)171-53-30");
        phoneDirectory.add("Шарикова", "+7(926)923-53-18");
        phoneDirectory.add("Лысинов", "+7(926)889-29-31");
        phoneDirectory.add("Пуканов", "+7(926)080-42-02");
        System.out.println(phoneDirectory.getPhoneDirectory("Шарикова"));
        System.out.println(phoneDirectory.getPhoneDirectory("Мурзикова"));
        System.out.println(phoneDirectory.getPhoneDirectory("Иванов"));
        System.out.println(phoneDirectory.getPhoneDirectory("Пуканов"));
    }
}
