package com.company;

public class Knight extends Hero{
    private int dospehi;

    public Knight(int money, int hp, int force, int energy, int dospehi) {
        super(money, hp, force, energy);
        this.dospehi = dospehi;
    }

//    public Knight (Hero hero, int dospehi){
//        super(hero.getMoney(), hero.getHp(),hero.getForce(),hero.getEnergy());
//        this.dospehi=dospehi;
//    }


    @Override
    public String toString() {
        return "Рыцарь" +
                "\nТип снаряжения: " + dospehi + "\n";

    }
}
