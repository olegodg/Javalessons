package ru.geekbrains.lesson11;
import java.util.*;

public class WordsArr {
    public static void main(String[] args) {
        Map<String, Integer> hm = new HashMap<>();
        String[] words = {"Маска", "Колесо", "Стакан","Собака",
                "Кошка", "Стол", "Дом", "Овощ", "Фрукт", "Кошка",
                "Миска", "Маска"
        };

        for (int i = 0; i < words.length; i++) {
            if (hm.containsKey(words[i]))
                hm.put(words[i], hm.get(words[i])+1);
            else
                hm.put(words[i], 1);
        }
        System.out.println(hm);
    }
}
