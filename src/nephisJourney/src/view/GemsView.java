package nephisJourney.src.view;

import java.util.Scanner;
import nephisJourney.NephisJourney;
import nephisJourney.src.control.TreasureControl;
import nephisJourney.src.exceptions.InventoryControlException;

/**
 *
 * @author Jenaca
 */
public class GemsView {

    protected String promptMessage;

    public GemsView() {
        this.promptMessage = "\nLet's see how much your gems weigh: ";
    }

    public void displayGemsView() 
            throws InventoryControlException {
        boolean done = false; // set flag to not done
        do {
            // prompt for and get number of gems
            int numGems = this.getNumGems();
            if (numGems == 0) // user wants to quit
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
            done = this.doAction(numGems);

        } while (!done);
    }

    public int getNumGems()
            throws InventoryControlException {
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();
        boolean valid = false; //initialize to not valid

        while (!valid) { //loop while an invalid value is enter
            System.out.println("\n" + this.promptMessage);
            
            if (value < 1) { //value is blank
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
            if (value > 50) { //value is too high
                System.out.println("\nInvalid value: Please enter how many "
                        + " gems you would like to collect.");
                continue;
            }
            break; //end the loop
        }

        return value; //return the value entered

    }

    private boolean doAction(int numGems)
            throws InventoryControlException {
        // call treasure control to calculate gemsWeight
        TreasureControl.calcGemsWeight(numGems);
        
        // display gem weight
        System.out.println( TreasureControl.calcGemsWeight(numGems) );
        return true;
    }

}
