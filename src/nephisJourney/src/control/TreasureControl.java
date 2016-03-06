package nephisJourney.src.control;

import nephisJourney.NephisJourney;

/**
 *
 * @author Jenaca
 */
public class TreasureControl {

    public static int calcJewelryWeight(int numJewelry) {

        int jewelryWeight = numJewelry * 2;

        if (jewelryWeight < 0 || jewelryWeight > 50) {
            return -1;  // weight cannot be negative or over 50 lbs
            // option to exit Lehi's house or return
            // to collect more.
        }

        return jewelryWeight;
    }

    public static int calcGemsWeight(int numGems) {

        int gemsWeight = numGems * 1;

        if (gemsWeight < 0 || gemsWeight > 50) {
            return -1;  // weight cannot be negative or over 50 lbs
            // option to exit Lehi's house or return
            // to collect more.
        }

        return gemsWeight;
    }

    public static int calcTablewareWeight(int numTableware) {

        int tablewareWeight = numTableware * 5;

        if (tablewareWeight < 0 || tablewareWeight > 50) {
            return -1;  // weight cannot be negative or over 50 lbs
            // option to exit Lehi's house or return
            // to collect more.
        }

        return tablewareWeight;
    }

    public static int calcSilverWeight(int numSilver) {

        int silverWeight = numSilver * 2;

        if (silverWeight < 0 || silverWeight > 50) {
            return -1;  // weight cannot be negative or over 50 lbs  
            // option to exit Lehi's house or return
            // to collect more.
        }

        return silverWeight;
    }

    public static int calcGoldWeight(int numGold) {

        int goldWeight = numGold * 10;

        if (goldWeight < 0 || goldWeight > 50) {
            return -1;  // weight cannot be negative or over 50 lbs
            // option to exit Lehi's house or return
            // to collect more.
        }

        return goldWeight;
    }

    public static int calcTreasureWeight(int jewelryWeight, int gemsWeight,
            int tablewareWeight, int silverWeight, int goldWeight) {

        int totalTreasureWeight = (jewelryWeight + gemsWeight
                + tablewareWeight + silverWeight + goldWeight);

        if (totalTreasureWeight != 50) {
            return -1;  //weight must be exactly 50 lbs.
            // option to exit Lehi's house or return 
            // to collect more.
        }

        return totalTreasureWeight;

    }

}
