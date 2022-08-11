package Lesson1;

import java.util.Random;
import java.util.Scanner;

public class Task1NumberGenerator {
    public static void main(String[] args) {
        int numberToGuess = new Random().nextInt(100);

        //Do testów
        System.out.println(numberToGuess);

        System.out.println("I generated integer in interval from 0 to 99. Guess what number it is.");

        int attempts, maxTries = 5;

        for (int i = 0; i < maxTries; i++) {
            Scanner in = new Scanner(System.in);
            attempts = maxTries - (i + 1);

            if (in.hasNextInt()) {
                int userInput = in.nextInt();

                if (userInput == numberToGuess) {
                    System.out.print("You guessed it!");
                    break;
                } else if (userInput > 99) {
                    System.out.print("Your number is GREATER than the one you are trying to guess. ");
                } else if (userInput < 0) {
                    System.out.print("Your number is LOWER than the one you are trying to guess. ");
                }
            } else if (i != 4) {
                System.out.println("This is not integer! Please try again. Remaining attempts: " + (attempts) + i);
            }

            if (i == 4) {
                System.out.println("Sorry you didn't guess the number, the answer was: " + numberToGuess);
            }else{
                System.out.println("Please try again. Remaining attempts: " + (attempts));
            }

        }


    }
}
