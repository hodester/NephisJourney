package nephisJourney.src.control;

import nephisJourney.NephisJourney;
import nephisJourney.src.exceptions.InventoryControlException;

/**
 *
 * @author Jenaca
 */
public class TreasureControl {

    public static int calcJewelryWeight(int numJewelry) 
            throws InventoryControlException {

        int jewelryWeight = numJewelry * 2;
        
        if (jewelryWeight < 0 || jewelryWeight > 50) {
            // weight cannot be negative or over 50 lbs
            // option to exit Lehi's house or return
            // to collect more.
        }
        return jewelryWeight;
    }

    public static int calcGemsWeight(int numGems) 
            throws InventoryControlException {

        int gemsWeight = numGems * 1;

        if (gemsWeight < 0 || gemsWeight > 50) {
              // weight cannot be negative or over 50 lbs
            // option to exit Lehi's house or return
            // to collect more.
        }

        return gemsWeight;
    }

    public static int calcTablewareWeight(int numTableware)
            throws InventoryControlException {

        int tablewareWeight = numTableware * 5;

        if (tablewareWeight < 0 || tablewareWeight > 50) {
              // weight cannot be negative or over 50 lbs
            // option to exit Lehi's house or return
            // to collect more.
        }

        return tablewareWeight;
    }

    public static int calcSilverWeight(int numSilver)
            throws InventoryControlException {

        int silverWeight = numSilver * 2;

        if (silverWeight < 0 || silverWeight > 50) {
              // weight cannot be negative or over 50 lbs  
            // option to exit Lehi's house or return
            // to collect more.
        }

        return silverWeight;
    }

    public static int calcGoldWeight(int numGold) 
            throws InventoryControlException {

        int goldWeight = numGold * 10;

        if (goldWeight < 0 || goldWeight > 50) {
              // weight cannot be negative or over 50 lbs
            // option to exit Lehi's house or return
            // to collect more.
        }

        return goldWeight;
    }

    public static int calcTreasureWeight(int jewelryWeight, int gemsWeight,
            int tablewareWeight, int silverWeight, int goldWeight) 
            throws InventoryControlException {

        int totalTreasureWeight = (jewelryWeight + gemsWeight
                + tablewareWeight + silverWeight + goldWeight);

        if (totalTreasureWeight != 50) {
              //weight must be exactly 50 lbs.
            // option to exit Lehi's house or return 
            // to collect more.
        }

        return totalTreasureWeight;

    }

}
