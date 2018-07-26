package com.company;

import com.company.maker.CoffeeMaker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main obj = new Main();
        obj.dirbam();
    }

    private void showMenu() {
        System.out.println("0 - baigti darba");
        System.out.println("1 - gaminti kava");
        //System.out.println("1 - gaminti juoda kava");
        //System.out.println("2 - gaminti latte kava");
        //System.out.println("3 - gaminti espresso kava");
        System.out.println("2 - rodyti aparato busena");
        System.out.println("3 - plauti aparata");
        System.out.println("4 - pildyti produktus");
    }

    private void dirbam() {
        CoffeeMaker aparatas = CoffeeMaker.getInstance();
        Scanner sc = new Scanner(System.in);
        boolean arTesti = true;
        do {
            showMenu();
            int pasirinkimas = sc.nextInt();
            switch (pasirinkimas) {
                case 0:
                    arTesti = false;
                    break;
                case 1:
                    if (aparatas.isReady()) {
                        System.out.println("Įveskite kavos pavadinimą: black – latte – espresso");
                        String coffeeType = sc.next();
                        aparatas.makeCoffee(coffeeType);
                    }
                    break;
                case 2:
                    aparatas.showStatus();
                    break;
                case 3:
                    aparatas.washMaker();
                    break;
                case 4:
                    aparatas.fillProducts();
                    break;

            }

        } while (arTesti);
    }
}
