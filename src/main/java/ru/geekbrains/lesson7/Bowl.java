package ru.geekbrains.lesson7;

public class Bowl {
    private int dryFood;
    private int volume = 300;
    public Bowl(int dryFood) {this.dryFood = dryFood;}
    public void info() {
        if (dryFood<0){dryFood=0;}
        System.out.printf("Корма в миске: %d%s\n", dryFood, "г");}
    public void feedReduction(int quantity){dryFood-=quantity;}
    public int getDryFood() {return dryFood;}
    public int getVolume() {return volume;}
    public void addingFood(int quantity) {dryFood+=quantity;}
}
