package nephisJourney.src.model;

import java.util.Objects;
import nephisJourney.src.enums.Item;
import nephisJourney.src.view.ErrorView;

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

/*    @Override
    public void setRow(int i) {
         ErrorView.display(this.getClass().getName(),
                 "error message - ResourceScene");
    }

    @Override
    public void setColumn(int i) {
        ErrorView.display(this.getClass().getName(),
                 "error message - ResourceScene");
    }

    @Override
    public void setVisited(boolean b) {
        ErrorView.display(this.getClass().getName(),
                 "error message - ResourceScene");
    }

    @Override
    public void setAmountRemaining(int i) {
        ErrorView.display(this.getClass().getName(),
                 "error message - ResourceScene");
    }
*/
    public void setResourceType(String treasure) {
        ErrorView.display(this.getClass().getName(),
                 "error message - ResourceScene");
    }
    
}
