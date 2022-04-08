package com.company;

import java.security.SecureRandom;
import java.util.Scanner;

public class Main {

    public static Knight knight = new Knight(50, 100, 15, 85);
    public static Scanner console = new Scanner(System.in);
    public static SecureRandom random = new SecureRandom();
    //Монстры
    public static Monsters easyMonsters=new Monsters();
    public static Monsters midleMonsters=new Monsters(0,0,"Средний");
    public static Monsters strongMonsters=new Monsters(0,0,"Тяжёлый");
    public static Monsters batle=new Monsters();

    //Магазин
    public static Shop kinjal=new Shop(15, 0,  5,0,0,"Кинжал");
    public static Shop knut=new Shop(20, 0,  10,0,0,"Кнут");
    public static Shop mech=new Shop(25, 0,  15,0,0,"Мечь");
    public static Shop zeljeDub=new Shop(36, 5,  10,0,10,"Зелье из коры дуба");
    public static Shop zeljeTrawi=new Shop(26, 10,  5,10,0,"Зелье из коры дуба");
    public static Shop shop=new Shop();



    //Магазин



    public static void main(String[] args) {

        while (knight.energy > 0 && knight.money > 0 && knight.hp > 0 && knight.force >0) {
            System.out.println("\n############################################");
            System.out.println(knight);
            System.out.println("\nВыберите следующее действие: " +
                    "\n 1 - Сражаться с монстром(1-6 энергии) " +
                    "\n 2 - Просить милостыню(2 энергии)(1-20 монет) " +
                    "\n 3 - Посетить магазин(5 энергии)" +
                    "\n 4 - Закончить игру");
            System.out.println("############################################\n");
            int move = console.nextInt();

            // Основное меню игры

            switch (move) {
                //Выбор уровня монстра
                case 1:
                    System.out.println(batle);
                    int monsterType = console.nextInt();
                    // Подменю выбора сложности монстра
                    switch (monsterType) {
                        case 1:
                        //Лёгкий уровень монстра; отнимает 7 энергии ;
                        // при победе отнимает 3 hp и добавляет: 7 монет и +2 к сила
                        // при поражении отнимает 8 hp и отнимает: 4 монеты и -1 к силе
                            if (knight.energy >= 7) {
                                knight.energy -= 7;
                                easyMonsters.forceMonster=random.nextInt(11);
                                System.out.println("Сила монстра: " +easyMonsters.forceMonster + "\nВаша сила: " + knight.force);
                                if (knight.force > easyMonsters.forceMonster) {
                                    knight.hp -= 3;
                                    knight.money += 7;
                                    knight.force += 2;
                                    System.out.println("Вы победили монстра\n");

                                } else if (knight.force < easyMonsters.forceMonster) {
                                    knight.hp -= 8;
                                    knight.money -= 4;
                                    knight.force -= 1;
                                    System.out.println("Вы проиграли");
                                } else if (knight.energy < 7) {
                                    System.out.println("У вас недостаточно энергии!");
                                }
                            }
                            break;
                        case 2:
                        //Средний уровень монстра; отнимает 9 энергии ;
                        // при победе отнимает 5 hp и добавляет: 9 монет и +3 к силе
                        // при поражении отнимает 10 hp и отнимает: 6 монеты и -2 к силе
                            if (knight.energy >= 9) {
                                knight.energy -= 9;
                                midleMonsters.forceMonster = random.nextInt(11) + 10;

                                System.out.println("Сила монстра: " + midleMonsters.forceMonster + "\nВаша сила: " + knight.force);
                                if (knight.force > midleMonsters.forceMonster) {
                                    knight.hp -= 5;
                                    knight.money += 9;
                                    knight.force += 3;
                                    System.out.println("Вы победили монстра\n");

                                } else if (knight.force < midleMonsters.forceMonster) {
                                    knight.hp -= 10;
                                    knight.money -= 6;
                                    knight.force -= 2;
                                    System.out.println("Вы проиграли");
                                } else if (knight.energy < 9) {
                                    System.out.println("У вас недостаточно энергии!");
                                }
                            }
                            break;
                        case 3:
                        // Тяжёлый уровень монстра; отнимает 11 энергии ;
                        // при победе отнимает 7 hp и добавляет: 11 монет и +4 к силе
                        // при поражении отнимает 12 hp и отнимает: 8 монеты и -3 к силе
                            if (knight.energy >= 11) {
                                knight.energy -= 11;
                                strongMonsters.forceMonster = random.nextInt(21) + 20;

                                System.out.println("Сила монстра: " + strongMonsters.forceMonster + "\nВаша сила: " + knight.force);
                                if (knight.force > strongMonsters.forceMonster) {
                                    knight.hp -= 7;
                                    knight.money += 11;
                                    knight.force += 4;
                                    System.out.println("Вы победили монстра\n");

                                } else if (knight.force < strongMonsters.forceMonster) {
                                    knight.hp -= 12;
                                    knight.money -= 8;
                                    knight.force -= 3;
                                    System.out.println("Вы проиграли");
                                } else if (knight.energy < 11) {
                                    System.out.println("У вас недостаточно энергии!");
                                }
                            }
                            break;
                        case 4:
                            break;
                    }
                    break;
                case 2: // просить милостыню
                    int milost = random.nextInt(21);
                    if (knight.energy >= 2) {
                        knight.money += milost;
                        knight.energy -= 2;
                        System.out.println("Вам пожертвовали: " + milost + " монет\n");
                    } else {
                        System.out.println("У вас недостаточно энергии!");
                    }
                    break;
                case 3: // Магазин
                    if (knight.energy >= 5) {
                    knight.energy -= 5;
                    System.out.println(shop);
                    int predmet = console.nextInt();
                    if (knight.money >= 15) {
                        switch (predmet) {

                            case 1:
                                knight.money -= kinjal.priceTowara;
                                knight.force += kinjal.plusForce;
                                System.out.println("Вы купили Кинжал");
                                break;
                            case 2:
                                knight.money -= knut.priceTowara;
                                knight.force += knut.plusForce;
                                System.out.println("Вы купили Кнут");
                                break;
                            case 3:
                                knight.money -= mech.priceTowara;
                                knight.force += mech.plusForce;
                                System.out.println("Вы купили Мечь");
                                break;
                            case 4:
                                knight.money -= zeljeDub.priceTowara;
                                knight.force += zeljeDub.plusForce;
                                knight.energy -= zeljeDub.minusEnergy;
                                knight.hp += zeljeDub.plusHealth;
                                System.out.println("Вы купил зелье из коры дуба");
                                break;
                            case 5:
                                knight.money -= zeljeTrawi.priceTowara;
                                knight.force += zeljeTrawi.plusForce;
                                knight.energy += zeljeTrawi.plusEnergy;
                                knight.hp += zeljeTrawi.plusHealth;
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
                    break;
                case 4: // Выход из игры
                    System.out.println("Вы закончили игру с:\n"+knight.toString());
                    return;
            }
        }
    }
}
