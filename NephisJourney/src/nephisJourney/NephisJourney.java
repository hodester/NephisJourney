/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nephisJourney;

import nephisJourney.src.model.Player;

/**
 *
 * @author Jenaca
 */
public class NephisJourney {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Nephi");
        playerOne.setHighScore(525600);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
    }
    
}
