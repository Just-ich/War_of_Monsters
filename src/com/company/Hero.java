package com.company;


public abstract class Hero implements MogetUdar, MogetPrigat {                    // Герой
    private int money = 50;
    private int hp = 100;
    private int force = 15;
    private int energy = 85;



    public Hero(int money, int hp, int force, int energy){
        this.money=money;
        this.hp=hp;
        this.force=force;
        this.energy=energy;
    }


    public Hero() {

    }

    public abstract void prositMilost();

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }


    public abstract void win();
    @Override
    public  String toString() {
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
