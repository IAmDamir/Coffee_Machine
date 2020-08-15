package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int water = 400;
        int milk = 540;
        int beans = 120;
        int cups = 9;
        int money = 550;
        boolean exit = true;
        while (exit) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scanner.next();
            switch (action) {
                case "take":
                    System.out.println("I gave you " + money);
                    money = 0;
                    break;
                case "fill":
                    System.out.println("Write how many ml of water do you want to add:");
                    int waterPlus = scanner.nextInt();
                    System.out.println("Write how many ml of milk do you want to add:");
                    int milkPlus = scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    int beansPlus = scanner.nextInt();
                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    int cupsPlus = scanner.nextInt();
                    water += waterPlus;
                    milk += milkPlus;
                    beans += beansPlus;
                    cups += cupsPlus;
                    break;
                case "remaining":
                    System.out.println("The coffee machine has:");
                    System.out.println(water + " of water");
                    System.out.println(milk + " of milk");
                    System.out.println(beans + " of coffee beans");
                    System.out.println(cups + " of disposable cups");
                    System.out.println(money + " of money");
                    break;
                case "exit":
                    exit = false;
                    break;
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                    String coffee = scanner.next();
                    switch (coffee) {
                        case "1":
                            water -= 250;
                            beans -= 16;
                            cups -= 1;
                            money += 4;
                            if (water >= 0 && beans >= 0 && cups >= 0) {
                                System.out.println("I have enough resources, making you a coffee!");
                            } else {
                                if (water < 0) {
                                    System.out.println("Sorry, not enough water!");
                                } else if (beans < 0) {
                                    System.out.println("Sorry, not enough beans!");
                                } else {
                                    System.out.println("Sorry, not enough cups!");
                                }
                                water += 250;
                                beans += 16;
                                cups += 1;
                                money -= 4;
                            }
                            break;
                        case "2":
                            water -= 350;
                            milk -= 75;
                            beans -= 20;
                            cups -= 1;
                            money += 7;
                            if (water >= 0 && milk >= 0 && beans >= 0 && cups >= 0) {
                                System.out.println("I have enough resources, making you a coffee!");
                            } else {
                                if (water < 0) {
                                    System.out.println("Sorry, not enough water!");
                                } else if (milk < 0) {
                                    System.out.println("Sorry, not enough milk!");
                                } else if (beans < 0) {
                                    System.out.println("Sorry, not enough beans!");
                                } else {
                                    System.out.println("Sorry, not enough cups!");
                                }
                                water += 350;
                                milk += 75;
                                beans += 20;
                                cups += 1;
                                money -= 7;
                            }
                            break;
                        case "3":
                            water -= 200;
                            milk -= 100;
                            beans -= 12;
                            cups -= 1;
                            money += 6;
                            if (water >= 0 && milk >= 0 && beans >= 0 && cups >= 0) {
                                System.out.println("I have enough resources, making you a coffee!");
                            } else {
                                if (water < 0) {
                                    System.out.println("Sorry, not enough water!");
                                } else if (milk < 0) {
                                    System.out.println("Sorry, not enough milk!");
                                } else if (beans < 0) {
                                    System.out.println("Sorry, not enough beans!");
                                } else {
                                    System.out.println("Sorry, not enough cups!");
                                }
                                water += 200;
                                milk += 100;
                                beans += 12;
                                cups += 1;
                                money -= 6;
                            }
                            break;
                        case "back":
                            break;
                        case "exit":
                            exit = false;
                            break;
                    }
                    break;
            }
        }
    }
}