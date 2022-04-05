package com.company;

public class Shop extends Knight {           // Магазин

    public void shop() {
        if (energy >= 5) {
            energy -= 5;
            System.out.println("Добро пожаловать в магазин! " +
                    "\n Что вы хотете купить?" +
                    "\n 1 - Кинжал (15 монет, +5 к силе) " +
                    "\n 2 - Кнут (20 монет, +10 к силе) " +
                    "\n 3 - Мечь (25 монет, +15 к силе)" +
                    "\n 4 - Зелье из коры дуба (36 монета, +10 к силе, -10 к энергии, +5 к здоровью) " +
                    "\n 5 - Зелье из трав (26 монета, +5 к силе, +10 к энергии, +10 к здоровью) " +
                    "\n 6 - Выйти из магазина ");

            int predmet = console.nextInt();
            if (money >= 15) {
                switch (predmet) {

                    case 1:
                        money -= 15;
                        force += 5;
                        System.out.println("Вы купили Кинжал");
                        break;
                    case 2:
                        money -= 20;
                        force += 10;
                        System.out.println("Вы купили Кнут");
                        break;
                    case 3:
                        money -= 25;
                        force += 15;
                        System.out.println("Вы купили Мечь");
                        break;
                    case 4:
                        money -= 36;
                        force += 10;
                        energy -= 10;
                        hp += 5;
                        System.out.println("Вы купил зелье из коры дуба");
                        break;
                    case 5:
                        money -= 26;
                        force += 5;
                        energy += 10;
                        hp += 10;
                        System.out.println("Вы купили зелье из трав");
                        break;
                    case 6:
                        break;
                }
            } else {
                System.out.println("У вас недостаточно денег");
            }
        } else {
            System.out.println("У вас недостаточно энергии!");
        }


    }


}
