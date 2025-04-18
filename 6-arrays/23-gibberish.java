// Syzu 4/18/25

// 22. Gibberish

// Another Note: Array index doesnt start with 1, it always start with 0, So Thats why its only survivalPack[0] - survivalPack[4] not 1-5
public class test {

  public static void main(String[] args) {

    // I Created a array of int called keys that have bunch of random numbers. there's one key number that we want to find which is - 60

  int [] keys = {42452, 1104, 24233, 12495, 94244, 2999, 10303, 60, 4242, 4203, 3212, 2003};
    
    for(int i = 0; i < keys.length; i++) { // To check if 60 is in array, i used this for loop. It will start from  the first number int i = 0 and it continues until it reaches the end which is the(keys.length).
  
      // Another thing thing the meaning of (keys.length) is it used to get the length of our array, how many elements are inside 
      
      // So my array is keys.length number is 12 numbers inside the array, so it would return 12 numbers since i have 12 elements inside my array

      if (keys[i] == 60) { // I used nested if loop inside the for loop t check if the current number (keys[i]) is equal to 60.
        System.out.println("Congratulations!!... You found the key.........."); // It will print this if its equal to 60
        break; // i used this break statement to so the loop exits immediately once it found the key
      } 
     
    } 
  }
}
