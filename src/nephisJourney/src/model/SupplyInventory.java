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
public class SupplyInventory implements Serializable{
    
    //class instance variables
    private String InventoryType;
    private int quantityInStock;
    private int requiredAmount;

    public SupplyInventory() {
    }
    
    

    public String getInventoryType() {
        return InventoryType;
    }

    public void setInventoryType(String InventoryType) {
        this.InventoryType = InventoryType;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public int getRequiredAmount() {
        return requiredAmount;
    }

    public void setRequiredAmount(int requiredAmount) {
        this.requiredAmount = requiredAmount;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.InventoryType);
        hash = 17 * hash + this.quantityInStock;
        hash = 17 * hash + this.requiredAmount;
        return hash;
    }

    @Override
    public String toString() {
        return "SupplyInventory{" + "InventoryType=" + InventoryType + ", quantityInStock=" + quantityInStock + ", requiredAmount=" + requiredAmount + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SupplyInventory other = (SupplyInventory) obj;
        if (!Objects.equals(this.InventoryType, other.InventoryType)) {
            return false;
        }
        if (this.quantityInStock != other.quantityInStock) {
            return false;
        }
        if (this.requiredAmount != other.requiredAmount) {
            return false;
        }
        return true;
    }

    public void setDescription(String plates_Of_Brass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
