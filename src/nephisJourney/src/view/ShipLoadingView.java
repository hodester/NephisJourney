package nephisJourney.src.view;

import java.util.Scanner;
import nephisJourney.NephisJourney;
import nephisJourney.src.control.ShipControl;

/**
 *
 * @author Hodes
 */
public class ShipLoadingView extends View {
    //promptMessage = "Please select from the following options: "

    private String promptMessage;

    public ShipLoadingView() {
        super(
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

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); // convert choice to upper case

        switch (value) {
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
