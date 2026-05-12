import java.util.Scanner;
public class Main {
    final public static int startingInventory = 25;
    public static int alreadyAdded = 0;
    public static void main(String[] args) {
        System.out.println("Welcome to custom hoodies!");
        topLevelMenu();
    }
    public static void inventoryActions(){
        System.out.println("You are now in inventory actions.\nThere are three actions you can take. Firstly, you can add a product (type 0). Secondly, you can view available inventory (type 1). And lastly, you can go back to the previous choice menu (type 2).");
        Scanner input = new Scanner(System.in);

        byte inventoryActionsChoice = input.nextByte();
        if (inventoryActionsChoice == 0) {
            if (alreadyAdded == 1) {
                System.out.println("I'm sorry but you have already added a product to the inventory. Sending you back to inventory actions.");
                inventoryActions();
            }
            alreadyAdded ++;
            System.out.println("What color sweatshirt would you like to add to the inventory?");
            String sweatshirtColor = input.next();
            addingAProduct(sweatshirtColor);
        }
        else if (inventoryActionsChoice == 1) {

        }
        else if (inventoryActionsChoice == 2) {
            topLevelMenu();
        }
        else {
            System.out.println("Since you have inputted an incorrect value for the previous question you are getting re-prompted...");
            inventoryActions();
        }
    }
    public static void salesActions(){
        System.out.println("You are now in sales actions.");
    }
    public static void exit(){
        System.out.println("You have chosen to terminate the program. Thank you for your business with custom hoodies!");
        System.exit(0);
    }
    public static void topLevelMenu(){
        Scanner input = new Scanner (System.in);
        System.out.println("Would you like to take an inventory action (type 1), would you like to take a sales action (type 2), or would you like to exit (press 3).");
        byte topLevelMenuChoice = input.nextByte();
        if (topLevelMenuChoice == 1) inventoryActions();
        else if (topLevelMenuChoice == 2) salesActions();
        else if (topLevelMenuChoice == 3) exit();
        else {
            System.out.println("You have inputted an incorrect input, sending you back...");
            topLevelMenu();
        }
    }
    public static void addingAProduct(String sweatshirtColor){
System.out.println("How many " + sweatshirtColor + " colored sweatshirts would you like to add?");
    }
}
