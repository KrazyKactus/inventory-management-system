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
                    System.out.println("");
                    System.out.println("Input the item's name");
                    String name = input.nextLine();

                    System.out.println("");
                    System.out.println("Input the item's description");
                    String description = input.nextLine();

                    System.out.println("");
                    System.out.println("Input the current quantity of the item");
                    String quantity = input.nextLine();

                    System.out.println("");
                    System.out.println("Input the current price of the item");
                    String price = input.nextLine();

                    itemList.add(new Item(name, description, quantity, price));

                    System.out.println("");
                    System.out.println("Item: " + itemList.get(itemList.size() - 1).GetName() + " added");
                    System.out.println("");

                    break;

                case "2":
                    int n = 0;
                    for (Item item : itemList) {
                        System.out.println("");
                        System.out.println("Name: " + item.GetName());
                        System.out.println("Index #: " + n);
                        System.out.println("");
                        n++;
                    }

                    System.out.println("Input item index (leave blank to return to menu)");
                    userInput = input.nextLine();

                    try {
                        int index = Integer.parseInt(userInput);
                        if (index < itemList.size() && index >= 0) {
                            System.out.println("");
                            System.out.println(itemList.get(index).GetName());
                            System.out.println(itemList.get(index).GetDescription());
                            System.out.println(itemList.get(index).GetQuantity());
                            System.out.println(itemList.get(index).GetPrice());
                            System.out.println("");
                        }
                    } catch (Exception e) {
                        System.err.println("No index integer detected: exit");
                        break;
                    }

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
