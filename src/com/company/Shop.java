package com.company;

import java.util.Scanner;

public class Shop {           // Магазин
    Scanner console = new Scanner(System.in);
    Knight knight =new Knight();
    public void shop() {
        if (knight.energy >= 5) {
            knight.energy -= 5;
            System.out.println("Добро пожаловать в магазин! " +
                    "\n Что вы хотете купить?" +
                    "\n 1 - Кинжал (15 монет, +5 к силе) " +
                    "\n 2 - Кнут (20 монет, +10 к силе) " +
                    "\n 3 - Мечь (25 монет, +15 к силе)" +
                    "\n 4 - Зелье из коры дуба (36 монета, +10 к силе, -10 к энергии, +5 к здоровью) " +
                    "\n 5 - Зелье из трав (26 монета, +5 к силе, +10 к энергии, +10 к здоровью) " +
                    "\n 6 - Выйти из магазина ");

            int predmet = console.nextInt();
            if (knight.money >= 15) {
                switch (predmet) {

                    case 1:
                        knight.money -= 15;
                        knight.force += 5;
                        System.out.println("Вы купили Кинжал");
                        break;
                    case 2:
                        knight.money -= 20;
                        knight.force += 10;
                        System.out.println("Вы купили Кнут");
                        break;
                    case 3:
                        knight.money -= 25;
                        knight.force += 15;
                        System.out.println("Вы купили Мечь");
                        break;
                    case 4:
                        knight.money -= 36;
                        knight.force += 10;
                        knight.energy -= 10;
                        knight.hp += 5;
                        System.out.println("Вы купил зелье из коры дуба");
                        break;
                    case 5:
                        knight.money -= 26;
                        knight.force += 5;
                        knight.energy += 10;
                        knight.hp += 10;
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
