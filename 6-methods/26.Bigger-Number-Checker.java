// Syzu 5/16/25

// Exercise 26: Bigger Number Checker

// Instruction:

// Instructions: Create a method that takes two integer parameters, The method should return a boolean. Return true if the first number is greater than the second number.

// Otherwise, return false. Call this method 3 times inside the main method with different number pairs.
// Print the results of each call to see if the method works correctly.

// Example:
// Input: (5, 10) → Output: false
// Input: (41, 50) → Output: false
// Input: (15, 2) → Output: true

public class Method { 
  public static boolean isGivenNumbers(int num1, int num2) { // Method with 2 int parameters
    return num1 > num2; // return boolean, return true if num1 > num2, otherwise returns false

  }
  public static void main(String[] args) { // Main Method
    System.out.println(isGivenNumbers(5, 10)); // Returns false since 5 isn't greater than 10
    System.out.println(isGivenNumbers(41, 50)); // Returns false also
    System.out.println(isGivenNumbers(15, 2)); // Here it returns true, as 15 > 2
  }
}

// My Explanation:
// So first, I created a method that takes two parameters, which are (int num1, int num2).
// After that, the method should return a boolean — it returns true if num1 > num2.
// Then, we print the results in the main method.

// For the 1st println, we gave num1 = 5 and num2 = 10; it returns false because num1 is less than num2.
// The 2nd println has num1 = 41 and num2 = 50, so it also returns false.
// And the last println is num1 = 15 and num2 = 2, so it returns true.
