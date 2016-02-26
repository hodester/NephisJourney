package nephisJourney.src.view;

import java.util.Scanner;
import nephisJourney.NephisJourney;
import nephisJourney.src.control.InventoryControl;

/**
 *
 * @author Jenaca
 */
public class CollectTreasureView {
    //promptMessage = "Please select from the following options: "

    private String promptMessage;

    public CollectTreasureView() {
        this.promptMessage = "\nPlease select the letter corresponding "
                + "to the menu item: ";
    }

    public void displayMenu() {
        System.out.println(
                "\n"
                + "\n--------------------------------------------"
                + "\n|Treasure Menu                                 |"
                + "\n--------------------------------------------"
                + "\nJ - Jewelry"
                + "\nP - Precious gems"
                + "\nT - Fine Tableware"
                + "\nS - Silver coins"
                + "\nG - Gold coins"
                + "\nC - Calculate Treasure Weight"
                + "\nQ - Quit"
                + "\n--------------------------------------------");

    }

    public void displayCollectTreasureView() {

        boolean done = false; // set flag to not done
        do {
            // prompt for and get user's menu option
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) // user wants to quit
            {
                //Create gameMenuView object when user quits collect treasure menu
                GameMenuView gameMenuView = new GameMenuView();

                //display game menu 
                gameMenuView.displayMenu();
                return; // exit collect treasure menu
            }
            // do the requested action and display the next view
            done = this.doAction(menuOption);

        } while (!done);
    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initialize to not valid

        while (!valid) { //loop while an invalid value is enter
            System.out.println("\n" + this.promptMessage);

            value = keyboard.nextLine(); //get next line typed on keyboard
            value = value.trim(); //trim off leading and trailing white space

            if (value.length() < 1) { //value is blank
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
            if (value.length() > 1) { //value is too long
                System.out.println("\nInvalid value: Please select the letter "
                        + "corresponding to the menu item.");
                continue;
            }
            break; //end the loop
        }

        return value; //return the value entered
    }

    public boolean doAction(String menuOption) {

        menuOption = menuOption.toUpperCase(); // convert choice to upper case

        switch (menuOption) {
            case "J": // Jewelry
                this.getNumJewelry();
                break;
            case "P": // Precious gems
                this.collectGems();
                break;
            case "T": // Fine tableware
                this.collectTableware();
                break;
            case "S": // Silver coins
                this.collectSilver();
                break;
            case "G": // Gold coins
                this.collectGold();
                break;
            case "C": // Calculate total treasure weight
                this.calcTreasureWeight();
                break;
            default:
                System.out.println("\n*** Invalid selection ***"
                        + " Please select a valid display option ***");
                break;

        }
        return false;

    }

    private void getNumJewelry() {
         System.out.println("\nPlease enter how many pieces of jewelry "
                + "you wish to collect: ");
    }

private void collectGems() {
        System.out.println("\nPlease enter how many precious gems "
                + "you wish to collect: ");
    }

    private void collectTableware() {
        System.out.println("\nPlease enter how many pieces of fine "
                + "tableware you wish to collect: ");
    }

    private void collectSilver() {
        System.out.println("\nPlease enter how many pieces of silver "
                + "you wish to collect: ");
    }

    private void collectGold() {
        System.out.println("\nPlease enter how many pieces of gold "
                + "you wish to collect: ");
    }

    private void calcTreasureWeight() {
        System.out.println("\nThis will calculate total treasure weight: ");
}
}