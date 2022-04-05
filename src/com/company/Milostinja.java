package com.company;

public class Milostinja extends Knight {           // Просить милостыню


    public int milostinja() {
        int milost = random.nextInt(21);
        if (energy >= 2) {
            money += milost;

            energy -= 2;

            System.out.println("Вам пожертвовали: " + milost + " монет\n");
        } else {
            System.out.println("У вас недостаточно энергии!");
        }


        return money+energy;
    }

}
