package nephisJourney.src.model;

import java.util.Objects;

/**
 *
 * @author Jenaca
 */
public class WarehouseSceneType extends Scene {
    
    // class instance variables
    private SupplyInventory[] itemsStored;

    public WarehouseSceneType() {
    }
    
    public WarehouseSceneType(String description, String mapSymbol, double travelTime, double capacity, SupplyInventory[] itemsStored) {
        super(description, mapSymbol, travelTime, true);
        this.itemsStored = itemsStored;
        
    }

    public SupplyInventory[] getItemsStored() {
        return itemsStored;
    }

    public void setItemsStored(SupplyInventory[] itemsStored) {
        this.itemsStored = itemsStored;
    }

    public void setNoOfItems(int i) {
        System.out.println("error message - WarehouseScene");
    }

    
    

}
