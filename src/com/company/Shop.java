package com.company;

public class Shop {           // Магазин

    int priceTowara;
    int plusHealth;
    int plusForce;
    int plusEnergy;
    int minusEnergy;
    String nameTowar;

    public Shop() {
    }


    public Shop(int priceTowara, int plusHealth, int plusForce, int plusEnergy, int minusEnergy,  String nameTowar) {
        this.priceTowara = priceTowara;
        this.plusHealth = plusHealth;
        this.plusForce = plusForce;
        this.plusEnergy = plusEnergy;
        this.minusEnergy = minusEnergy;
        this.nameTowar = nameTowar;


    }
    @Override
    public String toString() {
        return      "Добро пожаловать в магазин! " +
                   "\n Что вы хотете купить?" +
                   "\n 1 - Кинжал - " + " Цена: " + 15 + " монет; "+ " Сила: " + 5+
                   "\n 2 - Кнут - " + " Цена: " + 20 +" монет; "+ " Сила: " + 10+
                   "\n 3 - Мечь - " + " Цена: " + 25 +" монет; "+ " Сила: " + 15+
                   "\n 4 - Зелье из коры дуба - " + " Цена: " + 36 +" монет; "+ " Сила: " + 10 + ", Энергия: " + (-15) +
                   ", Здоровье: " + 5 +
                   "\n 5 - Зелье из трав - " + " Цена: " + 26 +" монет; "+ " Сила: " + 5 + ", Энергия: " + 10 +
                   ", Здоровье: " + 10 +
                   "\n 6 - Выйти из магазина ";
    }
}

