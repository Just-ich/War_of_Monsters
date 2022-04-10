package com.company;

import static com.company.GameService.hero;
import static com.company.GameService.random;

public class Knight  extends Hero{
    String horseName;

    public Knight(int money, int hp, int force, int energy, String horseName) {
        super(money, hp, force, energy);
        this.horseName = horseName;
    }

    public void horse(){
        setEnergy(getEnergy()+25);
        setForce(getForce()+10);
        setHp(getHp()+5);
    }

    public void prositMilost() {
        int milost = random.nextInt(21);
        if (hero.getEnergy() >= 2) {
            hero.setMoney(hero.getMoney()+milost);
            hero.setEnergy(hero.getEnergy()-2);
            System.out.println("Вам пожертвовали: " + milost + " монет\n");
        } else {
            System.out.println("У вас недостаточно энергии!");

        }
    }


    @Override
    public  String toString(){
        return super.toString()+
                "\n Лошадь: "+horseName;
    }

















    @Override
    public void win() {
        System.out.println("Я Рыцарь- Я выиграл!");
    }

    @Override
    public void mogetPrigat() {
        System.out.println("Я Рыцарь прыгнул");
    }

    @Override
    public void udar() {
        System.out.println("Я Рыцарь ударил");
    }
}
