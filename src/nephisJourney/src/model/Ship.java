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
public class Ship implements Serializable{
    
    //class instance varibles
    private String description;
    private int width;
    private int length;
    private int height;
    private int maxCapacity;

    public Ship() {
    }

        
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.description);
        hash = 71 * hash + this.width;
        hash = 71 * hash + this.length;
        hash = 71 * hash + this.height;
        hash = 71 * hash + this.maxCapacity;
        return hash;
    }

    @Override
    public String toString() {
        return "Ship{" + "description=" + description + ", width=" + width + ", length=" + length + ", height=" + height + ", maxCapacity=" + maxCapacity + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ship other = (Ship) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (this.width != other.width) {
            return false;
        }
        if (this.length != other.length) {
            return false;
        }
        if (this.height != other.height) {
            return false;
        }
        if (this.maxCapacity != other.maxCapacity) {
            return false;
        }
        return true;
    }
    
    
    
    
}
