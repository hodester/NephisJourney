package nephisJourney.src.view;

import java.util.Scanner;
import nephisJourney.NephisJourney;
import nephisJourney.src.control.TreasureControl;
import java.lang.Character;
import nephisJourney.src.exceptions.InventoryControlException;

/**
 *
 * @author Jenaca
 */
public class TablewareView {

    protected String promptMessage;

    public TablewareView() {
        this.promptMessage = "\nLet's see how much your tableware weighs: ";
    }

    public void displayTablewareView() 
            throws InventoryControlException {
        boolean done = false; // set flag to not done
        do {
            // prompt for and get number of pieces of tableware
            int numTableware = this.getNumTableware();
            if (numTableware == 0) // user wants to quit
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
            done = this.doAction(numTableware);

        } while (!done);
    }

    public int getNumTableware() 
            throws InventoryControlException {
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();
        boolean valid = false; //initialize to not valid

    while (!valid) { //loop while an invalid value or char is entered
            System.out.println("\n" + this.promptMessage);
        
        // if the selection is invalid (is not an integer)
        //if (!Character.isDigit(value)) { //check for integer.
        //    System.out.println("Please enter a positive integer.");
        //    continue; // and repeat again 
        //}
           
        if (value < 1) { //value is blank
            System.out.println("\nInvalid value: value cannot be blank");
            continue;
        }
        if (value > 10) { //value is too high
            System.out.println("\nInvalid value: Please enter how many "
                    + "pieces of tableware you would like to collect.");
            continue;
        }
        break; //end the loop
    }

    return value ; //return the value entered

}

private boolean doAction(int numTableware)
        throws InventoryControlException {
        // call treasure control to calculate tablewareWeight
        TreasureControl.calcTablewareWeight(numTableware);
        
        // display tableware weight
        System.out.println(TreasureControl.calcTablewareWeight(numTableware));
        return true;
    }

}
