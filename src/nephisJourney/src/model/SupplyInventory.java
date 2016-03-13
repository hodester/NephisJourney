package nephisJourney.src.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author adamh_000
 */
public class SupplyInventory implements Serializable{
    
    //class instance variables
    private String inventoryType;
    private int quantityInStock;
    private int requiredAmount;
    private String description;

    public SupplyInventory() {
    }
    
    public SupplyInventory( String inventoryType, String description, int quantityInStock, int requiredAmount) {
        this.inventoryType = inventoryType;
        this.description = description;
        this.quantityInStock = quantityInStock;
        this.requiredAmount = requiredAmount;
    }
    

    public String getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public double getQuantityInStock() {
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
    public String toString() {
        return "SupplyInventory{" + "description=" + description + ", InventoryType=" + inventoryType + ", quantityInStock=" + quantityInStock + ", requiredAmount=" + requiredAmount + '}';
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.inventoryType);
         hash = 17 * hash + Objects.hashCode(this.description);
        hash = 17 * hash + this.quantityInStock;
        hash = 17 * hash + this.requiredAmount;
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
        final SupplyInventory other = (SupplyInventory) obj;
        if (!Objects.equals(this.inventoryType, other.inventoryType)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
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

    
    
    
    
}
