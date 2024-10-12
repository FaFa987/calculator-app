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

           switch (operation) {
                   case 1:
                   System.out.println("Addition operation has been executed");
                       break;
                   case 2:
                       System.out.println("Subtraction operation has been executed");
                       break;
                   case 3:
                       System.out.println("Multiplication operation has been executed");
                       break;
                   case 4:
                       System.out.println("Division operation has been executed");
                       break;
               default:
                   System.out.println("Invalid operation, please try again");

           }

        }while (true);

    }
}
