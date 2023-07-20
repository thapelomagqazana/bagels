package org.example.userinput;

import java.util.Scanner;

public class UserInput {

    public static String getUserInput(int chances){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess #"+chances+":");
        System.out.print("> ");
        String input = scanner.nextLine().trim();

        return input;

    }
}
