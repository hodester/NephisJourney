package nephisJourney.src.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import nephisJourney.NephisJourney;
import nephisJourney.src.control.ProgramControl;
import nephisJourney.src.exceptions.GameControlException;
import nephisJourney.src.model.Player;

/**
 * @author adamh_000
 */
public class StartProgramView extends View {

    ///protected final BufferedReader keyboard = NephisJourney.getInFile();
    ///protected final PrintWriter console = NephisJourney.getOutFile();
    public StartProgramView() {
        super("\n*******************************************************"
                + "\n*                                                     *"
                + "\n* The game is to cover the events which took place in *"
                + "\n* the first book of Nephi.  The basic premise is to   *"
                + "\n* use Nephi as the main character. He will follow the *"
                + "\n* trials and quests as outlined in the first book of  *"
                + "\n* Nephi.                                              *"
                + "\n*                                                     *"
                + "\n* Your task will be to guide Nephi and his family to  *"
                + "\n* the promised land.  You will need to complete a     *"
                + "\n* series of quests to reach the destination.  A       *"
                + "\n* successful completion of a quest or task will allow *"
                + "\n* you to move on to the next stage.  In order to win  *"
                + "\n* the game you must successfully complete all the     *"
                + "\n* stages.                                             *"
                + "\n*                                                     *"
                + "\n*******************************************************"
                + "\n"
                + "\nPlease enter your name: ");
    }

    @Override
    public boolean doAction(Object obj) {
        boolean doneFlag = false;
        String playerName = (String) obj;

        do {
            playerName = playerName.trim();
            if (playerName.toUpperCase().equals("Q")) {
                return true;
            }
            doneFlag = true;
        } while (!doneFlag);
       
       
        Player player = ProgramControl.createPlayer(playerName);
        if (player == null) {
            System.out.println("The players name is invalid");
        }
       
        // Display a personalized welcome message
        this.displayNextView(player);
        
        // Display the Main menu.
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
        
        return true;
    }
    
    public void displayNextView(Player player) {

        this.console.println("\n"
                + "*****************************************"
                + "\n    Welcome to Nephi's Journey,"           
                + "\n    " + player.getName()
                + "\n    We hope you have a fun adventure!"
                + "\n*****************************************");
    }

}
