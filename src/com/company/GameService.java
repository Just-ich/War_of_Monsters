package com.company;

import java.security.SecureRandom;
import java.util.Scanner;

public class GameService {
    public static Knight knight = new Knight(50, 100, 15, 85,1);
    public static Scanner console = new Scanner(System.in);
    public static SecureRandom random = new SecureRandom();
    public static Hero hero =new Hero(50,100,15,85);
    //Монстры
    public static Monsters easyMonsters=new Monsters();
    public static Monsters midleMonsters=new Monsters();
    public static Monsters strongMonsters=new Monsters();
    public static Monsters batle=new Monsters();

    //Магазин
    public static Shop kinjal=new Shop(15, 0,  5,0,0,"Кинжал");
    public static Shop knut=new Shop(20, 0,  10,0,0,"Кнут");
    public static Shop mech=new Shop(25, 0,  15,0,0,"Мечь");
    public static Shop zeljeDub=new Shop(36, 5,  10,0,10,"Зелье из коры дуба");
    public static Shop zeljeTrawi=new Shop(26, 10,  5,10,0,"Зелье из коры дуба");
    public static Shop shop=new Shop();

    public void igra(){
        while (hero.getEnergy() > 0 && hero.getMoney() > 0 && hero.getHp() > 0 && hero.getForce() >0) {
            System.out.println("\n############################################");
            //System.out.println(hero.getMoney());
           // System.out.println(knight.getMoney());
            System.out.println();
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
                            if (knight.getEnergy() >= 7) {
                                knight.setEnergy(knight.getEnergy()-7);
                                System.out.println("Сила монстра: " +easyMonsters.easyForceMonster + "\nВаша сила: " + knight.getForce());
                                if (knight.getForce() > easyMonsters.easyForceMonster) {
                                    knight.setHp(knight.getHp()-3);
                                    knight.setMoney(knight.getMoney()+7);
                                    knight.setForce(knight.getForce()+2);
                                    System.out.println("Вы победили монстра\n");

                                } else if (knight.getForce() < easyMonsters.easyForceMonster) {
                                    knight.setHp(knight.getHp()-8);
                                    knight.setMoney(knight.getMoney()-4);
                                    knight.setForce(knight.getForce()-1);
                                    System.out.println("Вы проиграли");
                                } else if (knight.getEnergy() < 7) {
                                    System.out.println("У вас недостаточно энергии!");
                                }
                            }
                            break;
                        case 2:
                            //Средний уровень монстра; отнимает 9 энергии ;
                            // при победе отнимает 5 hp и добавляет: 9 монет и +3 к силе
                            // при поражении отнимает 10 hp и отнимает: 6 монеты и -2 к силе
                            if (knight.getEnergy() >= 9) {
                                knight.setEnergy(knight.getEnergy()-9);
                                System.out.println("Сила монстра: " + midleMonsters.midleForceMonster + "\nВаша сила: " + knight.getForce());
                                if (knight.getForce() > midleMonsters.midleForceMonster) {
                                    knight.setHp(knight.getHp()-5);
                                    knight.setMoney(knight.getMoney()+9);
                                    knight.setForce(knight.getForce()+3);
                                    System.out.println("Вы победили монстра\n");

                                } else if (knight.getForce() < midleMonsters.midleForceMonster) {
                                    knight.setHp(knight.getHp()-10);
                                    knight.setMoney(knight.getMoney()-6);
                                    knight.setForce(knight.getForce()-2);
                                    System.out.println("Вы проиграли");
                                } else if (knight.getEnergy() < 9) {
                                    System.out.println("У вас недостаточно энергии!");
                                }
                            }
                            break;
                        case 3:
                            // Тяжёлый уровень монстра; отнимает 11 энергии ;
                            // при победе отнимает 7 hp и добавляет: 11 монет и +4 к силе
                            // при поражении отнимает 12 hp и отнимает: 8 монеты и -3 к силе
                            if (knight.getEnergy() >= 11) {
                                knight.setEnergy(knight.getEnergy()-11);
                                System.out.println("Сила монстра: " + strongMonsters.strongForceMonster + "\nВаша сила: " + knight.getForce());
                                if (knight.getForce() > strongMonsters.strongForceMonster) {
                                    knight.setHp(knight.getHp()-7);
                                    knight.setMoney(knight.getMoney()+11);
                                    knight.setForce(knight.getForce()+4);
                                    System.out.println("Вы победили монстра\n");

                                } else if (knight.getForce() < strongMonsters.strongForceMonster) {
                                    knight.setHp(knight.getHp()-12);
                                    knight.setMoney(knight.getMoney()-8);
                                    knight.setForce(knight.getForce()-3);
                                    System.out.println("Вы проиграли");
                                } else if (knight.getEnergy() < 11) {
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
                    if (knight.getEnergy() >= 2) {
                        knight.setMoney(knight.getMoney()+milost);
                        knight.setEnergy(knight.getEnergy()-2);
                        System.out.println("Вам пожертвовали: " + milost + " монет\n");
                    } else {
                        System.out.println("У вас недостаточно энергии!");

                    }
                   break;




                case 3: // Магазин
                    if (knight.getEnergy() >= 5) {
                        knight.setEnergy(knight.getEnergy()-5);
                        System.out.println(shop);
                        int predmet = console.nextInt();
                        if (knight.getMoney() >= 15) {
                            switch (predmet) {

                                case 1:
                                    knight.setMoney(knight.getMoney()-kinjal.priceTowara);
                                    knight.setForce(knight.getForce()+kinjal.plusForce);
                                    System.out.println("Вы купили Кинжал");
                                    break;
                                case 2:
                                    knight.setMoney(knight.getMoney()-knut.priceTowara);
                                    knight.setForce(knight.getForce()+knut.plusForce);
                                    System.out.println("Вы купили Кнут");
                                    break;
                                case 3:
                                    knight.setMoney(knight.getMoney()-mech.priceTowara);
                                    knight.setForce(knight.getForce()+mech.plusForce);
                                    System.out.println("Вы купили Мечь");
                                    break;
                                case 4:
                                    knight.setMoney(knight.getMoney()-zeljeDub.priceTowara);
                                    knight.setForce(knight.getForce()+zeljeDub.plusForce);
                                    knight.setEnergy(knight.getEnergy()-zeljeDub.minusEnergy);
                                    knight.setHp(knight.getHp()+zeljeDub.plusHealth);
                                    System.out.println("Вы купил зелье из коры дуба");
                                    break;
                                case 5:
                                    knight.setMoney(knight.getMoney()-zeljeTrawi.priceTowara);
                                    knight.setForce(knight.getForce()+zeljeTrawi.plusForce);
                                    knight.setEnergy(knight.getEnergy()+zeljeTrawi.plusEnergy);
                                    knight.setHp(knight.getHp()+zeljeTrawi.plusHealth);
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
                    System.out.println("Вы закончили игру с:\n"+ knight.toString());
                    return;
            }
        }
    }
}
