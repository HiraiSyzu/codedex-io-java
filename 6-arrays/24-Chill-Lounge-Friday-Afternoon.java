// Syzu 4/18/25

// 24. Chill Lounge Friday Afternoon

// Note: Array index doesnt start with 1, it always start with 0.
import java.util.Arrays; // we will use this so we can access the tools in Array class in this way we can use Arrays.sort and Arrays.equals

public class HelloWorld {

  public static void main(String[] args) {
    
    // Array playlistOne
    int[] playlistOne = {10070, 10060, 10050, 2015, 2016, 2019, 20042, 20017, 19004, 4244, 6192, 10030, 2001, 2949, 23456}; // 15 element numbers

    // Array playlistTwo
    int[] playlistTwo = {10069, 10059, 10049, 2014, 20015, 2018, 20043, 20018, 19005, 4245, 6193, 10029, 2000, 2950, 23457}; // 15 element numbers

    // Sorting Array - This is important, because it means it rearranges the elements inside the array in ascending order
    Arrays.sort(playlistOne);
    Arrays.sort(playlistTwo);

    // Comparing Array - This is used to check if Array int playlistOne and playlistTwo is identical or the same (same element, same order)

    boolean isEqual = Arrays.equals(playlistOne, playlistTwo);  // In this case, they aren't identical or even the same (same element, same order)

    // Checking if Array Playlist is Same/Not

    // So we will use if loop conditon
    if(isEqual) { // Well here we will check if(isEqual) whether true or false
      System.out.println("Perfect match! The playlists are identical."); // If true this will be printed
    } else {
      System.out.println("No match found. The playlists are not the same."); // If false this will be printed
      // In this case the playlist are not the same so it will print the the false one rather than the true 
    }
  }
}
