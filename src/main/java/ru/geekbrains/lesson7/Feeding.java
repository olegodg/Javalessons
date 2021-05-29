package ru.geekbrains.lesson7;

public class Feeding {
    public static void main(String[] args) {
        Bowl bowl= new Bowl(10);
        Cat[] cat = {new Cat("Мурзик",true,5),
                new Cat("Барсик",true,12),
                new Cat("Шура",false,7)};
        bowl.info();
        for (int i=0; i< cat.length;i++){
            cat[i].info();
            cat[i].eating(bowl);
            if (cat[i].areHungry()==true){
                cat[i].eating(bowl);
            }
            cat[i].info();
            bowl.info();
        }
    }
}
