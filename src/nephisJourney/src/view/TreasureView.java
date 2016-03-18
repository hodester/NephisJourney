package nephisJourney.src.view;

import java.util.Scanner;
import nephisJourney.NephisJourney;
import nephisJourney.src.control.TreasureControl;
import nephisJourney.src.exceptions.InventoryControlException;

/**
 *
 * @author Jenaca
 */
public class TreasureView {

    protected String promptMessage;

    public TreasureView() {
        this.promptMessage = "\nLet's see how much your treasure weighs: ";
    }

    private void doAction (int jewelryWeight, int gemsWeight,
            int tablewareWeight, int silverWeight, int goldWeight) 
            throws InventoryControlException {
        try {
        
        // call treasure control to calculate treasureWeight
        TreasureControl.calcTreasureWeight(jewelryWeight, gemsWeight,
                 tablewareWeight, silverWeight, goldWeight);
        } catch (InventoryControlException ie) {
        throw new InventoryControlException("Weight must not be"
                + " less than 0 lbs or greater than 50 lbs.");
        }
        
        // display total treasure weight
        System.out.println(TreasureControl.calcTreasureWeight(jewelryWeight,
                 gemsWeight, tablewareWeight, silverWeight, goldWeight));
        
    }

}
