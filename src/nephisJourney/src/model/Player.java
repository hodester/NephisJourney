package nephisJourney.src.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Jenaca
 */
public class Player implements Serializable {
  
    // class instance variables
    private String name;
    private int highScore;
    private double maxWeight;
    
    public Player() {
    }

    public Player(String name, int highScore, double maxWeight) {
        this.name = name;
        this.highScore = highScore;
        this.maxWeight = maxWeight;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHighScore() {
        return highScore;
    }

    public void setHighScore(int highScore) {
        this.highScore = highScore;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }
    
    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", highScore=" + highScore +  "maxWeight=" + maxWeight + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.highScore) ^ (Double.doubleToLongBits(this.highScore) >>> 32));
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
        final Player other = (Player) obj;
        if (Double.doubleToLongBits(this.highScore) != Double.doubleToLongBits(other.highScore)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    
    
}
