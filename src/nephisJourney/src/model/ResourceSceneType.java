package nephisJourney.src.model;

import java.util.Objects;
import nephisJourney.src.enums.Item;

/**
 *
 * @author Jenaca
 */
public class ResourceSceneType extends Scene {
    
    // class instance variables
    private int amountAvailable;
    private Item resourceType;

    public ResourceSceneType() {
    }
    
    public ResourceSceneType(String description,  String mapSymbol, double travelTime, boolean blocked, int amountAvailable, Item resourceType) {
        super(description, mapSymbol, travelTime, blocked);
        this.amountAvailable = amountAvailable;
        this.resourceType = resourceType;
    }

    public int getAmountAvailable() {
        return amountAvailable;
    }

    public void setAmountAvailable(int amountAvailable) {
        this.amountAvailable = amountAvailable;
    }

    public Item getResourceType() {
        return resourceType;
    }

    public void setResourceType(Item resourceType) {
        this.resourceType = resourceType;
    }

    public void setRow(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setColumn(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setVisited(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setAmountRemaining(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setResourceType(String treasure) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
