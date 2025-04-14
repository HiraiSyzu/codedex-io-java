// Syzu 4/13/25
import java.util.Scanner;

public class PetSimulatorGame {
  public static void main(String[] args) {
    
    // Variable int Values:
    int hunger = 5;
    int happiness = 5;
    int energy = 5;

    //Setting gameRunning Value
    boolean gameRunning = true;

    Scanner scanner = new Scanner(System.in); // Declare Scanner Object

    System.out.println("What is Your Pet's Name"); // User's Pet's Name

    String petName = scanner.nextLine(); // Get the user's pet name 
    
    while (gameRunning && hunger < 10 && happiness > 0 && energy > 0) {
      // Current pet's Stats
      System.out.println("Your pet " + petName + " current hunger :" + hunger + "/10");   // Pet's Hunger
      System.out.println("\n");
      System.out.println("Your pet " + petName + " current happiness :" + happiness + "/10"); //Pet's Hapiness
      System.out.println("\n");
      System.out.println("Your pet " + petName + " current energy  :" + energy + "/10"); // Pet's Energy
      System.out.println();
      
      // Action options
      System.out.println("What do  you want to do? (Choose from 1 - 3)");
      System.out.println("1. Feed your pet");
      System.out.println("2. Play with your pet");
      System.out.println("3. Let your pet sleep");

      int choice = scanner.nextInt();
      scanner.nextLine(); // Get the user's Actions

      if (choice == 1) {
        // Feed the pet
        hunger -= 1; // Decrease hunger by 1
        energy -= 1; // Decrease energy by 1

        System.out.println("You fed " + petName + " Hunger decreased by 1!");

      } else if (choice == 2) {

        // Play with the pet
        happiness += 1; // Increase happiness by 1
        energy -= 1; // Decrease energy by 1

        System.out.println("You played with your pet. Happiness increased by 1!");

      } else if (choice == 3) {
        // Let the pet sleep

        energy += 2; // Increase energy by 2

        System.out.println("Your pet " + petName + " is sleeping... Energy increased by 2!");

      } else {
        System.out.println("Invalid Output..... Please Try again");
      }

        // Print updated stats
      System.out.println("Updated hunger: " + hunger + "/10");
      System.out.println("Updated happiness: " + happiness + "/10");
      System.out.println("Updated energy: " + energy + "/10");
      System.out.println();

        // Hunger naturally increased
        hunger += 1; // Changed to increase hunger

       // Check game over conditions continue (Yes/No)
        if (hunger >= 10 || happiness <= 0 || energy <= 0) {
         System.out.println("Game Over! Would you like to continue (Yes/No): ");
         String answer = scanner.nextLine();
         
         if (answer.equalsIgnoreCase("Yes")) {
         //Resets the score and continue the game
         hunger = 5;
         happiness = 5;
         energy = 5;
         gameRunning = true; // Make sure gameRunning is true
         System.out.println("Starting new game");
         } else {
          System.out.println("Game Over! Thank for playing with " + petName + " You are the best !!!!!");
          gameRunning = false;
          break; // Added break to exit the loop immediately
         }
        }
    }
    scanner.close(); // //Will Close the Scanner
  }
}