package nephisJourney.src.view;

import java.util.Scanner;
import nephisJourney.NephisJourney;
import nephisJourney.src.control.TreasureControl;
import nephisJourney.src.exceptions.InventoryControlException;

/**
 *
 * @author Jenaca
 */
public class SilverView {

    protected String promptMessage;

    public SilverView() {
        this.promptMessage = "\nLet's see how much your silver weighs: ";
    }

    public void displaySilverView() 
            throws InventoryControlException {
        boolean done = false; // set flag to not done
        do {
            // prompt for and get number of pieces of silver
            int numSilver = this.getNumSilver();
            if (numSilver == 0) // user wants to quit
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
            done = this.doAction(numSilver);

        } while (!done);
    }

    public int getNumSilver()
            throws InventoryControlException {
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();
        boolean valid = false; //initialize to not valid

        while (!valid) { //loop while an invalid value is enter
            System.out.println("\n" + this.promptMessage);

            if (value < 1) { //value is blank
                System.out.println("\nInvalid value: value cannot be blank");
                break;
            }
            if (value > 25) { //value is too high
                System.out.println("\nInvalid value: Please enter how many "
                        + "pieces of silver you would like to collect.");
                break;
            }
            break; //end the loop
        }

        return value; //return the value entered

    }

    private boolean doAction(int numSilver)
            throws InventoryControlException {
        // call treasure control to calculate silverWeight
        TreasureControl.calcSilverWeight(numSilver);
        
        // display silver weight
        System.out.println(TreasureControl.calcSilverWeight(numSilver));
        return true;
    }

}