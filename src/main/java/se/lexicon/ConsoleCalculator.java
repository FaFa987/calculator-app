package se.lexicon;

import java.util.Scanner;

public class ConsoleCalculator {

    public static void displayMenu() {
        System.out.println("-----Calculator Menu-----");
        System.out.println(" 1 + Addition:");
        System.out.println(" 2 - Subtraction:");
        System.out.println(" 3 * Multiplication:");
        System.out.println(" 4 / Division:");
        System.out.println(" 5 Exit  ");
        System.out.println("--------------------");
    }

    public static void runCalculator() {
        boolean continueLoop = true;
        do {
            displayMenu();
            System.out.println("choose the operation:");
            Scanner sc = new Scanner(System.in);
            int operation = sc.nextInt();
           if (operation == 5) {
               //continueLoop = false;
               break;
           }
        }while (true);

    }
}
