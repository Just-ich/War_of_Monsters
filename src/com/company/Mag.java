package com.company;

import static com.company.GameService.hero;
import static com.company.GameService.random;

public class Mag extends Hero{
    String chari;

    public Mag(int money, int hp, int force, int energy, String chari) {
        super(money, hp, force, energy);
        this.chari=chari;

    }

    public void chari(){
        setEnergy(getEnergy()+10);
        setForce(getForce()+5);
        setHp(getHp()+15);
    }

    @Override
    public void prositMilost() {
        int milost = random.nextInt(21)+20;
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
                "\n Чары: "+chari;
    }




















    @Override
    public void win() {
        System.out.println("Я Маг- Я выиграл!");
    }



    @Override
    public void mogetPrigat() {
        System.out.println("Я Маг прыгнул");

    }

    @Override
    public void udar() {
        System.out.println("Я Маг ударил");
    }
}
