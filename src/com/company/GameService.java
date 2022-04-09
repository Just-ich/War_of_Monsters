package com.company;

import java.security.SecureRandom;
import java.util.Scanner;

public class GameService {

    public static Scanner console = new Scanner(System.in);
    public static SecureRandom random = new SecureRandom();
    public static Hero hero =new Hero(50,100,15,85);
    //Монстр
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
            System.out.println(hero);
            System.out.println("\nВыберите следующее действие: " +
                    "\n 1 - Сражаться с монстром(7, 9, 11 энергии) " +
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

                            Monsters easyMonsters=new Monsters();
                            if (hero.getEnergy() >= 7) {
                                hero.setEnergy(hero.getEnergy()-7);
                                System.out.println("Сила монстра: " +easyMonsters.getEasyForceMonster() + "\nВаша сила: " + hero.getForce());
                                if (hero.getForce() > easyMonsters.getEasyForceMonster()) {
                                    hero.setHp(hero.getHp()-3);
                                    hero.setMoney(hero.getMoney()+7);
                                    hero.setForce(hero.getForce()+2);
                                    System.out.println("Вы победили монстра\n");

                                } else if (hero.getForce() < easyMonsters.getEasyForceMonster()) {
                                    hero.setHp(hero.getHp()-8);
                                    hero.setMoney(hero.getMoney()-4);
                                    hero.setForce(hero.getForce()-1);
                                    System.out.println("Вы проиграли");
                                } else if (hero.getEnergy() < 7) {
                                    System.out.println("У вас недостаточно энергии!");
                                }
                            }
                            break;
                        case 2:
                            //Средний уровень монстра; отнимает 9 энергии ;
                            // при победе отнимает 5 hp и добавляет: 9 монет и +3 к силе
                            // при поражении отнимает 10 hp и отнимает: 6 монеты и -2 к силе
                            Monsters midlMonsters =new Monsters();
                            if (hero.getEnergy() >= 9) {
                                hero.setEnergy(hero.getEnergy()-9);
                                System.out.println("Сила монстра: " + midlMonsters.getMidlForceMonster() + "\nВаша сила: " + hero.getForce());
                                if (hero.getForce() > midlMonsters.getMidlForceMonster()) {
                                    hero.setHp(hero.getHp()-5);
                                    hero.setMoney(hero.getMoney()+9);
                                    hero.setForce(hero.getForce()+3);
                                    System.out.println("Вы победили монстра\n");

                                } else if (hero.getForce() < midlMonsters.getMidlForceMonster()) {
                                    hero.setHp(hero.getHp()-10);
                                    hero.setMoney(hero.getMoney()-6);
                                    hero.setForce(hero.getForce()-2);
                                    System.out.println("Вы проиграли");
                                } else if (hero.getEnergy() < 9) {
                                    System.out.println("У вас недостаточно энергии!");
                                }
                            }
                            break;
                        case 3:
                            // Тяжёлый уровень монстра; отнимает 11 энергии ;
                            // при победе отнимает 7 hp и добавляет: 11 монет и +4 к силе
                            // при поражении отнимает 12 hp и отнимает: 8 монеты и -3 к силе
                            Monsters strongMonsters=new Monsters();
                            if (hero.getEnergy() >= 11) {
                                hero.setEnergy(hero.getEnergy()-11);
                                System.out.println("Сила монстра: " + strongMonsters.getStrongForceMonster() + "\nВаша сила: " + hero.getForce());
                                if (hero.getForce() > strongMonsters.getStrongForceMonster()) {
                                    hero.setHp(hero.getHp()-7);
                                    hero.setMoney(hero.getMoney()+11);
                                    hero.setForce(hero.getForce()+4);
                                    System.out.println("Вы победили монстра\n");

                                } else if (hero.getForce() < strongMonsters.getStrongForceMonster()) {
                                    hero.setHp(hero.getHp()-12);
                                    hero.setMoney(hero.getMoney()-8);
                                    hero.setForce(hero.getForce()-3);
                                    System.out.println("Вы проиграли");
                                } else if (hero.getEnergy() < 11) {
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
                    if (hero.getEnergy() >= 2) {
                        hero.setMoney(hero.getMoney()+milost);
                        hero.setEnergy(hero.getEnergy()-2);
                        System.out.println("Вам пожертвовали: " + milost + " монет\n");
                    } else {
                        System.out.println("У вас недостаточно энергии!");

                    }
                   break;




                case 3: // Магазин
                    if (hero.getEnergy() >= 5) {
                        hero.setEnergy(hero.getEnergy()-5);
                        System.out.println(shop);
                        int predmet = console.nextInt();
                        if (hero.getMoney() >= 15) {
                            switch (predmet) {

                                case 1:
                                    hero.setMoney(hero.getMoney()-kinjal.priceTowara);
                                    hero.setForce(hero.getForce()+kinjal.plusForce);
                                    System.out.println("Вы купили Кинжал");
                                    break;
                                case 2:
                                    hero.setMoney(hero.getMoney()-knut.priceTowara);
                                    hero.setForce(hero.getForce()+knut.plusForce);
                                    System.out.println("Вы купили Кнут");
                                    break;
                                case 3:
                                    hero.setMoney(hero.getMoney()-mech.priceTowara);
                                    hero.setForce(hero.getForce()+mech.plusForce);
                                    System.out.println("Вы купили Мечь");
                                    break;
                                case 4:
                                    hero.setMoney(hero.getMoney()-zeljeDub.priceTowara);
                                    hero.setForce(hero.getForce()+zeljeDub.plusForce);
                                    hero.setEnergy(hero.getEnergy()-zeljeDub.minusEnergy);
                                    hero.setHp(hero.getHp()+zeljeDub.plusHealth);
                                    System.out.println("Вы купил зелье из коры дуба");
                                    break;
                                case 5:
                                    hero.setMoney(hero.getMoney()-zeljeTrawi.priceTowara);
                                    hero.setForce(hero.getForce()+zeljeTrawi.plusForce);
                                    hero.setEnergy(hero.getEnergy()+zeljeTrawi.plusEnergy);
                                    hero.setHp(hero.getHp()+zeljeTrawi.plusHealth);
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
                    System.out.println("Вы закончили игру с:\n"+ hero.toString());
                    return;
                default:
                    System.out.println("Выберите пункт меню!");
            }
        }
    }
}
