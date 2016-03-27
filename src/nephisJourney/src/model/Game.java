package nephisJourney.src.model;

import nephisJourney.src.enums.Actor;
import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author Hodes
 */
public class Game implements Serializable{
    //Class instance Variables
    private int highScore;
    private int numPeople;
    private Player player;
    private SupplyInventory[] inventory;
    private Point[] actorLocation = new Point[Actor.values().length];
    /*private Actor[] actor;*/
    private Map map;
    private LiahonaReferences[] liahona;
    
    public Game() {
    }

    public int getHighScore() {
        return highScore;
    }

    public void setHighScore(int highScore) {
        this.highScore = highScore;
    }

    public int getNumPeople() {
        return numPeople;
    }

    public void setNumPeople(int numPeople) {
        this.numPeople = numPeople;
    }  
    
     public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    
    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }
    
    public SupplyInventory[] getInventory() {
        return inventory;
    }

    public void setInventory(SupplyInventory[] inventory) {
        this.inventory = inventory;
    }

    public LiahonaReferences[] getLiahona() {
        return liahona;
    }

    public void setLiahona(LiahonaReferences[] liahona) {
        this.liahona = liahona;
    }
    
    public Point[] getActorsLocation() {
        return actorLocation;
    }

    public void setActorsLocation(Point[] actorsLocation) {
        this.actorLocation = actorsLocation;
    }
    
    /*@Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.highScore;
        hash = 97 * hash + this.numPeople;
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
        final Game other = (Game) obj;
        if (this.highScore != other.highScore) {
            return false;
        }
        if (this.numPeople != other.numPeople) {
            return false;
        }
        return true;
    }*/

    @Override
    public String toString() {
        return "Game{" + "highScore=" + highScore + ", player=" + player.toString() + '}';
    }

    /*public void setInventory(SupplyInventory[] inventory) {
        this.inventory = inventory;
    }

    public void setMap(Map map) {
        System.out.println("*** setMap function was called ***");
    }*/

    
}
