package nephisJourney.src.view;

import java.util.Scanner;
import nephisJourney.NephisJourney;
import nephisJourney.src.control.TreasureControl;

/**
 *
 * @author Jenaca
 */
public class CollectTreasureView extends View {
    //promptMessage = "Please select from the following options: "
    // extended from View.java
    
    private String promptMessage;
    

    public CollectTreasureView() {
        super(
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
    
    @Override
    public void display() {

        boolean done = false; // set flag to not done
        do {
            // prompt for and get user's menu option
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) // user wants to quit
            {
                //Create gameMenuView object when user 
                //quits collect treasure menu
                GameMenuView gameMenuView = new GameMenuView();

                //display game menu 
                gameMenuView.displayMenu();
                return; // exit view
            }
            // do the requested action and display the next view
            done = this.doAction(value);

        } while (!done);
    }
    
   @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); // convert choice to upper case

        switch (value) {
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

    protected void collectJewelry() {
        System.out.println("\nPlease enter how many pieces of jewelry "
                + "you wish to collect: ");
        JewelryView jewelryView = new JewelryView();
                 
        jewelryView.displayJewelryView();
    }

    private void collectGems() {
        System.out.println("\nPlease enter how many precious gems "
                + "you wish to collect: ");
        GemsView gemsView = new GemsView();
                 
        gemsView.displayGemsView();
    }

    private void collectTableware() {
        System.out.println("\nPlease enter how many pieces of fine "
                + "tableware you wish to collect: ");
        TablewareView tablewareView = new TablewareView();
                 
        tablewareView.displayTablewareView();
    }

    private void collectSilver() {
        System.out.println("\nPlease enter how many pieces of silver "
                + "you wish to collect: ");
        SilverView silverView = new SilverView();
                 
        silverView.displaySilverView();
    }

    private void collectGold() {
        System.out.println("\nPlease enter how many bars of gold "
                + "you wish to collect: ");
        GoldView goldView = new GoldView();
                 
        goldView.displayGoldView();
    }

    private void calcTreasureWeight() {
        System.out.println("\n total treasure weight called: ");
        //System.out.println("\nThis will calculate total treasure weight: ");
        //TreasureView treasureView = new TreasureView();
                 
        //treasureView.displayTreasureView();
}
}
