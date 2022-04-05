package com.company;

import java.security.SecureRandom;

public class Monsters {           // Сражение с монстрами и выбор их уровня

    public int forceMonster;



    SecureRandom random = new SecureRandom();
    public Knight knight =new Knight(50, 100, 15, 85);

    // Лёгкий уровень монстра; отнимает 7 энергии ;
    // при победе отнимает 3 hp и добавляет: 7 монет и +2 к сила
    // при поражении отнимает 8 hp и отнимает: 4 монеты и -1 к силе
    public void warEasyMonsters() {
        if (knight.energy >= 7) {
            knight.energy -= 7;
            forceMonster = random.nextInt(11);

            System.out.println("Сила монстра: " + forceMonster + "\nВаша сила: " + knight.force);
            if (knight.force > forceMonster) {
                knight.hp -= 3;
                knight.money += 7;
                knight.force += 2;
                System.out.println("Вы победили монстра\n");

            } else if (knight.force < forceMonster) {
                knight.hp -= 8;
                knight.money -= 4;
                knight.force -= 1;
                System.out.println("Вы проиграли");
            } else if (knight.energy < 7) {
                System.out.println("У вас недостаточно энергии!");
            }
        }
    }


    // Средний уровень монстра; отнимает 9 энергии ;
    // при победе отнимает 5 hp и добавляет: 9 монет и +3 к силе
    // при поражении отнимает 10 hp и отнимает: 6 монеты и -2 к силе

    public void warMidleMonsters() {
        if (knight.energy >= 9) {
            knight.energy -= 9;
            forceMonster = random.nextInt(11) + 10;

            System.out.println("Сила монстра: " + forceMonster + "\nВаша сила: " + knight.force);
            if (knight.force > forceMonster) {
                knight.hp -= 5;
                knight.money += 9;
                knight.force += 3;
                System.out.println("Вы победили монстра\n");

            } else if (knight.force < forceMonster) {
                knight.hp -= 10;
                knight.money -= 6;
                knight.force -= 2;
                System.out.println("Вы проиграли");
            } else if (knight.energy < 9) {
                System.out.println("У вас недостаточно энергии!");
            }
        }
    }


    // Тяжёлый уровень монстра; отнимает 11 энергии ;
    // при победе отнимает 7 hp и добавляет: 11 монет и +4 к силе
    // при поражении отнимает 12 hp и отнимает: 8 монеты и -3 к силе
    public void warStrongMonsters() {
        if (knight.energy >= 11) {
            knight.energy -= 11;
            forceMonster = random.nextInt(21) + 20;

            System.out.println("Сила монстра: " + forceMonster + "\nВаша сила: " + knight.force);
            if (knight.force > forceMonster) {
                knight.hp -= 7;
                knight.money += 11;
                knight.force += 4;
                System.out.println("Вы победили монстра\n");

            } else if (knight.force < forceMonster) {
                knight.hp -= 12;
                knight.money -= 8;
                knight.force -= 3;
                System.out.println("Вы проиграли");
            } else if (knight.energy < 11) {
                System.out.println("У вас недостаточно энергии!");
            }
        }
    }












//
//    // Профи уровень монстра; отнимает 13 энергии ;
//    // при победе отнимает 9 hp и добавляет: 13 монет и +5 к силе
//    // при поражении отнимает 14 hp и отнимает: 10 монеты и -4 к силе
//
//    public void warProfiMonsters() {
//        if (energy >= 13) {
//            energy -= 13;
//            int monsterForce = random.nextInt(41) + 10;
//
//            System.out.println("Сила монстра: " + monsterForce + "\nВаша сила: " + force);
//            if (force > monsterForce) {
//                hp -= 9;
//                money += 13;
//                force += 5;
//                System.out.println("Вы победили монстра\n");
//
//            } else if (force < monsterForce) {
//                hp -= 14;
//                money -= 10;
//                force -= 4;
//                System.out.println("Вы проиграли");
//            } else if (energy < 13) {
//                System.out.println("У вас недостаточно энергии!");
//            }
//        }
//    }
//
//    // Ytbpdtcnysq монстра; отнимает 15 энергии ;
//    // при победе отнимает 11 hp и добавляет: 15 монет и +7 к силе
//    // при поражении отнимает 16 hp и отнимает: 12 монеты и -6 к силе
//    public void warUltimeitMonsters() {
//        if (energy >= 15) {
//            int monsterForce = random.nextInt(61) + 10;
//            energy -= 15;
//            System.out.println("Сила монстра: " + monsterForce + "\nВаша сила: " + force);
//            if (force > monsterForce) {
//                hp -= 11;
//                money += 15;
//                force += 7;
//                System.out.println("Вы победили монстра\n");
//
//            } else if (force < monsterForce) {
//                hp -= 16;
//                money -= 12;
//                force -= 6;
//                System.out.println("Вы проиграли");
//            } else if (energy < 5) {
//                System.out.println("У вас недостаточно энергии!");
//            }
//        }
//    }

}
