/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nephisjourney.src.model;

import java.io.Serializable;

/**
 *
 * @author Hodes
 */
public class Game implements Serializable{
    
    //class Instance variables
    private int highScore;
    private int noPeople;

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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + this.highScore;
        hash = 19 * hash + this.noPeople;
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

    public void setRow(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setColumn(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
