/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nephisJourney.src.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Jenaca
 */
public class WarehouseSceneType extends Location {
    
    // class instance variables
    private String description;
    private float travelTime;
    private boolean blocked;
    private int noOfItems;

    public WarehouseSceneType() {
    }
    
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(float travelTime) {
        this.travelTime = travelTime;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public int getNoOfItems() {
        return noOfItems;
    }

    public void setNoOfItems(int noOfItems) {
        this.noOfItems = noOfItems;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + Objects.hashCode(this.description);
        hash = 61 * hash + Float.floatToIntBits(this.travelTime);
        hash = 61 * hash + (this.blocked ? 1 : 0);
        hash = 61 * hash + this.noOfItems;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final WarehouseSceneType other = (WarehouseSceneType) obj;
        if (Float.floatToIntBits(this.travelTime) != Float.floatToIntBits(other.travelTime)) {
            return false;
        }
        if (this.blocked != other.blocked) {
            return false;
        }
        if (this.noOfItems != other.noOfItems) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "WarehouseSceneType{" + "row=" + row + ", column=" + column + ", visited=" + visited + ", amountRemaining=" + amountRemaining + ", description=" + description + ", travelTime=" + travelTime + ", blocked=" + blocked + ", noOfItems=" + noOfItems + '}';
    }
    
    
    
    
}
