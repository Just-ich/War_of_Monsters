package com.company;

import static com.company.GameService.random;

public class Monsters {           // Сражение с монстрами и выбор их уровня

    private int easyForceMonster= random.nextInt(11);
    private int midlForceMonster= random.nextInt(21);
    private int strongForceMonster= random.nextInt(41);


    public Monsters() {

    }

    public int getEasyForceMonster() {
        return easyForceMonster;
    }

    public int getMidlForceMonster() {
        return midlForceMonster;
    }

    public int getStrongForceMonster() {
        return strongForceMonster;
    }


    @Override
    public String toString() {
        return "Выберите уровень монстра\n" +
                "\n 1 - Легкий --- Cила монстра 1-10;\n" +
                "     За участие в драке отнимает 7 энергии;\n" +
                "     при победе отнимает 3 hp и добавляет: 7 монет и 2 к сила;\n" +
                "     при поражении отнимает 8 hp и отнимает: 4 монеты и 1 к силе.\n" +
                "\n 2 - Средний --- Cила монстра 11-20;\n" +
                "     За участие в драке отнимает 9 энергии;\n" +
                "     при победе отнимает 5 hp и добавляет: 9 монет и 3 к сила;\n" +
                "     при поражении отнимает 10 hp и отнимает: 6 монеты и 2 к силе.\n" +
                "\n 3 - Тяжёлый --- Cила монстра 21-40;\n" +
                "     За участие в драке отнимает 11 энергии;\n" +
                "     при победе отнимает 7 hp и добавляет: 11 монет и 4 к сила;\n" +
                "     при поражении отнимает 12 hp и отнимает: 8 монеты и 3 к силе.\n" +
                "\n 4 - Отказаться от сражения.";

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
