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
 * @author adamh_000
 */
public class Hunting implements Serializable {
   
    // Class instance variables
    private double totalWeight;
    private int foodQuantity;
    private double Weight;
    private String description;

    public Hunting() {
    }
    
    
    
    public double getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }

    public int getFoodQuantity() {
        return foodQuantity;
    }

    public void setFoodQuantity(int foodQuantity) {
        this.foodQuantity = foodQuantity;
    }

    public double getWeight() {
        return Weight;
    }

    public void setWeight(double Weight) {
        this.Weight = Weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.totalWeight) ^ (Double.doubleToLongBits(this.totalWeight) >>> 32));
        hash = 29 * hash + this.foodQuantity;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.Weight) ^ (Double.doubleToLongBits(this.Weight) >>> 32));
        hash = 29 * hash + Objects.hashCode(this.description);
        return hash;
    }

    @Override
    
    
    
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Hunting other = (Hunting) obj;
        if (Double.doubleToLongBits(this.totalWeight) != Double.doubleToLongBits(other.totalWeight)) {
            return false;
        }
        if (this.foodQuantity != other.foodQuantity) {
            return false;
        }
        if (Double.doubleToLongBits(this.Weight) != Double.doubleToLongBits(other.Weight)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Hunting{" + "totalWeight=" + totalWeight + ", foodQuantity=" + foodQuantity + ", Weight=" + Weight + ", description=" + description + '}';
    }
    
}
