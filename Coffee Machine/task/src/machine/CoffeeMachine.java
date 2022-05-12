package machine;
import java.util.Scanner;
public class CoffeeMachine {


    public static int water = 400;
    public static int milk = 540;
    public static int bean = 120;
    public static int cups = 9;
    public static int money = 550;


    public static void state() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(bean + " g of coffee beans");
        System.out.println(cups + " disposable cups");
        System.out.println("$" + money + " of money");
    }

    public static void addw(int addWater) {
        water = water + addWater;
    }

    public static void addm(int addMilk) {
        milk = milk + addMilk;
    }

    public static void addb(int addBean) {
        bean = bean + addBean;
    }

    public static void addc(int addCups) {
        cups = cups + addCups;
    }

    public static void again() {
        main(null);
    }

    public static void main(String[] args) {

        boolean bool = false;
        Scanner sc = new Scanner(System.in);


        System.out.println("Write action (buy, fill, take, remaining, exit): ");
        String action = sc.next();
        String buy = "";
        
        switch (action) {
            case "buy":
                System.out.println();
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                buy = sc.next();
                break;

            case "fill":
                System.out.println();
                System.out.println("Write how many ml of water you want to add: ");
                int addWater = sc.nextInt();
                CoffeeMachine.addw(addWater);

                System.out.print("Write how many ml of milk you want to add: ");
                int addMilk = sc.nextInt();
                CoffeeMachine.addm(addMilk);

                System.out.println("Write how many grams of coffee beans you want to add: ");
                int addBean = sc.nextInt();
                CoffeeMachine.addb(addBean);

                System.out.println("Write how many disposable cups of coffee you want to add: ");
                int addCups = sc.nextInt();
                CoffeeMachine.addc(addCups);
                System.out.println();

                again();
                break;

            case "take":
                System.out.println("I gave you $" + money);
                money -= money;
                again();
                break;

            case "remaining":
            System.out.println();
                state();
                System.out.println();
                again();
                break;

            case "exit":
                System.exit(0);
        }

        switch (buy) {
            case "1":
                if (water >= 250 && bean >= 16 && cups >= 1) {
                    water -= 250;
                    bean -= 16;
                    money += 4;
                    cups -= 1;

                    System.out.println("I have enough resources, making you a coffee!");
                } else if (water < 250) {
                    System.out.println("Sorry, not enough water!");
                    System.out.println();
                }
                again();

                break;
            case "2":
                if (water >= 350 && bean >= 20 && cups >= 1 && milk >= 75) {
                    water -= 350;
                    milk -= 75;
                    bean -= 20;
                    money += 7;
                    cups -= 1;

                    System.out.println("I have enough resources, making you a coffee!");
                } else if (water < 250) {
                    System.out.println("Sorry, not enough water!");
                    System.out.println();
                }
                again();
                break;
                
            case "3":
                if (water >= 200 && bean >= 12 && cups >= 1 && milk >= 100) {
                    water -= 200;
                    milk -= 100;
                    bean -= 12;
                    money += 6;
                    cups -= 1;

                    System.out.println("I have enough resources, making you a coffee!");
                } else if (water < 250) {
                    System.out.println("Sorry, not enough water!");
                    System.out.println();
                }
                again();

                break;
            case "back":
                again();

        }
    }
}