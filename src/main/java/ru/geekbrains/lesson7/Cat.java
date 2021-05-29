package ru.geekbrains.lesson7;

public class Cat {
    private String name;
    private boolean hungry;
    private int appetite;
    public boolean isHungry() {return hungry;}
    public Cat (String name,boolean hungry,int appetite){this.name=name;this.hungry=hungry;this.appetite=appetite;}
    public void info(){
       if (hungry){
           System.out.println(name + " голоден!");
        }
        else{
            System.out.println(name + " сыт)");
        }
    }
    public void eating(Bowl bowl){
        if (hungry==true) {
            if (bowl.getDryFood() >= appetite) {
                bowl.feedReduction(appetite);
                reducedAppetite(appetite);
                hungry = false;
                System.out.println(name + " ест");
            } else {
                hungry = true;
                System.out.println(name + " отказывается есть, поскольку недостаточно еды!");
                System.out.println(bowl.getVolume() - bowl.getDryFood() + " добавлено корма в миску");
                bowl.addingFood(bowl.getVolume() - bowl.getDryFood());
                //System.out.println(bowl.getVolume()- bowl.getDryFood() + " добавлено корма в миску");
            }
        }
        else{
            System.out.println(name + " изначально не голоден");
        }
    }
    public boolean areHungry() {return hungry;}
    public int getAppetite() {return appetite;}
    public void reducedAppetite(int volumeAppetite){appetite-=volumeAppetite;}
}
