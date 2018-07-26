package com.company.maker;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class CoffeeMaker {


    public static final int MAX_USES = 5;
    public static final int MAX_WATER = 50;
    public static final int MAX_SUGAR = 10;
    public static final int MAX_BEANS = 25;
    private float sugarAmount;
    private float waterAmount;
    private float beansAmount;
    private int useCount;


    public CoffeeMaker() {
    }

    public CoffeeMaker(float water, float sugar, float beans) {
        waterAmount = water;
        sugarAmount = sugar;
        beansAmount = beans;
    }


    public void fillProducts() {
        System.out.println("What are you adding? water - sugar - beans");
        Scanner skaitytuvas = new Scanner(System.in);
        String ingredient = skaitytuvas.next();
        switch (ingredient) {
            case "water":
                System.out.println("How many litres?");
                float waterToAdd = skaitytuvas.nextFloat();
                if (waterAmount + waterToAdd < MAX_WATER) {
                    waterAmount +=  waterToAdd;
                } else {
                    waterToAdd = MAX_WATER - waterAmount;
                    waterAmount = MAX_WATER;
                }
                System.out.println(waterAmount + " litres of water added.");
            case "beans":
                System.out.println("How many kilograms?");
                float beansToAdd = skaitytuvas.nextFloat();
                if (beansAmount + beansToAdd < MAX_BEANS) {
                    beansAmount += beansToAdd;
                } else {
                    beansToAdd = MAX_BEANS - beansAmount;
                    beansAmount = MAX_BEANS;
                }
                System.out.println(beansAmount + " kilos of coffee beans added.");

            case "sugar":
                System.out.println("How many kilograms?");
                float sugarToAdd = skaitytuvas.nextFloat();
                if (sugarAmount + sugarToAdd < MAX_SUGAR) {
                    sugarAmount += sugarToAdd;
                } else {
                    sugarToAdd = MAX_SUGAR - sugarAmount;
                    sugarAmount = MAX_SUGAR;
                }
                System.out.println(beansAmount + " kilos of sugar added.");
        }
    }

    public void makeCoffee(String coffeeType) {
        //if (!isReady()) return;

        switch (coffeeType.toLowerCase()) {
            case "black":
                sugarAmount -= 10;
                beansAmount -= 20;
                waterAmount -= 0.25f;
                System.out.println("                        (\n" +
                        "                          )     (\n" +
                        "                   ___...(-------)-....___\n" +
                        "               .-\"\"       )    (          \"\"-.\n" +
                        "         .-'``'|-._             )         _.-|\n" +
                        "        /  .--.|   `\"\"---...........---\"\"`   |\n" +
                        "       /  /    |                             |\n" +
                        "       |  |    |                             |\n" +
                        "        \\  \\   |                             |\n" +
                        "         `\\ `\\ |                             |\n" +
                        "           `\\ `|                             |\n" +
                        "           _/ /\\                             /\n" +
                        "          (__/  \\                           /\n" +
                        "       _..---\"\"` \\                         /`\"\"---.._\n" +
                        "    .-'           \\                       /          '-.\n" +
                        "   :               `-.__             __.-'              :\n" +
                        "   :                  ) \"\"---...---\"\" (                 :\n" +
                        "    '._               `\"--...___...--\"`              _.'\n" +
                        "      \\\"\"--..__                              __..--\"\"/\n" +
                        "       '._     \"\"\"----.....______.....----\"\"\"     _.'\n" +
                        "          `\"\"--..,,_____            _____,,..--\"\"`\n" +
                        "                        `\"\"\"----\"\"\"`");
                break;
            case "latte":
                sugarAmount -= 20;
                beansAmount -= 40;
                waterAmount -= 0.33f;
                System.out.println("                        \n" +
                        "                          ************\n" +
                        "                   ___********************\n" +
                        "               .-\"\"********************** \"\"-.\n" +
                        "         .-'``'|-._ ************************|\n" +
                        "        /  .--.|   `\"\"---...........---\"\"`   |\n" +
                        "       /  /    |                             |\n" +
                        "       |  |    |                             |\n" +
                        "        \\  \\   |                             |\n" +
                        "         `\\ `\\ |                             |\n" +
                        "           `\\ `|                             |\n" +
                        "           _/ /\\                             /\n" +
                        "          (__/  \\                           /\n" +
                        "       _..---\"\"` \\                         /`\"\"---.._\n" +
                        "    .-'           \\                       /          '-.\n" +
                        "   :               `-.__             __.-'              :\n" +
                        "   :                  ) \"\"---...---\"\" (                 :\n" +
                        "    '._               `\"--...___...--\"`              _.'\n" +
                        "      \\\"\"--..__                              __..--\"\"/\n" +
                        "       '._     \"\"\"----.....______.....----\"\"\"     _.'\n" +
                        "          `\"\"--..,,_____            _____,,..--\"\"`\n" +
                        "                        `\"\"\"----\"\"\"`");
                break;
            case "espresso":
                sugarAmount -= 10;
                beansAmount -= 40;
                waterAmount -= 0.1f;
                System.out.println(" )  (\n" +
                        "     (   ) )\n" +
                        "      ) ( (\n" +
                        "    _______)_\n" +
                        " .-'---------|  \n" +
                        "( C|/\\/\\/\\/\\/|\n" +
                        " '-./\\/\\/\\/\\/|\n" +
                        "   '_________'\n" +
                        "    '-------'");
                break;
            default:
                System.out.println("Nurodėte klaidingą kavos tipą.");
                System.out.println("   /                       \\\n" +
                        " /X/                       \\X\\\n" +
                        "|XX\\         _____         /XX|\n" +
                        "|XXX\\     _/       \\_     /XXX|___________\n" +
                        " \\XXXXXXX             XXXXXXX/            \\\\\\\n" +
                        "   \\XXXX    /     \\    XXXXX/                \\\\\\\n" +
                        "        |   0     0   |                         \\\n" +
                        "         |           |                           \\\n" +
                        "          \\         /                            |______//\n" +
                        "           \\       /                             |\n" +
                        "            | O_O | \\                            |\n" +
                        "             \\ _ /   \\________________           |\n" +
                        "                        | |  | |      \\         /\n" +
                        "  No Bullshit,          / |  / |       \\______/\n" +
                        "   Please...            \\ |  \\ |        \\ |  \\ |\n" +
                        "                      __| |__| |      __| |__| |\n" +
                        "                      |___||___|      |___||___|");
                break;
        }
        useCount++;
        sugarAmount = Math.max(sugarAmount, 0);
        waterAmount = Math.max(waterAmount, 0);
        beansAmount = Math.max(beansAmount, 0);

    }


    public void washMaker() {
        this.useCount = 0;
    }


    public boolean isReady() {

        boolean returnValue = true;


        if (useCount >= MAX_USES) {
            System.out.println("Please clean me.");
            returnValue = false;
        }
        if (waterAmount <= 0) {
            System.out.println("No water.");
            returnValue = false;
        }
        if (sugarAmount <= 0) {
            System.out.println("No sugar.");
            returnValue = false;
        }
        if (beansAmount <= 0) {
            System.out.println("No coffee beans.");
            returnValue = false;
        }

        return returnValue;
    }


    public void showProducts() {
        System.out.println("=========Product status=========");
        System.out.println("Sugar amount left:" + sugarAmount);
        System.out.println("Water amount left:" + waterAmount);
        System.out.println("Beans amount left:" + beansAmount);

    }


    public void showStatus() {
        System.out.println("=========Maker status============");
        System.out.println("Usages left:" + (MAX_USES - this.useCount));
        System.out.println("is machine ready:" + isReady());
        this.showProducts();
    }


    public float getWater() {
        return this.waterAmount;
    }


    public void setWater(float value) {
        this.waterAmount = value;
    }


    public float getBeans() {
        return this.beansAmount;
    }


    public void setBeans(float value) {
        this.beansAmount = value;
    }


    public float getSugar() {
        return this.sugarAmount;
    }


    public void setSugar(float value) {
        this.sugarAmount = value;
    }


}
