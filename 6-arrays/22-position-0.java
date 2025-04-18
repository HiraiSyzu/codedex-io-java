//Syzu 4/18/25

// 22. Position 0

// Note: Array index doesnt start with 1, it always start with 0, So Thats why its only survivalPack[0] - survivalPack[4] not 1-5

public class HelloWorld {

  public static void main(String[] args) {

   String [] treasureChest = {"Gold Coin", "Emerald", "Silver Ring", "Ruby Necklace", "Ancient Map", "Diamond Crown", "Ruby", "Golden Katana", "Treasure Map"};

    System.out.println("Treasure Item : " + treasureChest[0]); // Print: Gold Coin
    System.out.println("Treasure Item : " + treasureChest[2]); // Print: Silver Ring
    System.out.println("Treasure ITem : " + treasureChest[5]); // Print: Diamond Crown
    System.out.println("Treasure Item : " + treasureChest[4]); // Print: Ancient Map
    System.out.println("Treasure Item : " + treasureChest[6]); // Print: Ruby
    System.out.println("Treasure Item : " + treasureChest[8]); // Print: Treasure Map
    
  }
}
