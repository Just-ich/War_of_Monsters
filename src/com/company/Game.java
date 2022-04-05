package com.company;

import java.util.Scanner;

public class Game extends Knight {         // Меню игры

    Shop shop =new Shop();
    Milostinja milostinja=new Milostinja();
    Monsters monsters=new Monsters();

    public void igra() {
        Scanner console = new Scanner(System.in);
        while (energy > 0 && money > 0 && hp > 0 && force >0) {
            System.out.println("\n############################################");
            System.out.println(toString());

            System.out.println("\nВыберите следующее действие: " +
                    "\n 1 - Сражаться с монстром(1-6 энергии) " +
                    "\n 2 - Просить милостыню(2 энергии)(1-20 монет) " +
                    "\n 3 - Посетить магазин(5 энергии)" +
                    "\n 4 - Закончить игру");
            System.out.println("############################################\n");
            int move = console.nextInt();
            switch (move) {
                case 1:
                    monsters.warMonsters();
                    break;
                case 2:
                    milostinja.milostinja();
                    break;
                case 3:
                    shop.shop();
                    break;
                case 4:
                    System.out.println("Вы закончили игру с:\n"+toString());
                    return;
            }
        }
    }
}




