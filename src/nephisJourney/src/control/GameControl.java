package nephisJourney.src.control;

import nephisJourney.NephisJourney;
import nephisJourney.src.model.Player;
import nephisJourney.src.view.GameMenuView;

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

    public static void createNewGame(Player player) {
        System.out.println("*** createNewGame function was called ***");

    }

}
