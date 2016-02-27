/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nephisJourney.src.view;

import java.util.Scanner;
import nephisJourney.NephisJourney;
import nephisJourney.src.control.ShipControl;

/**
 *
 * @author Hodes
 */
public class ShipLoadingView {
        //promptMessage = "Please select from the following options: "

    private String promptMessage;

    public ShipLoadingView() {
        this.promptMessage = "\nPlease select the letter corresponding "
                + "to the menu item: ";
    }

    public void displayMenu() {
        System.out.println(
                "\n"
                + "\n--------------------------------------------"
                + "\n|Ship Loading Menu                                 |"
                + "\n--------------------------------------------"
                + "\nF - Food (Grains, Honey, etc.)"
                + "\nH - Horse"
                + "\nS - Sheep"
                + "\nC - Cow"
                + "\nA - Animal Feed"
                + "\nR - Chicken"
                + "\nM - Males"
                + "\nW - Females"
                + "\nQ - Quit"
                + "\n--------------------------------------------");

    }

    public void displayShipLoadingView() {

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
            case "F": // Jewelry
                this.getAmountOfFood();
                break;
            case "H": // Precious gems
                this.getNumHorse();
                break;
            case "S": // Fine tableware
                this.getNumSheep();
                break;
            case "C": // Silver coins
                this.getNumCow();
                break;
            case "A": // Gold coins
                this.getAmountOfAnimalFeed();
                break;
            case "R": // Calculate total treasure weight
                this.getNumChicken();
                break;
            case "M": // Gold coins
                this.getNumMales();
                break;
            case "W": // Calculate total treasure weight
                this.getNumFemales();
                break;
            default:
                System.out.println("\n*** Invalid selection ***"
                        + " Please select a valid display option ***");
                break;

        }
        return false;

    }

    private void getAmountOfFood() {
        System.out.println("\nHow many portions of Food you want "
                + "to take on the journey across the sea."
                + "\n1 portion is 1 square foot and 5 pounds");
    }

    private void getNumHorse() {
        System.out.println("\nHow many Horse(s) would you like to take?"
                + "\nA house takes up 30 square feet and weighs 850 pounds");
    }

    private void getNumSheep() {
        System.out.println("\nHow many sheep would you like to take?"
                + "\nA sheep takes up 10 square feet and weighs 100 pounds");
    }

    private void getNumCow() {
        System.out.println("\nHow many cow(s) would you like to take?"
                + "\nA house takes up 15 square feet and weighs 1600 pounds");
    }

    private void getAmountOfAnimalFeed() {
        System.out.println("\nHow many portions of Animal Feed you want "
                + "to take on the journey across the sea."
                + "\n1 portion is 5 square feet and 50 pounds");
    }

    private void getNumChicken() {
        System.out.println("\nHow many Chicken(s) would you like to take?"
                + "\nA house takes up 2 square feet and weighs 3 pounds");
    }

    private void getNumMales() {
        System.out.println("\nHow many Male(s) would you like to take?"
                + "\nA house takes up 35 square feet and weighs 180 pounds");
    }

    private void getNumFemales() {
        System.out.println("\nHow many Female(s) would you like to take?"
                + "\nA house takes up 35 square feet and weighs 130 pounds");
    }
}
