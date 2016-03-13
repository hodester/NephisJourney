package nephisJourney.src.model;

import java.io.Serializable;
import java.util.ArrayList;
import javafx.scene.Scene;

/**
 *
 * @author Jenaca
 */
public class Location implements Serializable {

    // class instance variables
    protected int row;
    protected int column;
    protected boolean visited;
    public String getMapSymbol;
    protected int amountRemaining;
    private Scene scene;
    private ArrayList<Actor> actors;
    private String mapSymbol;
    private String description;
    private boolean blocked;

    public Location() {
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public String getGetMapSymbol() {
        return getMapSymbol;
    }

    public void setGetMapSymbol(String getMapSymbol) {
        this.getMapSymbol = getMapSymbol;
    }

    public int getAmountRemaining() {
        return amountRemaining;
    }

    public void setAmountRemaining(int amountRemaining) {
        this.amountRemaining = amountRemaining;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + this.row;
        hash = 23 * hash + this.column;
        hash = 23 * hash + (this.visited ? 1 : 0);
        hash = 23 * hash + this.amountRemaining;
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
        final Location other = (Location) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (this.visited != other.visited) {
            return false;
        }
        if (this.amountRemaining != other.amountRemaining) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", visited=" + visited + ", amountRemaining=" + amountRemaining + '}';
    }

    public void setScene(Scene scene) {
        System.out.println("\n*** setScene stub function called ***");

    }

    public Scene getScene() {
        System.out.println("\n*** getScene stub function called ***");
        return null;
    }

    public boolean getMapSymbol() {
        System.out.println("\n***getMapSymbol stub function called ***");
        return false;
    }
    
    public void setMapSymbol(String mapSymbol) {
        this.mapSymbol = mapSymbol;
    }
    
     public void setDescription(String description) {
        this.description = description;
    }
     
     public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

  

}
