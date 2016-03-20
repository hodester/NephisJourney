package nephisJourney.src.view;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import nephisJourney.NephisJourney;
import nephisJourney.src.control.TreasureControl;
import nephisJourney.src.exceptions.InventoryControlException;

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
               /* gameMenuView.MainMenuView();*/
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
            case "J": {
            try {
                // Jewelry
                this.collectJewelry();
            } catch (InventoryControlException ie) {
                System.out.println("\nPlease enter a valid number of pieces: ");
                Logger.getLogger(CollectTreasureView.class.getName()).log(Level.SEVERE, null, ie);
            }
        }
                break;
            case "P": {
            try {
                // Precious gems
                this.collectGems();
            } catch (InventoryControlException ex) {
                System.out.println("\nPlease enter a valid number of gems: ");
                Logger.getLogger(CollectTreasureView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
            case "T": {
            try {
                // Fine tableware
                this.collectTableware();
            } catch (InventoryControlException ex) {
                System.out.println("\nPlease enter a valid number of pieces: ");
                Logger.getLogger(CollectTreasureView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
            case "S": {
            try {
                // Silver coins
                this.collectSilver();
            } catch (InventoryControlException ex) {
                System.out.println("\nPlease enter a valid number of pieces: ");
                Logger.getLogger(CollectTreasureView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                break;
            case "G": {
            try {
                // Gold coins
                this.collectGold();
            } catch (InventoryControlException ex) {
                System.out.println("\nPlease enter a valid number of pieces: ");
                Logger.getLogger(CollectTreasureView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
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

    protected void collectJewelry() throws InventoryControlException {
        System.out.println("\nPlease enter how many pieces of jewelry "
                + "you wish to collect: ");
        JewelryView jewelryView = new JewelryView();
                 
        jewelryView.displayJewelryView();
    }

    private void collectGems() throws InventoryControlException {
        System.out.println("\nPlease enter how many precious gems "
                + "you wish to collect: ");
        GemsView gemsView = new GemsView();
                 
        gemsView.displayGemsView();
    }

    private void collectTableware() throws InventoryControlException {
        System.out.println("\nPlease enter how many pieces of fine "
                + "tableware you wish to collect: ");
        TablewareView tablewareView = new TablewareView();
                 
        tablewareView.displayTablewareView();
    }

    private void collectSilver() throws InventoryControlException {
        System.out.println("\nPlease enter how many pieces of silver "
                + "you wish to collect: ");
        SilverView silverView = new SilverView();
                 
        silverView.displaySilverView();
    }

    private void collectGold() throws InventoryControlException {
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
