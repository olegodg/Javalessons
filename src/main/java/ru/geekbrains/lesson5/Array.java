package ru.geekbrains.lesson5;

public class Array {
    public static void main(String[] args) {
        Employee[] peoples = {
                new Employee("Oleg","Zhuravel", "olegodg@yandex.ru","single",26),
                new Employee("Sasha","Petrov", "sopet@mail.ru","married",56),
                new Employee("Petya","Shinshilov", "ShInShIlA74@gmail.com","single",35),
                new Employee("Aleksandr","Unknown", "-","single",44),
                new Employee("Viktor","Zhipulin", "ZhipaVik45@yandex.ru","married",45),
                new Employee("Yaroslav","Baykov", "bykeYa@mail.ru","single",22),
                new Employee("Artur","Molodec", "molodAr31@gmail.com","single",31),
        };
        for (int i=0;i<peoples.length;i++){
            if (peoples[i].getAge()>40){
                peoples[i].information();
            }
        }
    }
}
