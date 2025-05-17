// Syzu 5/17/25

// 27. Counting Same Numbers

// Instruction:

// Write a method called countSameNumbers that takes three integers and returns:

// return 3 if all three numbers are the same

// return 2 if exactly two numbers are the same

// return 0 if none of the numbers are the same

public class CountingSameNumbers {

  public static int countSameNumbers(int num1, int num2, int num3) {
    
    if (num1 == num2 && num2 == num3) {
      return 3;
    } else if (num1 == num2 || num2 == num3 || num1 == num3) {
      return 2;
    } else {
      return 0;
    }
  }

  public static void main(String[] args) {
    System.out.println(countSameNumbers(1, 4, 5)); // return 0
    System.out.println(countSameNumbers(9, 5, 5)); // return 2
    System.out.println(countSameNumbers(10, 10, 10)); // return 3
    System.out.println(countSameNumbers(25, 52, 2)); // return 0
    System.out.println(countSameNumbers(10, 10, 1)); // return 2
  }
}

// My Explanation:
// So first, we will define a method called countSameNumbers with that have 3 integer parameters, 
// and will return integer value, so proceed to if condition, if all three num are equal, it will return 3;
// else if two numbers are equal, it will return 2;
// Otherwise if none are equal, it will return 0,
