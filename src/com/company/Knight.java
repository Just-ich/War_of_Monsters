package com.company;


import java.security.SecureRandom;
import java.util.Scanner;

public class Knight {                    // Герой (рыцарь)
    public int money = 50;
    public int hp = 100;
    public int force = 15;
    public int energy = 85;

    Scanner console = new Scanner(System.in);
    SecureRandom random = new SecureRandom();




    Knight(int money, int hp, int force, int energy){
        this.money=money;
        this.hp=hp;
        this.force=force;
        this.energy=energy;
    }

    public Knight() {

    }



    @Override
    public String toString() {
        return "Money: " + money +
                "\nHP: " + hp +
                "\nForce: " + force +
                "\nEnergy: " + energy;

    }


}












//    public void igra() {
////        Scanner keyBoard = new Scanner(System.in);
////        while (true) {
////            System.out.print("Введите логин/Email: ");
////            String login = keyBoard.next();
////            System.out.print("Введите пароль: ");
////            String password = keyBoard.next();
////
////            if ("Run".equals(password) && ("edik01101997@mail.ru".equals(login) || "1_Bitcoin".equals(login))) {
////                System.out.println("Вы прошли авторизацию!");
//               // else {
////                System.out.println("\nВы ввели неправильный логин/Email или пароль!" +
////                        "\nПопробуйте ещё раз\n");
////
////            }
//        }
//    //}
////}
