package nephisJourney.src.view;

import java.util.Scanner;
import nephisJourney.NephisJourney;
import nephisJourney.src.control.TreasureControl;

/**
 *
 * @author Jenaca
 */
public class TreasureView {

    protected String promptMessage;

    public TreasureView() {
        this.promptMessage = "\nLet's see how much your treasure weighs: ";
    }

    private boolean doAction (int jewelryWeight, int gemsWeight,
            int tablewareWeight, int silverWeight, int goldWeight) {
        
        // call treasure control to calculate treasureWeight
        TreasureControl.calcTreasureWeight(jewelryWeight, gemsWeight,
                 tablewareWeight, silverWeight, goldWeight);
        // display total treasure weight
        System.out.println(TreasureControl.calcTreasureWeight(jewelryWeight,
                 gemsWeight, tablewareWeight, silverWeight, goldWeight));
        return true;
    }

}
