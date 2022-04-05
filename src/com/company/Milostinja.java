package com.company;

import java.security.SecureRandom;

public class Milostinja {             // Просить милостын

    public SecureRandom random = new SecureRandom();
    Knight knight =new Knight(50, 100, 15, 85);
    public String milostinja() {

        int milost = random.nextInt(21);
        if (knight.energy >= 2) {
            knight.money += milost;

            knight.energy -= 2;

            System.out.println("Вам пожертвовали: " + milost + " монет\n");
        } else {
            System.out.println("У вас недостаточно энергии!");
        }
        return knight.toString();
    }




//    public String milostinja() {
//        //SecureRandom random = new SecureRandom();
//        int milost = random.nextInt(21);
//        if (energy >= 2) {
//            money += milost;
//
//            energy -= 2;
//
//            System.out.println("Вам пожертвовали: " + milost + " монет\n");
//        } else {
//            System.out.println("У вас недостаточно энергии!");
//        }
//
//        System.out.println("Деньги mil: "+money+"\nЭнергия mil: "+energy);
//        return toString();
//    }


}
