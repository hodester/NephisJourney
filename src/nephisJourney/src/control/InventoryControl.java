package nephisJourney.src.control;

import nephisJourney.NephisJourney;

/**
 *
 * @author Jenaca
 */
public class InventoryControl {

          
    public int calcJewelryWeight (int numJewelry) {
            
            int jewelryWeight = numJewelry * 2;
                                                
            if (jewelryWeight < 0 || jewelryWeight > 50) {
                    return -1;  // weight cannot be negative or over 50 lbs
                                // option to exit Lehi's house or return
                                // to collect more.
      }
            
        return jewelryWeight;
    }
    
    public int calcGemWeight (int numGems) {
            
            int gemWeight = numGems * 1;
            
            if (gemWeight < 0 || gemWeight > 50){
                return -1;  // weight cannot be negative or over 50 lbs
                            // option to exit Lehi's house or return
                            // to collect more.
            }

        return gemWeight;
    }

    public int calcTablewareWeight (int numTableware) {
            
            int tablewareWeight = numTableware * 4;
            
            if (tablewareWeight < 0 || tablewareWeight > 50){
                return -1;  // weight cannot be negative or over 50 lbs
                            // option to exit Lehi's house or return
                            // to collect more.
            }

        return tablewareWeight;
    }
    
    public double calcSilverWeight (double numSilver) {
    
            double silverWeight = numSilver * 0.5;
            
            if (silverWeight < 0 || silverWeight > 50){
                return -1;  // weight cannot be negative or over 50 lbs  
                            // option to exit Lehi's house or return
                            // to collect more.
            }

        return silverWeight;
    }

    public int calcGoldWeight (int numGold) {
            
            int goldWeight = numGold * 1;
            
            if (goldWeight < 0 || goldWeight > 50){
                return -1;  // weight cannot be negative or over 50 lbs
                            // option to exit Lehi's house or return
                            // to collect more.
            }

        return goldWeight;
    }
    
    public int calcTreasureWeight (int jewelryWeight, int gemWeight,
                int tablewareWeight, double silverWeight, int goldWeight) {

            int totalTreasureWeight = (int) (jewelryWeight + gemWeight +
                tablewareWeight + silverWeight + goldWeight);
            
            if (totalTreasureWeight != 50) {
                return -1;  //weight must be exactly 50 lbs.
                            // option to exit Lehi's house or return 
                            // to collect more.
            }
            
        return totalTreasureWeight;
    }
}
