/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nephisJourney.src.view;

import java.util.Scanner;
import nephisJourney.NephisJourney;
import nephisJourney.src.control.GameControl;

/**
 *
 * @author Hodes
 */
public class MainMenuView {

    //promptMessage = "Please select from the following options: "
    private String promptMessage;

    public MainMenuView() {

        this.promptMessage = "\nPlease select the letter corresponding "
                + "to the menu item: ";

        //display the menu when the view is created
        this.displayMenu();
    }

    public void displayMenu() {

        System.out.println(
                "\n"
                + "\n--------------------------------------------"
                + "\n|Main Menu                                 |"
                + "\n--------------------------------------------"
                + "\nN - Start new game"
                + "\nG - Get and start saved game"
                + "\nH - Get help on how to play the game"
                + "\nS - Save game"
                + "\nR - Reference Menu"
                + "\nL - Location List"
                + "\nQ - Quit"
                + "\n--------------------------------------------");

    }

    public void displayMainMenuView() {

        boolean done = false; // set flag to not done
        do {
            // prompt for and get user's menu option
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) // user wants to quit
            {
                return; // exit the game
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
            case "N": // create and start a new game
                this.startNewGame();
                break;
            case "G": // get and start an existing game
                this.startExistingGame();
                break;
            case "H": // display the help menu
                this.displayHelpMenu();
                break;
            case "S": // save the current game
                this.saveGame();
                break;
            case "R": // display Reference Menu
                this.displayReferenceMenu();
                break;
            case "L": // display Location list
                this.displayLocationList();
                break;
            default:
                System.out.println("\n*** Invalid selection ***"
                        + " Please select a valid display option ***");
                break;

        }
        return false;

    }

    private void startNewGame() {
        // create a new game
        GameControl.createNewGame(NephisJourney.getPlayer());

        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();

        //Create gameMenuView object
        GameMenuView gameMenuView = new GameMenuView();

        //Display the game menu view
        gameMenuView.displayGameMenuView();
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame function was called ***");
    }

    private void displayHelpMenu() {
        //Create helpMenuView object
        HelpMenuView helpMenuView = new HelpMenuView();

        //Display the help menu view
        helpMenuView.displayHelpMenuView();
    }

    private void saveGame() {
        System.out.println("*** saveGame function was called ***");
    }

    private void displayReferenceMenu() {
        System.out.println("*** displayReference function was called ***");
    }

    private void displayLocationList() {
        System.out.println("*** displayLocation function was called ***");
    }
}
