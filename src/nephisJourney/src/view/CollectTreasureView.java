package nephisJourney.src.view;

import java.util.Scanner;

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
                + "\nH - Help menu"
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
                //Create mainMenuView object when user quits collect treasure menu
                //display main menu and exit collect treasure menu
                MainMenuView mainMenuView = new MainMenuView();
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
                this.collectJewelry();
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
            case "H": // display the help menu
                this.displayHelpMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection ***"
                        + " Please select a valid display option ***");
                break;

        }
        return false;

}

    private void displayHelpMenu() {
        //Create helpMenuView object
        HelpMenuView helpMenuView = new HelpMenuView();

        //Display the help menu view
        helpMenuView.displayHelpMenuView();
    }

    private void collectJewelry() {
        System.out.println("\nPlease enter how many pieces of jewelry "
                + "you wish to collect: ");
    }

    private void collectGems() {
        System.out.println("*** collectGems function was called ***");
    }

    private void collectTableware() {
        System.out.println("*** collectTableware function was called ***");
    }

    private void collectSilver() {
        System.out.println("*** collectSilver function was called ***");
    }

    private void collectGold() {
        System.out.println("*** collectGold function was called ***");
    }
}