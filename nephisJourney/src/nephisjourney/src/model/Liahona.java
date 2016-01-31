/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nephisjourney.src.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Hodes
 */
public class Liahona implements Serializable{
    
    //class instance variable
    private String description;
    private String additionalInformation;

    public Liahona() {
    }

    
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.description);
        hash = 71 * hash + Objects.hashCode(this.additionalInformation);
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
        final Liahona other = (Liahona) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.additionalInformation, other.additionalInformation)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Liahona{" + "description=" + description + ", additionalInformation=" + additionalInformation + '}';
    }
    
    
    
}
