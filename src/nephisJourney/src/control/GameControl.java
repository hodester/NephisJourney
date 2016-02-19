/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nephisJourney.src.control;

import nephisJourney.NephisJourney;
import nephisJourney.src.model.Player;

/**
 *
 * @author Jenaca
 */
public class GameControl {

    public static Player createPlayer(String name) {
        
        if (name == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        NephisJourney.setPlayer(player); //save the player
        
        return player;
    }
    
}
