package nephisJourney.src.model;

import java.io.Serializable;
import java.util.Objects;
import nephisJourney.src.view.ErrorView;

/**
 *
 * @author Jenaca
 */
public class Scene implements Serializable {
    
    // class instance variables
    private String description;
    private String mapSymbol;
    private double travelTime;
    private boolean blocked;

    public Scene() {
    }
    
    public Scene(String description, String mapSymbol, double travelTime, boolean blocked) {
        this.description = description;
        this.mapSymbol = mapSymbol;
        this.travelTime = travelTime;
        this.blocked = blocked;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getMapSymbol() {
        return mapSymbol;
    }

    public void setMapSymbol(String mapSymbol) {
        this.mapSymbol = mapSymbol;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public void setRow(int i) {
        ErrorView.display(this.getClass().getName(),
                "error message - Scene");
    }

    public void setColumn(int i) {
        ErrorView.display(this.getClass().getName(),
                "error message - Scene");
    }

    public void setVisited(boolean b) {
        ErrorView.display(this.getClass().getName(),
                "error message - Scene");
    }

    public void setAmountRemaining(int i) {
        ErrorView.display(this.getClass().getName(),
                "error message - Scene");
    }

    
    
}
