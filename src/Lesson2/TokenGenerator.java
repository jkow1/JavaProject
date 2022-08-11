package Lesson2;

import java.util.Random;
import java.util.Scanner;

public class TokenGenerator {


    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Choose token size which is limited to 5,10 or 15. ");

        String tokenSize = userInput.nextLine();

        switch (tokenSize) {
            case "5" -> System.out.println(tokenGenerator(5));
            case "10" -> System.out.println(tokenGenerator(10));
            case "15" -> System.out.println(tokenGenerator(15));
            default -> System.out.println("Wrong token size");
        }

    }

    public static String tokenGenerator(int tokenLenght) {

        String tokenAlphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()";
        Random randomChar = new Random();
        StringBuilder tokenBuilder = new StringBuilder(tokenLenght);

        for (int i = 0; i < tokenLenght; i++) {
            tokenBuilder.append(tokenAlphabet.charAt(randomChar.nextInt(tokenAlphabet.length())));
        }

        return tokenBuilder.toString();
    }


}
