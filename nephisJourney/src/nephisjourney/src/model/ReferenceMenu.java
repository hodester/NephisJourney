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
public class ReferenceMenu implements Serializable{
    
    //class instance variables
    private String name;
    private String scriptureMenu;

    public ReferenceMenu() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.name);
        hash = 61 * hash + Objects.hashCode(this.scriptureMenu);
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
        final ReferenceMenu other = (ReferenceMenu) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.scriptureMenu, other.scriptureMenu)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ResourceMenu{" + "name=" + name + ", scriptureMenu=" + scriptureMenu + '}';
    }
 
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScriptureMenu() {
        return scriptureMenu;
    }

    public void setScriptureMenu(String scriptureMenu) {
        this.scriptureMenu = scriptureMenu;
    }

    public void setLocationOneScripture(String _Nephi_14) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
