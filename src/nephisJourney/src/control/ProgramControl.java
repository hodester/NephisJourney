
package nephisJourney.src.control;

import nephisJourney.NephisJourney;
import nephisJourney.src.model.Player;

/**
 *
 * @author Jenaca
 */
public class ProgramControl {
    
     public static Player createPlayer(String name) {
        
        if (name == null) {
            return null;
        }    
        
        Player player = new Player();
        player.setName(name);
        
        NephisJourney.setPlayer(player); // save the player
        
        return player;
    }
}
