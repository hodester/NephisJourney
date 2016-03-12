/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nephisJourney.src.enums;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author adamh_000
 */
public enum Actor implements Serializable {

    Lehi("Prophet and leader of the family"),
    Sariah("Mother of Nephi"),
    Laman("One bad dude"),
    Lemuel("Follower of Laman"),
    Nephi("Our hero and son of Lehi"),
    Jacob("The smart brother who joined Nephi"),
    Sam("Brother of Nephi"),
    NephisWife("Married our hero"),
    Zoram("Roped in by Nephi..."),
    LamansWife("Picked the last one left...");

    private final String description;
    private final Point coordinates;

    Actor(String description) {
        this.description = description;
        coordinates = new Point(1, 1);
        
    }
   
    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    public void setName(String lehi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setDescription(String father_of_Nephi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCoordinates(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}