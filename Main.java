import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> itemList = new ArrayList<Item>();
        Scanner input = new Scanner(System.in);
        String userInput;

        for (;;) {
            System.out.println("Select an option:");
            System.out.println("1: Add item to system");
            System.out.println("2: View item data");
            System.out.println("3: Edit item data");
            System.out.println("4: Delete all items");

            userInput = input.nextLine();

            switch (userInput) {
                case "1":
                    System.out.println("Input the item's name");
                    String name = input.nextLine();

                    System.out.println("Input the item's description");
                    String description = input.nextLine();

                    System.out.println("Input the current quantity of the item");
                    String quantity = input.nextLine();

                    System.out.println("Input the current price of the item");
                    String price = input.nextLine();

                    itemList.add(new Item(name, description, quantity, price));

                    System.out.println("Item:" + itemList.get(itemList.size() - 1) + "added");

                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                default:
                    break;
            }
        }
    }
}
