package nephisJourney.src.view;

import java.util.Scanner;

/**
 *
 * @author Jenaca
 */
public class HelpMenuView {

    //promptMessage = "Please select from the following options: "
    private String promptMessage;

    public HelpMenuView() {

        this.promptMessage = "\nPlease select the letter corresponding "
                + "to the menu item: ";

        //display the menu when the view is created
        this.displayMenu();
    }

    private void displayMenu() {

        System.out.println(
                "\n"
                + "\n--------------------------------------------"
                + "\n|Help Menu                                 |"
                + "\n--------------------------------------------"
                + "\nG - What is the goal of the game"
                + "\nM - How to move"
                + "\nE - Estimating the amount of resources"
                + "\nH - Collect Inventory"
                + "\nQ - Quit"
                + "\n--------------------------------------------");

    }

    public void displayHelpMenuView() {

        boolean done = false; // set flag to not done
        do {
            // prompt for and get player's name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) // user wants to quit
            {
                //Create mainMenuView object when user quits help menu
                //display main menu and exit help menu
                MainMenuView mainMenuView = new MainMenuView();
                   
                // display the main menu
               // MainMenuView mainMenu = new MainMenuView();
               // mainMenu.displayMenu();

                //Display the game menu view
                mainMenuView.displayMainMenuView();
                return;
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
            case "G": // get goal of game instructions
                this.goalOfGame();
                break;
            case "M": // how to move instructions
                this.howToMove();
                break;
            case "E": // estimate resource instructions
                this.estimateResource();
                break;
            case "H": // collect inventory instructions
                this.collectInventory();
                break;
            default:
                System.out.println("\n*** Invalid selection ***"
                        + " Please select a valid display option ***");
                break;

        }
        return false;
    }

    private void goalOfGame() {
        System.out.println(
                "\n*******************************************************"
                + "\n*                                                     *"
                + "\n* Insert GOAL OF GAME help language here              *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*******************************************************"
        );
    }

    private void howToMove() {
        System.out.println(
                "\n*******************************************************"
                + "\n*                                                     *"
                + "\n* Insert HOW TO MOVE help language here               *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*******************************************************"
        );
    }

    private void estimateResource() {
        System.out.println(
                "\n*******************************************************"
                + "\n*                                                     *"
                + "\n* Insert ESTIMATE RESOURCE help language here         *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*******************************************************"
        );
    }

    private void collectInventory() {
                System.out.println(
                "\n*******************************************************"
                + "\n*                                                     *"
                + "\n* Insert COLLECT INVENTORY help language here         *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*                                                     *"
                + "\n*******************************************************"
        );
    }

}
