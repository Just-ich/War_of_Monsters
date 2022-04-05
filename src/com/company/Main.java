package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        Knight knight = new Knight(50, 100, 15, 85);
        Shop shop =new Shop();
        Milostinja milostinja=new Milostinja();
        Monsters monsters=new Monsters();
        Scanner console = new Scanner(System.in);



        while (knight.energy > 0 && knight.money > 0 && knight.hp > 0 && knight.force >0) {
            System.out.println("\n############################################");
            System.out.println(knight.toString());
            System.out.println("\nВыберите следующее действие: " +
                    "\n 1 - Сражаться с монстром(1-6 энергии) " +
                    "\n 2 - Просить милостыню(2 энергии)(1-20 монет) " +
                    "\n 3 - Посетить магазин(5 энергии)" +
                    "\n 4 - Закончить игру");
            System.out.println("############################################\n");
            int move = console.nextInt();

            // Основное меню игры

            switch (move) {                          // Основное меню игры
                case 1:
                    System.out.println("Выберите сложность монстра:" +
                            "\n 1 - Легкий" +                          //(1-10 сила монстра)
                            "\n 2 - Средний" +                         //(11 - 20 сила монстра)
                            "\n 3 - Сложный" +                         //(21-40 сила монстра)
                            "\n 4 - Отказаться от сражения" );                           //(41-50 сила монстра)
                    int monsterType = console.nextInt();
                    switch (monsterType) {                     // Подменю выбора сложности монстра
                        case 1:
                            monsters.warEasyMonsters();
                            knight = monsters.knight;
                            break;
                        case 2:
                            monsters.warMidleMonsters();
                            knight = monsters.knight;
                            break;
                        case 3:
                            monsters.warStrongMonsters();
                            knight = monsters.knight;
                            break;
                        case 4:
                            break;
                    }
                    break;
                case 2:
                    milostinja.milostinja();
                    knight=milostinja.knight;
                    break;
                case 3:
                    shop.shop();
                    knight=shop.knight;
                    break;
                case 4:
                    System.out.println("Вы закончили игру с:\n"+knight.toString());
                    return;
            }
        }
    }
}
