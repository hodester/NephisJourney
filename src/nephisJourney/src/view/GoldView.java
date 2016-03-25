package nephisJourney.src.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import nephisJourney.NephisJourney;
import nephisJourney.src.control.TreasureControl;
import nephisJourney.src.exceptions.InventoryControlException;

/**
 *
 * @author Jenaca
 */
public class GoldView {

    private String promptMessage;
    protected final BufferedReader keyboard = NephisJourney.getInFile();
    protected final PrintWriter console = NephisJourney.getOutFile();
    
    public GoldView() {
        this.promptMessage = "\nLet's see how much your gold weighs: ";
    }

    public void displayGoldView() 
            throws InventoryControlException {
        boolean done = false; // set flag to not done
        do {
            // prompt for and get number of bars of gold
            String numGold = this.getNumGold();
            if (numGold.length() == 0) // user wants to quit
            {
                //Create collectTreasureView object 
                //when user quits inventory view
                //display collectTreasureView and exit the inventory view
                CollectTreasureView collectTreasureView
                        = new CollectTreasureView();
                return; // exit the inventory view
            } else {
            }
            // do the requested action and display the next view
            done = this.doAction(numGold.length());

        } while (!done);
    }

    public String getNumGold() 
            throws InventoryControlException {
        //Scanner in = new Scanner(System.in);
        //int value = in.nextInt();
        boolean valid = false; //initialize to not valid
        String selection = null;
        try {
        while (!valid) { //loop while an invalid value is enter
            System.out.println("\n" + this.promptMessage);

            if (selection.length() < 1) { //value is blank
                System.out.println("\nInvalid value: value cannot be blank");
                break;
            }
            if (selection.length() > 5) { //value is too high
                System.out.println("\nInvalid value: Please enter how many "
                        + "bars of gold you would like to collect.");
                break;
            }
            break; //end the loop
        }
        }catch (Exception e) {
            System.out.println("Error reading input: " + e.getMessage());
        }

        return selection; //return the value entered

    }

    private boolean doAction(int numGold) 
            throws InventoryControlException {
        // call treasure control to calculate goldWeight
        TreasureControl.calcGoldWeight(numGold);
        
        // display gold weight
        System.out.println(TreasureControl.calcGoldWeight(numGold));
        return true;
    }

}
