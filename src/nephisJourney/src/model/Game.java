/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nephisJourney.src.model;

import java.io.Serializable;

/**
 *
 * @author Hodes
 */
public class Game implements Serializable{
    //Class instance Variables
    private int highScore;
    private int noPeople;
    private Player player;
    private SupplyInventory[] inventory;
    private Actor[] actor;
    private Location[] map;
    private LiahonaReferences[] liahona;
    
    public Game() {
    }

    public int getHighScore() {
        return highScore;
    }

    public void setHighScore(int highScore) {
        this.highScore = highScore;
    }

    public int getNoPeople() {
        return noPeople;
    }

    public void setNoPeople(int noPeople) {
        this.noPeople = noPeople;
    }  
    
     public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.highScore;
        hash = 97 * hash + this.noPeople;
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
        if (this.noPeople != other.noPeople) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "highScore=" + highScore + ", noPeople=" + noPeople + '}';
    }
    
    
    
    
}
