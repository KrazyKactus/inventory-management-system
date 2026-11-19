import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
