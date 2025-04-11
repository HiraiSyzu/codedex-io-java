//Syzu 4/11/25

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        // Write your code here 💖
        
        Scanner scanner = new Scanner(System.in);
        double exchangeRate = 0.0045;

        System.out.println("Welcome to the Club Penguin Game");
        System.out.println("How many coins do you have?");
        int coins = scanner.nextInt();

        double dollars = coins * exchangeRate;

        System.out.println("You have the following amount of dollars");
        System.out.println(dollars);

        scanner.close();
    }
}

