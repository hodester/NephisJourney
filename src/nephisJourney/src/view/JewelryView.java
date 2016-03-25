package nephisJourney.src.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import nephisJourney.NephisJourney;
import nephisJourney.src.control.InventoryControl;
import nephisJourney.src.control.TreasureControl;
import nephisJourney.src.exceptions.InventoryControlException;

/**
 *
 * @author Jenaca
 */
public class JewelryView {

    private String promptMessage;
    protected final BufferedReader keyboard = NephisJourney.getInFile();
    protected final PrintWriter console = NephisJourney.getOutFile();
    
    public JewelryView() {
        this.promptMessage = "\nLet's see how much your jewelry weighs: ";
    }

    public void displayJewelryView()
            throws InventoryControlException{
        boolean done = false; // set flag to not done
        do {
            // prompt for and get number of pieces of jewelry
            String numJewelry = this.getNumJewelry();
            if (numJewelry.length() == 0) // user wants to quit
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
            done = this.doAction(numJewelry.length());

        } while (!done);
    }

    public String getNumJewelry () 
            throws InventoryControlException {
        
        //Scanner in = new Scanner(System.in);
        //int selection = in.nextInt();
        boolean valid = false; //initialize to not valid
        String selection = null;
        try {
        while (!valid) { //loop while an invalid value is enter
            System.out.println("\n" + this.promptMessage);
            selection = this.keyboard.readLine();
            selection = selection.trim();
            
          if (selection.length() < 1) { //value is blank
               System.out.println("\nInvalid value: value cannot be blank");
                break;
            }
            else if (selection.length() > 25) { //value is too high
               System.out.println("\nInvalid value: Please enter how many "
                        + "pieces of jewelry you would like to collect.");
                break;
            }
            break; //end the loop
        }
        } catch (Exception e) {
            System.out.println("Error reading input: " + e.getMessage());
            }
        return selection;
    }

    private boolean doAction(int numJewelry) 
            throws InventoryControlException {
        
        try {
        // call treasure control to calculate jewelryWeight
        TreasureControl.calcJewelryWeight(numJewelry);
        
        // display jewelry weight
        System.out.println(TreasureControl.calcJewelryWeight(numJewelry));
        } catch(InventoryControlException ie){
            System.out.println("\nInvalid value: Error thrown.");
        }
        return true;
    }

}
