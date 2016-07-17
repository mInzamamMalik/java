package com.company;

import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class Main {

    public static void main(String[] args) {
	// write your code here
    
        Scanner input = new Scanner(System.in);


        int credit = 0;
        String choice;

        print("\n\ndo you want to play game number guessing game?(y/n)");
        choice = input.next();

        do {
            switch (choice) {

                case "Y":
                case "y":

                    if (credit <= 0) {
                        print("\nYour Trail has been expired, please enter credit(Max 10)");
                        int tempInput = input.nextInt();
                        if (tempInput > 10) {
                            print("\nyou are exceeding Max credit, maximum 10 credits was allowed");
                            break;
                        } else {
                            credit = tempInput;
                        }
                    }

                    int randomNumber = ThreadLocalRandom.current().nextInt(1, 11);

                    print("\nWe have generated a Random number, Please Select A Number if it match you win: ");
                    int tempInput = input.nextInt();
                    if (randomNumber == tempInput) {
                        print("\nCongo!! You have Win the game, your have "+ credit+" Credits remaining");
                    } else {
                        credit--;
                        print("\nSorry our the number was: " + randomNumber + "\nBetter luck next time, your have "+ credit+" Credits remaining");
                    }

                    break;

                case "N":
                case "n":
                    print("\nThank You for playing, game is Terminating...");
                    choice = "n";
                    break;

                default:
                    print("\ninvalid input, please type 'y' or 'n' Erectly");
            }

            print("Your have "+ credit+" Credits remaining");
            print("\nDo you want to play this interesting game again?(y/n)");
            choice = input.next();

        } while (choice.equalsIgnoreCase("Y"));

    }

    public static void print(String line) {
        System.out.println(line);
    }
    
}



