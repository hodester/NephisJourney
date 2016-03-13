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
    private Scene scene;
    private ArrayList<Actor> actors;

    /*private String mapSymbol;
    private String description;
    private boolean blocked;
    public String getMapSymbol;
    protected int amountRemaining;*/

    public Location(int row, int column, Scene scene, ArrayList<Actor> actors) {
        this.row = row;
        this.column = column;
        this.visited = false;
        this.scene = scene;
        this.actors = actors;
    }

    public Location() {
        this.actors = new ArrayList<Actor>();
    }

    public Location(int row, int column) {
        this.row = row;
        this.column = column;
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

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public ArrayList<Actor> getActors() {
        return actors;
    }

    public void setActors(ArrayList<Actor> actors) {
        this.actors = actors;
    }

    public void removeActor(Actor actor) {
        if (actor == null) {
            return;
        }
        this.actors.remove(actor);
    }

    public void addActor(Actor actor) {
        if (actor == null || this.actors.contains(actor)) {
            return;
        }

        this.actors.add(actor);
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + this.row;
        hash = 67 * hash + this.column;
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
        final Location other = (Location) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        return true;
    }

    public void setAmountRemaining(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean getMapSymbol() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



}
